package lukas.week10.uebungsfirma;

import lukas.week10.Database;
import lukas.week10.uebungsfirma.model.Mitarbeiter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

public class DatabaseManagerTest {
    private Database database;
    private DatabaseManager databaseManager;

    @BeforeEach
    public void setUp() throws SQLException {
        database = new UebungsfirmaTestDatabase();
        database.connect();
        databaseManager = new DatabaseManager(database);

        //Clean database before every test
        try {
            databaseManager.dropTables();
        } catch (SQLException exc) {
            //noop
        }
        try {
            databaseManager.createTables();
        } catch (SQLException exc) {
            //noop
        }
    }

    @Test
    public void testCreateSchema() {
        //Delete scheme
        try {
            databaseManager.dropTables();
        } catch (SQLException exc) {
            //noop
        }

        try {
            databaseManager.createTables();
        } catch (SQLException exc) {
            Assertions.fail("Create schema failed: " + exc.getMessage());
        }
    }

    @Test
    public void testDropTablesSchema() {
        try {
            databaseManager.dropTables();
        } catch (SQLException exc) {
            Assertions.fail("Dropping tables failed: " + exc.getMessage());
        }

        try {
            databaseManager.dropTables();
            Assertions.fail("Dropping tables should not succeed!");
        } catch (SQLException exc) {
            //noop
        }
    }

    @Test
    public void testInsertMitarbeiter() {
        Mitarbeiter m1 = new Mitarbeiter("Walter", 0, 0);

        try {
            databaseManager.insertMitarbeiter(m1);
        } catch (SQLException exc) {
            Assertions.fail("Insert failed: " + exc.getMessage());
        }
    }

    @Test
    public void testGetMitarbeiter() {
        try {
            databaseManager.insertMitarbeiter(new Mitarbeiter("Walter", 0, 0));
            databaseManager.insertMitarbeiter(new Mitarbeiter("Max", 0, 0));
            databaseManager.insertMitarbeiter(new Mitarbeiter("Rosmarie", 0, 0));
        } catch (SQLException exc) {
            //noop
        }

        try {
            List<Mitarbeiter> mitarbeiterList = databaseManager.getMitarbeiter();

            Assertions.assertEquals(3, mitarbeiterList.size());

            Assertions.assertEquals("Walter", mitarbeiterList.get(0).getName());
            Assertions.assertEquals("Max", mitarbeiterList.get(1).getName());
            Assertions.assertEquals("Rosmarie", mitarbeiterList.get(2).getName());
        } catch (SQLException exc) {
            Assertions.fail("Mitarbeiter retrieval failed: " + exc.getMessage());
        }
    }

    @AfterEach
    public void tearDown() {
        try {
            if (database.getConnection() != null) {
                database.disconnect();
            }
        } catch (SQLException exc) {
            //noop
        }
    }
}
