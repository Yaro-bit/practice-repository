package wifi.kurs;

import java.util.Iterator;

public class Stringverküpfungen {

	public static void main(String[] args) {
		String str = "";
        
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < 10000000; i++) {
			str += i;
			//sb.append(i);
		}
		str = sb.toString();
		System.out.println(str);
	}

}
