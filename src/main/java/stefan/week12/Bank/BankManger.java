package stefan.week12.Bank;


import java.sql.SQLException;

public class BankManger {


    public static void main(String[] args) throws SQLException {

        DatenBaseManger databaseManager = new DatenBaseManger();
        databaseManager.dropTables();
        databaseManager.createTables();
        Kunde k1 = new Kunde("Anton");
        Kunde k2 = new Kunde("Alfred");

        Konten b1 = new Konten(58, 2);
        Konten b2 = new Konten(100, 3);


        databaseManager.insertKunde(k1);
        databaseManager.insertKunde(k2);
        databaseManager.insertKonto(b1);
        databaseManager.insertKonto(b2);
        printfunktion(k1, k2, b1, b2);
        databaseManager.kundeKontonummerVerbindung(b1, k1);
        databaseManager.kundeKontonummerVerbindung(b2, k2);
    }

    public static void printfunktion(Kunde k1, Kunde k2, Konten b1, Konten b2) {
        System.out.println("Before INSERT Name");
        System.out.println(k1);
        System.out.println(k2);
        System.out.println("After INSERT Name");
        System.out.println("After INSERT Kontostand: " + b1.getKontostand() + "  kontennummer: " + b1.getKontenummer());
        System.out.println("After INSERT Kontostand: " + b2.getKontostand() + "  kontennummer: " + b2.getKontenummer());


    }
}


