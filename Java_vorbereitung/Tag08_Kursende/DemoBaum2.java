package demo.kurs;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

// https://learnsql.de/blog/was-ist-eine-rekursive-cte-in-sql/
// https://www.happycoders.eu/de/algorithmen/binaerbaum-java/
public class DemoBaum2 {

	public static void main(String[] args) {
//		Comparator com = new Comparator<T>() {
//
//			@Override
//			public int compare(T o1, T o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		Comparator com  = Collator.getInstance(Locale.GERMAN);
				
		Set<String> baum = new TreeSet<>(com);

         baum.add("Franz");
         baum.add("Anna");
         baum.add("Xaver");
         baum.add("Ä");
         baum.add("A");
         baum.add("Ö");
         baum.add("O");
         
         for (String wert : baum) {
			System.out.println(wert);
		}
         
         
		
	}

}
