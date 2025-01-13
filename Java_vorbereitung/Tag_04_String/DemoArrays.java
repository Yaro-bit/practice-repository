package demo;

import java.util.Arrays;

public class DemoArrays {

	public static void main(String[] args) {
		// typ name
		int zahl;
		String zeile;
		zeile = " ich bin ein objekt   ";
		zeile = new String(" ich bin auch ein objekt");
		zeile = null;
		
		// typ[] arrayVonTyp   ->     int a,b[],c; :-(
		int[] intArray;
		intArray = new int[100];
		
		String zeileIntArray = Arrays.toString(intArray);
		System.out.println(zeileIntArray);
		
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.println(intArray[i]);
//		}
		String[] namensArray = {"anna" , "josef", "hugo"};
		for (int i = 0; i < namensArray.length; i++) {
			System.out.println(namensArray[i]);
		}
		
		String zeileNamensArray = Arrays.toString(namensArray);
		System.out.println(zeileNamensArray);
		
		//Object[] objArray = (Object[])intArray;
		
		Object[] objArray = new Object[5];
		objArray[0] = "";
		objArray[1] = Integer.valueOf(3); // autobox
		
		// ##############################################
		
		// typ[] array
		// typ -> int[]
		int[][] int2Dim;
		int2Dim = new int[3][2]; // 6 int schachteln
		int2Dim[0][0] = 1;
		int2Dim[2][1] = 10;
		
		for (int i = 0; i < int2Dim.length; i++) {
			System.out.println(int2Dim[i]);
			for (int j = 0; j < int2Dim[i].length; j++) {
				System.out.println(int2Dim[i][j]);
			}
		}
		
		
		for (int i = 0; i < int2Dim.length; i++) {  // Buch Seite 98
			//System.out.println(int2Dim[i]);
//			for (int j = 0; j < int2Dim[i].length; j++) {
//				System.out.println(int2Dim[i][j]);
//			}
			System.out.println(Arrays.toString(int2Dim[i]));
		}
		
//		DemoArrays demo = new DemoArrays();
//		System.out.println(demo);
		
		String[] strzeile = {"erste","zeile"};
		String[][] absatz = {strzeile,{"zweite","zeile"},{"drite","zeile"}};
		
		
		String[][] absatz2 = new String[3][];
		absatz2[0] = strzeile;
		
		absatz2[1] = new String[2];
		absatz2[1][0] = "zweite";
		absatz2[1][1] = "zeile";
		
		absatz2[2] = new String[2];
		absatz2[2][0] = "drite";
		absatz2[2][1] = "zeile";
	}

	
	
	
}
