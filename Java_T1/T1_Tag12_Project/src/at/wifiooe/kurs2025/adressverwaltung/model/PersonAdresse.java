package at.wifiooe.kurs2025.adressverwaltung.model;

import java.io.Serializable;

public class PersonAdresse implements Serializable {

	private String vorname;
	private String nachname;
	private String straße;
	private int nr;
	private int plz;
	private String ort;
	private String land;

	public PersonAdresse(String vorname, String nachname, String straße, int nr, int plz, String ort, String land) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.straße = straße;
		this.nr = nr;
		this.plz = plz;
		this.ort = ort;
		this.land = land;
	}

	public String getVorname() {
		return vorname;
	}
	
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStraße() {
		return straße;
	}

	public void setStraße(String straße) {
		this.straße = straße;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String toString() {
		return "PersonAdresse [vorname=" + vorname + ", nachname=" + nachname + ", straße=" + straße + ", nr=" + nr
				+ ", plz=" + plz + ", ort=" + ort + ", land=" + land + "]";
	}

}
