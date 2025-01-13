package Customer;

public class FabrikKunde {

	public static Kunde getPvKd() {
		// return new PrivatKunde();
		return new Kunde() {
			{
					//mock ersatz für konstruktor, dieser wird hier umgangen
			}
			@Override
			public int compareTo(Kunde o) {
				return 0;
			}};
	}

	@Override
	public String toString() {
		return "FabrikKunde []";
	}

}
