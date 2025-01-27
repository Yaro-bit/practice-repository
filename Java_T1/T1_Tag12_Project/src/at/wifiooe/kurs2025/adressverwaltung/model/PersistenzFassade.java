package at.wifiooe.kurs2025.adressverwaltung.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class PersistenzFassade {
private static final String SAVE_FILENAME = "MeinFile.bin";
// CRUD 
	private List<PersonAdresse> adressen = new ArrayList<PersonAdresse>();
	private static PersistenzFassade instance = new PersistenzFassade();

	// Fassade + Singleton
	private PersistenzFassade() {
		// adressen laden
	}

	public static PersistenzFassade getInstance() {
		return instance;
	}

	public List<PersonAdresse> getAlleAdressen() {
		return (List<PersonAdresse>) LoadStoreToolbox.deepCopy((Serializable) adressen);
	}

	public void addAdress(PersonAdresse adr) {
		adressen.add(adr);
	}
	
	public void delAdress(PersonAdresse adr) {
//		adressen.del(adr);
	}
	
	public void SaveThis() {
		LoadStoreToolbox.speichern((Serializable) adressen, SAVE_FILENAME);
	}
	
	public void LoadThis() {
		LoadStoreToolbox.laden(SAVE_FILENAME);
	}

}
