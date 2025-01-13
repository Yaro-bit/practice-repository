package demo.kurs;

public class Euler {

	public static void main(String[] args) {
		int lsg = euler_1(1000);
		System.out.println(lsg);

		boolean isPrime = isPrime(123);
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(6));
		System.out.println(isPrime(13));
		System.out.println(isPrime(16));


	}

	private static boolean isPrime(int testZahl) {
		boolean isPrim = true;
		int v = 2;
		// %  
//		if(testZahl % 2 == 0) {
//			return false;
//		}
//		if(testZahl % 3 == 0) {
//			return false;
//		}	
//		// ...
//		if(testZahl % v == 0) {
//			return false;
//		}
//		v++;
//		if(testZahl % v == 0) {
//			return false;
//		}	
//		v++;
		v = 2;
		while(v <= Math.sqrt(testZahl)) {
			if(testZahl % v == 0) {
				return false;
			}	
			v++;
		}
		
		return true;
	}

	private static int euler_1(int n) {
		int summe = 0;
		int i = 1;
		// 1
		i++;
		// 2
		i++;
		// 3
		summe = summe + 3;
		// 4

		// 5
		summe = summe + 5;

		// 6
		if (6 % 3 == 0 || 6 % 5 == 0) {
			summe = summe + 6;
		}
		// 7
		if (7 % 3 == 0 || 7 % 5 == 0) {
			summe = summe + 7;
		}

		// 8

		// 9
		if (9 % 3 == 0 || 9 % 5 == 0) {
			summe = summe + 9;
		}
		// 10

		// +++++++++++++++++++++++++++++

		summe = 0;
		i = 0;
		// 1
		i++;
		if (i % 3 == 0 || i % 5 == 0) {
			summe = summe + i;
		}
		// 2
		i++;
		if (i % 3 == 0 || i % 5 == 0) {
			summe = summe + i;
		}
		// ..

		summe = 0;
		for (i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				summe = summe + i;
			}
		}

		return summe;
	}

}
