package demo.kurs;

// http://www-db.deis.unibo.it/~gmonti/docs/tij.pdf
//40. Follow a “canonical form” when creating a class for general-
//purpose use. Include definitions for equals( ), hashCode( ),
//toString( ), clone( ) (implement Cloneable, or choose some
//other object copying approach, like serialization), and implement
//Comparable and Serializable.
public class BruchZahl {
  // 1/4 , 1/2 ,....
	
	private int zähler;
	private int nenner = 1;   // <> 0
	
	
	public BruchZahl(int zähler, int nenner) {
		super();
		this.zähler = zähler;
		this.nenner = nenner;
	}
	
	public BruchZahl() {
		this.zähler = 0;
		this.nenner = 1;
	}
	
	public int getZähler() {
		return zähler;
	}

	public void setZähler(int zähler) {
		this.zähler = zähler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		// <> 0
		if(nenner != 0) {
			this.nenner = nenner;
		} else {
			// !!!!  log file, exception, 
			 throw new IllegalArgumentException("nenner muss ungleich 0 sein!");
		}
	}

/*	public BruchZahl mul(BruchZahl op2) {
		BruchZahl retValue = new BruchZahl();
		retValue.zähler = this.zähler * op2.zähler;
		retValue.nenner = this.nenner * op2.nenner;
		// -> kürzen
		return retValue;
		
	}
	
	
	

	public double toDouble() {
		//return ((double)zähler )/ nenner;
		//return (double)zähler / nenner;
		return zähler * 1.0 / getNenner();
	}

	@Override
	public String toString() {
		return "BruchZahl [" + zähler + "/" + getNenner() + "]";
	}
	*/
}
