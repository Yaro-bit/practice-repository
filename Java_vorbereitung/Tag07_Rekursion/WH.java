package demo.kurs;

import java.util.ArrayList;
import java.util.List;

public class WH {

	public static void main(String[] args) {
		// 
        Object[] objArray = new  Object[10];
	     	
        Kunde kd = new Kunde();
        kd.id = 1;
        kd.name = "Wifi_name";
        
        objArray[0]  = "String";
        objArray[1] = Integer.valueOf(123);
        objArray[2] = kd;
        objArray[3] = new StringBuffer("bin ein änderbare Zeichenkette");
        
        for (int i = 0; i < objArray.length; i++) {
			System.out.println(objArray[i]);
		}
        
        ArrayList liste = new ArrayList(); // ohne <> Object
        ArrayList<Object> liste2 = new ArrayList<Object>(); //  <> Object 
        
        List<Object> liste3 = new ArrayList<>(); //  <> Object 
    
	}

}
class KundeX {
	int id;
	String name;
	String vorname;
	List<String> emails;
	
	@Override
	public String toString() {
		return "Kunde [id=" + id + ", name=" + name + ", vorname=" + vorname + "]";
	}


	
}
