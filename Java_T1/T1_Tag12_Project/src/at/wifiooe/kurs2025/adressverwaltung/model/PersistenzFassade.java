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
	private PersistenzFassade(){
//		// adressen laden
		try {
			adressen = (List<PersonAdresse>) LoadStoreToolbox.laden(SAVE_FILENAME);
		} catch (Throwable e) {
			adressen = new ArrayList<PersonAdresse>();
			e.printStackTrace();
			System.out.println("Exception");
		}
	}
	public void shutDown() {
		LoadStoreToolbox.speichern((Serializable)adressen, SAVE_FILENAME);
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
	
//	public void delAdress(PersonAdresse adr) {
////		adressen.del(adr);
//	}
	
	public void SaveThis() {
		LoadStoreToolbox.speichern((Serializable) adressen, SAVE_FILENAME);
	}
	
	public void LoadThis() {
		LoadStoreToolbox.laden(SAVE_FILENAME);
	}

}
