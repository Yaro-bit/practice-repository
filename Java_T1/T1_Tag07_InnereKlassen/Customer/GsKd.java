package Customer;

public class GsKd extends Kunde {
    int uid;

    public GsKd(String name, int uid) {
        this.name = name;
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "GsKd [name=" + name + "] UID: " + uid;
    }
}
