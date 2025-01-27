package at.wifiooe.kurs2025.adressverwaltung.controller;

import at.wifiooe.kurs2025.adressverwaltung.model.PersistenzFassade;
import at.wifiooe.kurs2025.adressverwaltung.model.PersonAdresse;
import java.util.List;

import java.util.List;

public class Start { // MainController

	private PersistenzFassade fassade;
	public Object shutDown;

	public static void main(String[] args) {
		// Logging ....
		Start start = new Start();
		start.init();
	}

	public void init() {
		fassade = PersistenzFassade.getInstance();
	}

	public List<PersonAdresse> getAlleAdressen() {
		// PersonAdresse[], List<PersonAdresse>, Set<PersonAdresse>,Map<PersonAdresse>
		List<PersonAdresse> adressListe = fassade.getAlleAdressen();

		return adressListe;
	}

	public void addAdress(PersonAdresse adr) {
		fassade.addAdress(adr);
	}
	
	public void delAdress(PersonAdresse adr) {
		fassade.addAdress(adr);
	}

	public void shutDown() {
		fassade.SaveThis();
	}

	public void LoadThis() {
		fassade.LoadThis();		
	}

	public void doExit() {
	
		
	}
}
