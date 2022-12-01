package milan.week11.bank.model;

import milan.week11.bank.Database;

import java.sql.SQLException;

public class BankTestExample {
    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Stefan");
        Konto konto1 = new Konto(435001,120.11);

        try {
            Database db = new Database();
            db.connect();
            DatabaseManager dm = new DatabaseManager(db);
            //dm.createTables();
            //dm.dropTables();
            dm.insertKonto(konto1);

//            System.out.println("Before insert:");
//            System.out.println(kunde1);
//            dm.insertKunde(kunde1);
//            System.out.println("After insert:");
//            System.out.println(kunde1);

            for (Kunde x : dm.getKunde()) {
                System.out.println(x);
                if (x.getKundenNummer() == 4){
                    x.setName("Stefan");
                    dm.updateKunde(x);
                }
            }
            //dm.getKunde();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
