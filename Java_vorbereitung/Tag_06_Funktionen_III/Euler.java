package demo.kurs;

public class Euler {

	public static void main(String[] args) {
//		System.out.println(isPalindrom("902209"));
//		System.out.println(isPalindrom("902209"));
//		System.out.println(isPalindrom("902209"));
//		System.out.println(isPalindrom("902209"));
//		System.out.println(isPalindrom("9020209"));
//		System.out.println(isPalindrom("9021209"));
//		System.out.println(isPalindrom("9999999"));
//		System.out.println(isPalindrom("11111111111"));
int max = 1;		
for (int i = 999; i >= 100; i--) {
	for (int j = 999; j >= 100; j--) {
		//System.out.println(i*j);
		if(isPalindrom("" + ((long)i*(long)j))) {
			System.out.println((long)i*(long)j);
			if((long)i*(long)j > max) {
				max = i*j;
			}
			//return;
		}
	}
}
System.out.println(max);	

	}

	private static boolean isPalindrom(String i) {
		//System.out.println(i);
		for (int j = 0; j <= i.length()/2; j++) {
			if(i.charAt(j) != i.charAt(i.length()-1-j)) {
				return false;
			}
		}
		return true;
	}

}
