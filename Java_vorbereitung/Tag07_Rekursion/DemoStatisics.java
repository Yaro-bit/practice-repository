// https://syntaxsavvy.dev/langs/tools/commons_math/basic_apache_commons_math_usage/working_with_statistics/
package demo.kurs;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.moment.Mean;

public class DemoStatisics {

	public static void main(String[] args) {
		double[] data = { 1.0, 2.0, 3.0, 4.0, 5.0 };

		DescriptiveStatistics stats = new DescriptiveStatistics();

//		for (double d : data) {
//		    stats.addValue(d);
//		}

		for (int i = 0; i < data.length; i++) {
			stats.addValue(data[i]);
		}

		double mean2 = stats.getMean();
		double median = stats.getPercentile(50);
		double std = stats.getStandardDeviation();

		System.out.println(mean2);

		// Beispiel-Datenreihe
		double[] daten = { 10.5, 20.3, 30.2, 40.1, 50.0 };

		// Instanz des Mean-Objekts von Apache Commons Math
		Mean mean = new Mean();

		// Berechnung des Mittelwerts
		double mittelwert = mean.evaluate(daten);

		// Ausgabe des Mittelwerts
		System.out.println("Der Mittelwert der Datenreihe ist: " + mittelwert);

	}

}
