package martin.week11;

import martin.week11.zahlungssystem.Database;
import martin.week11.DatabaseManager;

import martin.week11.zahlungssystem.UebungsZahlungssystemTestDatabase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static martin.week11.zahlungssystem.Database.zhlngssystmURL;

public class DatabaseManagerTest {
    private Database database;
    protected DatabaseManager databaseManager;
    private String[] tblToDrop = {"kundekonto","transaktion","kunde","konto"};

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
    public void testCreateSchema(){
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

    @Test
    public void testDropTablesSchema() {
        try {
            databaseManager.dTBL(tblToDrop);
        } catch (SQLException exc) {
            Assertions.fail("Dropping tables failed: " + exc.getMessage());
        }

        try {
            databaseManager.dTBL(tblToDrop);
            Assertions.fail("Dropping tables should not succeed!");
        } catch (SQLException exc) {
            //noop
        }
    }
}
