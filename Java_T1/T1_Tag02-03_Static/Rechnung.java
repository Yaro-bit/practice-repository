package demo.kurs;

// rng  ... Rechnung
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Rechnung {
	// nummer
	private int rngNummer;
	// summe
	private BigDecimal rngSumme;
	// empfänger ( name adresse)
	// Kunde kundeEmpfänger;
	// pos ??
	// RechnungsPosistion pos; // Array, List, Set -> List
	private List<RechnungsPosistion> rngPostionen = new ArrayList<RechnungsPosistion>();
	// ..

	public Rechnung() {
		super();
	}

	/**
	 * @return the rngNummer
	 */
	public int getRngNummer() {
		return rngNummer;
	}

	/**
	 * @param rngNummer the rngNummer to set
	 */
	public void setRngNummer(int rngNummer) {
		this.rngNummer = rngNummer;
	}

	/**
	 * @return the rngSumme
	 */
	public BigDecimal getRngSumme() {
		return rngSumme;
	}

	/**
	 * @param rngSumme the rngSumme to set
	 */
	public void setRngSumme(BigDecimal rngSumme) {
		this.rngSumme = rngSumme;
	}

	@Override
	public String toString() {
		return "Rechnung [rngNummer=" + rngNummer + ", rngSumme=" + rngSumme + ", rngPostionen=" + rngPostionen + "]";
	}

	public void add(RechnungsPosistion pos) {
		// RechnungsPosistion inmutable
		// RechnungsPosistion copy machen
		
		rngPostionen.add(pos.clone());  // RechnungsPosistion(RechnungsPosistion copy),copy(), deepCopy(), ...
		aktualisireRechnungsSumme();
		
	}

	private void aktualisireRechnungsSumme() {
		BigDecimal temp = new BigDecimal(0);
		for (RechnungsPosistion rechnungsPosistion : rngPostionen) {
			System.out.println(rechnungsPosistion);
			temp = temp.add(rechnungsPosistion.preis.multiply(new BigDecimal(rechnungsPosistion.menge)));
		}
		
		rngSumme = temp;
	}

	
	
}
