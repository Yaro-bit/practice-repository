package demo.kurs;

import java.util.ArrayList;
import java.util.List;

import java.util.Date;
import java.util.Objects;

public class WH {

	public static void main(String[] args) {
		// Code importieren
		
		// Was ist ein Attribute
		
		// Container Containerklasse, Collections, Samlungen
		Object[] objekte = new Object[12];
		objekte[0] = "A";
		objekte[1] = 123; // Autoboxing
		objekte[2] = new Integer(123);
		
		// List -> 99 proz
		List<Object> list = new ArrayList<>(); // LinkedList , Vector
		list.add("A");
		list.add(123);
		list.add(new Integer(123));
		
		
		// Set
		// HashSet
		// TreeSet
		
		// Map
		// HashMap
		// TreeMap
		
		// Refactoring
		
		// Defaultwerte -> überladen von Methoden, Openargs
		
		Date utilDate = new Date();
		
		System.out.println(utilDate.getClass().hashCode());
		System.out.println(Date.class.hashCode());
		
		System.out.println(Date.class == utilDate.getClass());
		
		java.sql.Date datum2 = new java.sql.Date(utilDate.getTime());
		
		
		
		Integer int1 = 129;  // = new Integer(12);  Integer.valueOf(12);
		Integer int2 = 129;
		
		
		System.out.println(int1 == int2);  // ??? 
		
		
		
		
		
	}
}

class Kunde {
	long id;  // Attribute, Eigenschaft, Instanzvariabe, Objectvariable
	String name;
	//... 
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kunde other = (Kunde) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	
}