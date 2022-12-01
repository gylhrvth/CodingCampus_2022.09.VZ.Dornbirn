package milan.week11.bank.model;

import milan.week11.bank.Database;

import java.sql.SQLException;

public class BankTestExample {
    public static void main(String[] args) {

        try {
            DatabaseManager.getInstance().dropTables();
            DatabaseManager.getInstance().createTables();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Kunde kunde1 = new Kunde("Stefan");
        Kunde kunde2 = new Kunde("Viktor");
        Kunde kunde3 = new Kunde("Batuhan");
        Kunde kunde4 = new Kunde("Milan");
        Kunde kunde8 = new Kunde("Milan");
        Kunde kunde9 = new Kunde("Milan");
        Kunde kunde10 = new Kunde("Milan");
        Kunde kunde5 = new Kunde("Patric");
        Kunde kunde6 = new Kunde("Martin");
        Kunde kunde7 = new Kunde("Franky");
        Konto konto1 = new Konto(kunde1, 435001, 120.11);
        Konto konto2 = new Konto(kunde2, 435002, 1654.45);
        Konto konto3 = new Konto(kunde3, 435003, 800.57);
        Konto konto4 = new Konto(kunde4, 435004, 10.5);
        Konto konto5 = new Konto(kunde5, 435005, 623.25);
        Konto konto6 = new Konto(kunde6, 435006, 1658.85);
        Konto konto7 = new Konto(kunde7, 435007, 563.78);
        kunde2.addKonto(konto1);
        kunde1.deleteKunde();
        kunde2.deleteKunde();

        try {
            System.out.println(DatabaseManager.getInstance().getKundeByKundenNummmer(7));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            for (Kunde x : DatabaseManager.getInstance().getKundeByName("Milan")) {
                System.out.println(x);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
