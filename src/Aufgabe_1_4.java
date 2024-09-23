public class Aufgabe_1_4 {

    public static void main(String[] args) {
        // Start
        int stundenBeginn = IOTools.readInteger("Geben Sie die Stunden des Beginns der Parkzeit ein: ");
        int minutenBeginn = IOTools.readInteger("Geben Sie die Minuten des Beginns der Parkzeit ein: ");

        // Abfahrt
        int stundenEnde = IOTools.readInteger("Geben Sie die Stunden des Endes der Parkzeit ein: ");
        int minutenEnde = IOTools.readInteger("Geben Sie die Minuten des Endes der Parkzeit ein: ");

        // Umwandlung der Uhrzeiten in Minuten
        int gesamtBeginn = stundenBeginn * 60 + minutenBeginn;
        int gesamtEnde = stundenEnde * 60 + minutenEnde;

        // Parkdauer Minuten
        int parkdauerInMinuten = gesamtEnde - gesamtBeginn;


        // Stunden
        int volleStunden = parkdauerInMinuten / 60;
        int restMinuten = parkdauerInMinuten % 60;

        // Kosten
        int angefangeneStunden = (restMinuten > 0) ? volleStunden + 1 : volleStunden;
        double parkgebuehr = angefangeneStunden * 1.50;

        // Ausgabe der Ergebnisse
        System.out.println("Parkdauer: " + parkdauerInMinuten + " Minuten");
        System.out.println("Parkgebühr: " + parkgebuehr);
    }
}
