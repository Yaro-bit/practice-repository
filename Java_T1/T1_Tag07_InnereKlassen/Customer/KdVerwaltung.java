package Customer;

import java.util.ArrayList;

public class KdVerwaltung {

    public static void main(String[] args) {
        ArrayList<Kunde> kundenListe = new ArrayList<Kunde>();
        
        kundenListe.add(new GsKd("duteln", 123));
        kundenListe.add(new GsKd("duteln2", 122));
        kundenListe.add(new GsKd("nix", 128));
        kundenListe.add(new PvKd("WIFI"));
        kundenListe.add(new PvKd("BFI"));
        kundenListe.add(FabrikKunde.getPvKd());
        printKundenListe(kundenListe);
        
            }

    private static void printKundenListe(ArrayList<Kunde> kundenListe) {
        for (int i = 0; i < kundenListe.size(); i++) {
            System.out.println(kundenListe.get(i));
        }
    }

}
