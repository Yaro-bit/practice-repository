package demo.kurs;

import java.math.BigDecimal;
import java.util.Objects;

public class RechnungsPosistion implements Cloneable{
	int artikelnr;
	String artikelBez;
	BigDecimal preis;
	boolean isValid;
	
	/**
	 * @return the isValid
	 */
	public boolean isValid() {
		return isValid;
	}

	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	int menge;
	@Override
	public String toString() {
		return "RechnungsPosistion [artikelnr=" + artikelnr + ", artikelBez=" + artikelBez + ", preis=" + preis
				+ ", menge=" + menge + "]";
	}
	
	@Override
	public RechnungsPosistion clone()  {  // schattenKopie  -> tiefe Kopie ist besser
		RechnungsPosistion retValue = null;
		try {
			retValue = (RechnungsPosistion) super.clone();
		} catch (CloneNotSupportedException e) {
			//  darf leer sein
		}
		return retValue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artikelBez, artikelnr, menge, preis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RechnungsPosistion other = (RechnungsPosistion) obj;
		return Objects.equals(artikelBez, other.artikelBez) && artikelnr == other.artikelnr && menge == other.menge
				&& Objects.equals(preis, other.preis);
	}

	

	
}
