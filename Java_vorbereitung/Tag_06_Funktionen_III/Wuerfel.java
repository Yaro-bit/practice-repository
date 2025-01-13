package demo.kurs;

import java.util.Arrays;
import java.util.Iterator;

public class Wuerfel {

	public static void main(String[] args) {

	 // test();	
       int augen = getWurf(); // 1-6 // enum
       
       int augenSumme = 0;
       int anzahlAugenEins = 0;
       int[] anzahlAugen = new int[7];
       
       for(int i = 1; i<= 1_000_000; i++) {
    	   // 100 würfeln
    	   // anzahl augen zählen
    	   augen = getWurf();
    	   augenSumme = augenSumme + augen;
//    	   if(augen == 1) {
//    		   anzahlAugenEins++;
//    	   }
    	   anzahlAugen[augen]++;
       }

       System.out.println(augenSumme);
       //System.out.println(anzahlAugenEins);
       System.out.println(Arrays.toString(anzahlAugen));
       System.out.println(anzahlAugen[1] * 1.0 / 1_000_000);
	}

	private static void test() {
		System.out.println(getWurf());
		System.out.println(getWurf());
		System.out.println(getWurf());
		System.out.println(getWurf());
		System.out.println(getWurf());
			
	}

	private static int getWurf() {
		int augen =(int) ((Math.random()* 6)+ 1);
		return augen;
	}

}
