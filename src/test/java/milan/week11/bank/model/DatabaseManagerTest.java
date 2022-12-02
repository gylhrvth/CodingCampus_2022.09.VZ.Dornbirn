package milan.week11.bank.model;

import milan.week11.bank.Database;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseManagerTest {

    private Database database;

    private DatabaseManager databaseManager;

    @BeforeEach
    public void setUp() throws SQLException {
        try {
            DatabaseManager.getInstance().dropTables();
        } catch (SQLException exception) {
            //noop
        }
        try {
            DatabaseManager.getInstance().createTables();
        } catch (SQLException exception) {
            //noop
        }
    }
//    @AfterEach
//    public void tearDown() {
//        try {
//            if (database.getConnection() != null) {
//                database.disconnect();
//            }
//        } catch (SQLException exc) {
//            //noop
//        }
//    }

    @Test
    void testCreateSchema() {
        //Delete scheme
        try {
            DatabaseManager.getInstance().dropTables();
        } catch (SQLException exception) {
            //noop
        }
        try {
            DatabaseManager.getInstance().createTables();
        } catch (SQLException exception) {
            //noop
        }
    }

    @Test
    void testDropTablesSchema() {
        try {
            DatabaseManager.getInstance().dropTables();
        } catch (SQLException exception) {
            Assertions.fail("Dropping tables failed: " + exception.getMessage());
        }
        try {
            DatabaseManager.getInstance().dropTables();
            Assertions.fail("Dropping tables should not succed!");
        } catch (SQLException exception) {
            //nnop
        }
    }

    @Test
    void testInsertKunde() {
        Kunde k1 = new Kunde("Milan");
        try {
            DatabaseManager.getInstance().insertKunde(k1);
        } catch (SQLException exception) {
            Assertions.fail("Insert failed: " + exception.getMessage());
        }
    }

    @Test
    void testUpdateKunde() {
        //TODO missing Implementation
    }


    @Test
    void testDeleteKunde() {
        try {
            DatabaseManager.getInstance().insertKunde(new Kunde("Milan"));
            DatabaseManager.getInstance().insertKunde(new Kunde("Batuhan"));
            DatabaseManager.getInstance().insertKunde(new Kunde("Viktor"));
            Kunde k1 = new Kunde("Stefan");
            DatabaseManager.getInstance().insertKunde(k1);
            DatabaseManager.getInstance().deleteKunde(k1);
            DatabaseManager.getInstance().insertKunde(new Kunde("Franky"));

        } catch (SQLException exception) {
            //noop
        }
        try {
            List<Kunde> kundenListe = DatabaseManager.getInstance().getKunde();

            Assertions.assertEquals(4, kundenListe.size());

        } catch (SQLException exception) {
            Assertions.fail("Kunden retrieval failed: " + exception.getMessage());
        }
    }


    @Test
    void testGetKunde() {
        try {
            DatabaseManager.getInstance().insertKunde(new Kunde("Milan"));
            DatabaseManager.getInstance().insertKunde(new Kunde("Batuhan"));
            DatabaseManager.getInstance().insertKunde(new Kunde("Viktor"));
        } catch (SQLException exception) {
            //noop
        }
        try {
            List<Kunde> kundenListe = DatabaseManager.getInstance().getKunde();

            Assertions.assertEquals(3, kundenListe.size());

            Assertions.assertEquals("Milan", kundenListe.get(0).getName());
            Assertions.assertEquals("Batuhan", kundenListe.get(1).getName());
            Assertions.assertEquals("Viktor", kundenListe.get(2).getName());
        } catch (SQLException exception) {
            Assertions.fail("Kunden retrieval failed: " + exception.getMessage());
        }
    }

    @Test
    void testGetKundeByName() {
        try {
            DatabaseManager.getInstance().insertKunde(new Kunde("Milan"));
            DatabaseManager.getInstance().insertKunde(new Kunde("Batuhan"));
            DatabaseManager.getInstance().insertKunde(new Kunde("Milan"));
        } catch (SQLException exception) {
            //noop
        }
        try {
            List<Kunde> kundenListe = DatabaseManager.getInstance().getKundeByName("Milan");

            Assertions.assertEquals(2, kundenListe.size());

            Assertions.assertEquals("Milan", kundenListe.get(0).getName());
            Assertions.assertEquals("Milan", kundenListe.get(1).getName());

        } catch (SQLException exception) {
            Assertions.fail("Kunden retrieval failed: " + exception.getMessage());
        }
    }

    @Test
    void testGetKundeByKundenNummmer() {
        try {
            DatabaseManager.getInstance().insertKunde(new Kunde("Milan"));
            DatabaseManager.getInstance().insertKunde(new Kunde("Batuhan"));
            DatabaseManager.getInstance().insertKunde(new Kunde("Viktor"));
            Kunde k1 = new Kunde("Stefan");
            DatabaseManager.getInstance().insertKunde(k1);
            DatabaseManager.getInstance().deleteKunde(k1);
            DatabaseManager.getInstance().insertKunde(new Kunde("Franky"));

        } catch (SQLException exception) {
            //noop
        }
        try {
            List<Kunde> kundenListe = DatabaseManager.getInstance().getKunde();

            Assertions.assertEquals(4, kundenListe.size());

            Assertions.assertEquals(1, kundenListe.get(0).getKundenNummer());
            Assertions.assertEquals(2, kundenListe.get(1).getKundenNummer());
            Assertions.assertEquals(3, kundenListe.get(2).getKundenNummer());
            Assertions.assertEquals(5, kundenListe.get(3).getKundenNummer());

        } catch (SQLException exception) {
            Assertions.fail("Kunden retrieval failed: " + exception.getMessage());
        }
    }

    @Test
    void testInsertKonto() {
        try {
            DatabaseManager.getInstance().insertKonto(new Konto(435001, 1656.45));
        } catch (SQLException exception) {
            Assertions.fail("Insert failed: " + exception.getMessage());
        }
    }

    @Test
    void testDeleteKonto() {
        try {
            DatabaseManager.getInstance().insertKonto(new Konto(435001, 1656.45));
            DatabaseManager.getInstance().insertKonto(new Konto(435002, 656.99));
            Konto konto = new Konto(435003, 1656.47);
            DatabaseManager.getInstance().insertKonto(konto);
            DatabaseManager.getInstance().deleteKonto(konto);
            DatabaseManager.getInstance().insertKonto(new Konto(435003, 166.88));


        } catch (SQLException exception) {
            Assertions.fail("Insert failed: " + exception.getMessage());
        }
    }


//    @Test
//    void getInstance() {
//    }
//
//
//    @Test
//    void insertKundeKontoVerbindung() {
//    }
//
//    @Test
//    void deleteKundenKontoVerbindung() {
//    }
}