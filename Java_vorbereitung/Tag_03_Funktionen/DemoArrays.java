package demo.wifi;

import java.util.Arrays;

public class DemoArrays {
public static void main(String[] args) {
	// typ name
	// 1000 int vars
	int a000;
	int a001;
	
	
	int a999;
	
	a000 = 1;
	// ...
	
	// typ []  -> arrayTyp 
	int[] intArray;
	intArray = new int[1000]; 
	intArray[0] = 1;
	
	intArray[1] = 1;
	intArray[2] = 1;
	
	// ...
	intArray[999] = 1;
	
	for (int i = 0; i < intArray.length; i++) {
		intArray[i] = 1;
	}
	int i = 0;
	//for (; i < intArray.length; ) {
	while ( i < intArray.length ) {
		intArray[i] = 1;
		i++;
	}
	
	i = 0;
//	while ( i < intArray.length ) {
//		System.out.println(intArray[i]);
//	}
	
	System.out.println(Arrays.toString(intArray));
	
}

}
