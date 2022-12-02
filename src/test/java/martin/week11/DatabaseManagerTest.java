package martin.week11;

import martin.week11.zahlungssystem.Database;
import martin.week11.zahlungssystem.UebungsZahlungssystemTestDatabase;
import martin.week11.zahlungssystem.model.Konto;
import martin.week11.zahlungssystem.model.Kunde;
import martin.week11.zahlungssystem.model.KundeKonto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static martin.week11.zahlungssystem.Database.zhlngssystmURL;

public class DatabaseManagerTest {
    private Database database;
    protected DatabaseManager databaseManager;
    private final String[] tblToDrop = {"kundekonto", "transaktion", "kunde", "konto"};

    @BeforeEach
    public void setUp() throws SQLException {
        database = new UebungsZahlungssystemTestDatabase(zhlngssystmURL);
        database.connect();
        databaseManager = new DatabaseManager(database);
        //Clean database before every test
        try {
            databaseManager.dTBL(tblToDrop);
        } catch (SQLException exc) {
            //noop
        }
        try {
            databaseManager.zhlngsystmTBL();
            databaseManager.zhlngsystmLNS();
        } catch (SQLException exc) {
            //noop
        }
    }

    @AfterEach
    public void tearDown() {
        try {
            if (database.gCon() != null) {
                database.discon();
            }
        } catch (SQLException exc) {
            //noop
        }
    }

    //Basically same as second part of before each
    @Test
    public void testCreateSchema() {
        //Make tables
        try {
            databaseManager.dTBL(tblToDrop);
        } catch (SQLException exc) {
            //noop
        }
        //Fill tables
        try {
            databaseManager.zhlngsystmTBL();
            databaseManager.zhlngsystmLNS();
        } catch (SQLException exc) {
            //noop
        }
    }

    @Test
    public void testDropTablesSchema() {
        //Drop tables as expected
        try {
            databaseManager.dTBL(tblToDrop);
        } catch (SQLException exc) {
            Assertions.fail("Dropping tables failed: " + exc.getMessage());
        }
        //Expect table dropping to fail
        try {
            databaseManager.dTBL(tblToDrop);
            Assertions.fail("Dropping tables should not succeed!");
        } catch (SQLException exc) {
            //noop
        }
    }

    @Test
    public void testInsertKonto() {
        Konto k1 = new Konto(536245);
        try {
            databaseManager.insKonto(k1);
        } catch (SQLException exc) {
            //noop
        }
    }

    @Test
    public void testGetKonto() {
        int[] staende = {9876, 5432, 1098, 7654, 3210};
        try {
            for (int i : staende) {
                databaseManager.insKonto(new Konto(i));
            }
        } catch (SQLException exc) {
            //System.out.println(8+"=".repeat(4)+"D");
        }
        try {
            List<Konto> kontoList = databaseManager.getKonto();
            Assertions.assertEquals(staende.length, kontoList.size() + 1);
            for (int i = 0; i < kontoList.size() - 4; i++) {
                Assertions.assertEquals(staende[i], kontoList.get(i + 4).getStand());
            }
        } catch (SQLException exc) {
            //noop
        }
    }

    @Test
    public void testInsertKunde() {
        Kunde k1 = new Kunde("Max Mustermann");
        try {
            databaseManager.insKunde(k1);
        } catch (SQLException exc) {
            //noop
        }
    }

    @Test
    public void testGetKunde() {
        String[] namen = {"Abba", "Benjamin", "Claus", "Dexter", "Elise"};
        try {
            for (String i : namen) {
                databaseManager.insKunde(new Kunde(i));
            }
        } catch (SQLException exc) {
            //System.out.println(8+"=".repeat(4)+"D");
        }
        try {
            List<Kunde> kundeList = databaseManager.getKunde();
            Assertions.assertEquals(namen.length, kundeList.size() + 1);
            for (int i = 0; i < kundeList.size() - 4; i++) {
                Assertions.assertEquals(namen[i], kundeList.get(i + 4).getName());
            }
        } catch (SQLException exc) {
            //noop
        }
    }

    @Test
    public void testInsertKundeKontoWORole() {
        KundeKonto kk1 = new KundeKonto(1, 1);
        try {
            databaseManager.insKundeKonto(kk1);
        } catch (SQLException exc) {
            //noop
        }
    }

    @Test
    public void testInsertKundeKontoWRole() {
        KundeKonto kk1 = new KundeKonto(1, 1, "testRole");
        try {
            databaseManager.insKundeKonto(kk1);
        } catch (SQLException exc) {
            //noop
        }
    }

    @Test
    public void testGetKundeKonto() throws SQLException {
        List<Kunde> kunden = databaseManager.getKunde();
        List<Konto> konten = databaseManager.getKonto();
        int[] ids = new int[kunden.size()];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = kunden.get(i).getKunden_id();
        }
        int[] ibans = new int[konten.size()];
        for (int i = 0; i < ibans.length; i++) {
            ibans[i] = konten.get(i).getIban();
        }
        String[] rollen = {"baa", "bae", null, "bao", "bau", null, "bee", "bei", null, "beu", "bia", null, "bio", "biu", null};
        int smaller = Math.min(ids.length, ibans.length);
        databaseManager.dropTable("kundekonto");
        try {
            for (int i = 0; i < smaller; i++) {
                databaseManager.insKundeKonto(new KundeKonto(ids[i], ibans[i], rollen[i]));
            }
        } catch (SQLException exc) {
            //Huuuiiiii
        }
        try {
            List<KundeKonto> kundekontolist = databaseManager.getKundeKonto();
            Assertions.assertEquals(smaller, kundekontolist.size() + 1);
            for (int i = 0; i < kundekontolist.size() - 4; i++) {
                Assertions.assertEquals(ids[i], ibans[i], rollen[i]);
            }
        } catch (SQLException exc) {
            //noop
        }
    }
}
