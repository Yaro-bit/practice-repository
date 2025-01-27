package at.wifiooe.kurs2025.adressverwaltung.control;

import java.util.List;

import at.wifiooe.kurs2025.adressverwaltung.controller.Start;
import at.wifiooe.kurs2025.adressverwaltung.model.PersonAdresse;

public class TestStart {

	public static void main(String[] args) {
		Start main = new Start();
		main.init();
		
		 List<PersonAdresse> list = main.getAlleAdressen();
		 System.out.println(list.size());
		

		 
		PersonAdresse pers = new PersonAdresse("A", "B", "C", 0, 0, "D", "E");
		main.addAdress(pers); 
		  
		list = main.getAlleAdressen();
		  System.out.println(list.size());
		 
		  main.shutDown();
		  
		  list = main.getAlleAdressen();
		  System.out.println(list.size());
		  
		  main.LoadThis();
		  list = main.getAlleAdressen();
		  System.out.println(list.size());
	}

}
