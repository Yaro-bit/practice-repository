package demo.kurs;

public class Raetsel {

	public static void main(String[] args) {
		// 1
		// 11
		// 21
		
		
		// 3
		// 13
		// 1113
		// 3113
		System.out.println("1");
		String raetsel = lesen("1");
		System.out.println(raetsel);
		raetsel = lesen(raetsel);
		System.out.println(raetsel);
		raetsel = lesen(raetsel);
		System.out.println(raetsel);
		raetsel = lesen(raetsel);
		System.out.println(raetsel);
		raetsel = lesen(raetsel);
		System.out.println(raetsel);
		
//		System.out.println(isOnlyOneZiffer("123"));   // false
//		System.out.println(isOnlyOneZiffer("1"));     // true
//		System.out.println(isOnlyOneZiffer("1111"));  // true 
//		System.out.println(isOnlyOneZiffer(""));
		
//		System.out.println(getFirst("123"));        // "1"
//		System.out.println(getFirst("111122222")); //  "1111"
//		System.out.println(getFirst("111111"));       // "111111" 
//		System.out.println(getFirst(""));           // ""

//		System.out.println(getRest("123"));        // "23"
// 		System.out.println(getRest("111122222")); //  "22222"
// 		System.out.println(getRest(""));           // ""
	
	}

	private static String lesen(String kette) {
		String retValue = "";
		if (kette.length() == 1) {
		return "1" + kette;
		}
		if (isOnlyOneZiffer(kette)) {
		return "" + kette.length() + kette.charAt(0);
		}
		String first = "";
		while (kette.length() > 0) {
		first = getFirst(kette);
		retValue = retValue + "" + first.length() + first.charAt(0);
		kette = getRest(kette);
		}
		return retValue;
		}

	private static String getRest(String kette) {
		String retValue;
		
		String first = getFirst(kette);
		int len = first.length();
		retValue = kette.substring(len);
		
		return retValue;
	//	return kette.substring(getFirst(kette).length());
	}

	private static String getFirst(String kette) {
		int len = 0;
		
		if(isOnlyOneZiffer(kette)) {
			return kette;
		}
		for (int i = 0; i < kette.length(); i++) {
			if(kette.charAt(0)!= kette.charAt(i)) {
				len = i;
				break;
			}
		}
		return kette.substring(0, len);
	}

	private static boolean isOnlyOneZiffer(String kette) {
		
		for (int i = 0; i < kette.length(); i++) {
			if(kette.charAt(0)!= kette.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}

}
