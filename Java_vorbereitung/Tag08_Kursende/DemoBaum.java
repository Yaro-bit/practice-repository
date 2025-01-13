package demo.kurs;

public class DemoBaum {

	public static void main(String[] args) {
		// List ArrayList, LinkedList
		// Set TreeSet, HashSet
		// Map TreeMap, HashMap

		Node wurzel = new Node();
		wurzel.value = "Wurzel";
		wurzel.left = new Node();

		printValue(wurzel);
		
		summeN(10);

	}

	private static void printValue(Node wurzel) {
		if(wurzel == null) {
			return;
		}
		printValue (wurzel.left);
		printValue (wurzel.right);
		System.out.println(wurzel.value);
	}

	// O(n)  https://www.dbs.ifi.lmu.de/Lehre/NFInfoSW/WS0708/Skript/Folien09.pdf
	private static int summeN(int n) {
		int summe = 0;
		for (int j = 1; j <= n; j++) {
			summe += j;
		}
		return summe;
	}

	// O(1)
	private static int summeN_2(int n) {
		return n * (n + 1) / 2;
	}

}

class Node {

	Object value;
	Node left;
	Node right;

}