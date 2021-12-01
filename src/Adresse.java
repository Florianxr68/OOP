public class Adresse {

    //Instanzvariablen -> Def der Instanzvars der Klasse "Adresse" mit den Datentypen String und int
    private String street;
    private int number;
    private int postalcode;
    private String placeOfResidence;

    //Konstruktoren -> Initialisieren die Instanzvars mit den übergebenen Parametern
    public Adresse(String str, int nr, int pc, String por) {
        street = str;
        number = nr;
        postalcode = pc;
        placeOfResidence = por;

        if (pc >= 10000 && pc <= 99999)
            postalcode = pc;
        else
            System.out.println("Wrong postalcode!!!");
    }

    //public Adresse(String str, int nr) { -> definiert Adressen für Personen aus Schwabingen mit Straßename und Nummer
    // street = str;
    // number = nr;
    // postalcode = 78534;
    // placeOfResidence = "Schwabingen";}

    //Methoden -> Def einer Methode zur Rückgabe einer vollständigen Adresse
    public String getAdresse() {
        return street + " " + number + " , " + postalcode + " " + placeOfResidence;
    }
}
