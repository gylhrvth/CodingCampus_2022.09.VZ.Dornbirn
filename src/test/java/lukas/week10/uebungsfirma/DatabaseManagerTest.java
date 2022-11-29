package lukas.week10.uebungsfirma;

import lukas.week10.Database;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

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
            databaseManager.createTables();
        } catch (SQLException exc) {
            //noop
        }
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
