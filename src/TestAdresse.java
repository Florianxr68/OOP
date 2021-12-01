//Main-Methode -> Def zweier Objekte mit new-Operator durch Übergabe aktueller Parameterwerte
//Var paul und marta sind Objektvars und ihre Werte sind Instanzen oder objekte der Klasse Adresse
public class TestAdresse {
    public static void main(String[] args) {
        Adresse paul_mueller = new Adresse("Schützestraße", 10, 42283, "Wuppertal");
        Adresse marta_musterfrau = new Adresse("Liebstraße", 134, 78534, "Schwabingen");
        System.out.println(paul_mueller.getAdresse());
        System.out.println(marta_musterfrau.getAdresse());
    }
}
