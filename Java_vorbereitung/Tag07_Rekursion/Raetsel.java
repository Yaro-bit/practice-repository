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
//		System.out.println("1");
//		String raetsel = lesen("1");
//		System.out.println(raetsel);
//		raetsel = lesen(raetsel);
//		System.out.println(raetsel);
//		raetsel = lesen(raetsel);
//		System.out.println(raetsel);
//		raetsel = lesen(raetsel);
//		System.out.println(raetsel);
//		raetsel = lesen(raetsel);
//		System.out.println(raetsel);
		
		System.out.println(isOnlyOneZiffer("123"));
		System.out.println(isOnlyOneZiffer("1"));
		System.out.println(isOnlyOneZiffer("1111"));

		
	}

	private static String lesen(String kette) {  // int[] 
		String retValue = "";
		if(kette.length() == 1){
			return "1" + kette;
		}
		if(isOnlyOneZiffer(kette)) {
			return "" + kette.length() + kette.charAt(0);
		}
		
		String first = getFirst(kette);
		retValue = retValue + "" + first.length() + first.charAt(0);
		String last = getRest(kette);
		while (last.length() > 0) {
			first = getFirst(last);
			retValue = retValue + "" + last.length() + last.charAt(0);
			last = getRest(last);
			
		}
		return retValue;
	}

	private static String getRest(String kette) {
		// TODO Auto-generated method stub
		return kette.substring(getFirst(kette).length()-1);
	}

	private static String getFirst(String kette) {
		// TODO Auto-generated method stub
		return "";
	}

	private static boolean isOnlyOneZiffer(String kette) {
		boolean retValue = true;
		// 
		return retValue;
	}

}
