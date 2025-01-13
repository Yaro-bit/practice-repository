package Customer;

public abstract class Kunde {
    String name;

    public Kunde() {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kunde [name=" + name + "]";
    }

	public int compareTo(Kunde o) {
		return 0;
	}
}
