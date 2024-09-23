public class Aufgabe_1_3 {

    public static void main(String[] args) {
        // Eingabe  kapitals
        double kapital = IOTools.readDouble("Geben Sie Ihr Grundkapital K0 ein: ");

        // Eingabe Zinssatzes
        double zins = IOTools.readDouble("Geben Sie den Zinssatz p ein (in Prozent): ");

        // Eingabe Jahre
        int jahre = IOTools.readInteger("Geben Sie die Anzahl der Jahre j ein: ");

        // Berechnung Wert
        double kapitalNachJahren = kapital * Math.pow(1 + (zins / 100), jahre);

        // Ausgabe des Ergebnisses
        System.out.println("Nach " + jahre + " Jahren beträgt Ihr Kapital: " + kapitalNachJahren;

    }
}
