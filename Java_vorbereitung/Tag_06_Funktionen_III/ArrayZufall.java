package demo.kurs;

import java.util.Arrays;

public class ArrayZufall {
	public static void main(String[] args) {
		// 
		int[] intArray = new int[10];
		
		initRandom(intArray);

//		System.out.println(Arrays.toString(intArray));
//		
//		int min = 100;
//		// min suchen in array
//		if(intArray[0] < min) {
//			min = intArray[0];
//		}
//		
//		if(intArray[1] < min) {
//			min = intArray[1];
//		}
//		if(intArray[2] < min) {
//			min = intArray[2];
//		}
		
		int min = searchMin(intArray);
		
		double mw = mittelWert(intArray);
		
		
		
		
		System.out.println(min);
		
	}

	private static double mittelWert(int[] intArray) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int searchMin(int[] intArray) {
		int min;
		min = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if(intArray[i] < min) {
				min = intArray[i];
			}
		}
		return min;
	}

	public static void initRandom(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()*100);  // [0..1[
		}
	}

}
