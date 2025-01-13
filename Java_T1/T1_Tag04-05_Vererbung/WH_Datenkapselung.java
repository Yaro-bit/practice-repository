package wifi.kurs;

import java.io.Serializable;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

public class WH_Datenkapselung {

	public static void main(String[] args) {
		// Testcode
		Person p1 = new Person("Franz");	
		Person p2 = new Person("Franz");	
		Person p3 = p1;
		
		System.out.println(p1==p2);  // ??   == 
		System.out.println(p1==p3);
		System.out.println(p2==p3);
		
		System.out.println(p1.equals(p2));  // ??   == 
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		
		System.out.println(p1.hashCode());  // ??   == 
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		// List, Set
		Set<Person> personen = new HashSet<>();
		personen.add(p1);
		personen.add(p2);
		personen.add(p3);
       
		System.out.println(personen.size());
		 
		List<Person> personenListe = new ArrayList<Person>();
		personenListe.add(p1);
		personenListe.add(p2);
		personenListe.add(p3);
		personenListe.add(p1);
		personenListe.add(new Person("Anton"));
		personenListe.add(new Person("Änton"));
		
		Collections.sort(personenListe);
		System.out.println(personenListe.size());
		
		for (Person person : personenListe) {
			System.out.println(person);
		}
		
		}
	
	    
	

}
//http://www-db.deis.unibo.it/~gmonti/docs/tij.pdf
//40. Follow a “canonical form” when creating a class for general-
//purpose use. Include definitions for equals( ), hashCode( ),
//toString( ), clone( ) (implement Cloneable, or choose some
//other object copying approach, like serialization), and implement
//Comparable and Serializable.

class Person implements Serializable,Cloneable,Comparable<Person> {
	private static int maxKey = 1;
	private int id;
	private String name;

	static {
		// intialisierer
		// maxKey 
	}
	
	public Person() {
		this("nicht definiert");
		
	}
	public Person( String name) {
		super();
		this.id = maxKey;
		maxKey++;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
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
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person o) {
		int retVale = 0;
		// retVale = this.name.compareTo(o.name);
		Collator c = Collator.getInstance(Locale.GERMAN);
		retVale = c.compare(this.name, o.name);
		return retVale;
	}
}
