package demo.kurs;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Sortieren {

	public static void main(String[] args) {
		int[] zahlen = {1,5,-4,3,2};
		
		
		Arrays.sort(zahlen);
		
		System.out.println(Arrays.toString(zahlen));
		
		
		String[] namen = {"xyz","A","B","Ä","Ö"};
		
		Comparator comp = Collator.getInstance(Locale.GERMAN);
		Arrays.sort(namen,comp );
		System.out.println(Arrays.toString(namen));
		
	}

}
