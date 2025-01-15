package demo.inner;

import java.util.ArrayList;
import java.util.List;

public class Kopf {
	private int y = 5;
	List<Detail> details = new ArrayList<Detail>();

	private class Detail {
		public Detail() {
			System.out.println(y);
		}

		public Detail(String productName) {
			// TODO Auto-generated constructor stub
		}
	}

	public void add(String productName) {
		details.add(new Detail(productName));
	}

	public static void main(String[] args) {
		Kopf k = new Kopf();
		Detail d = k.new Detail();
	}
}
