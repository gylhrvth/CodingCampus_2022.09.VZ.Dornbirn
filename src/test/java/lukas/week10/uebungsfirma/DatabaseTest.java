package lukas.week10.uebungsfirma;

import lukas.week10.Database;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DatabaseTest {
    private Database database;

    @BeforeEach
    public void setUp() {
        database = new UebungsfirmaDatabase();
    }

    @AfterEach
    public void tearDown() {
        try {
            if(database.getConnection() != null) {
                database.disconnect();
            }
        } catch(SQLException exc) {
            //noop
        }
    }

    @Test
    public void testConnectDisconnect() {
        try {
            database.connect();
        } catch(SQLException exc) {
            Assertions.fail("Could not connect to database: "+exc.getMessage());
        }

        try {
            database.disconnect();
        } catch(SQLException exc) {
            Assertions.fail("Could not disconnect from database: "+exc.getMessage());
        }
    }

    @Test
    public void testInvalidDatabase() {
        Database database2 = new Database("jdbc:mysql://localhost:3306/Asdf?user=root&password=root");

        try {
            database2.connect();
            Assertions.fail("Should not be able to connect");
        } catch(SQLException exc) {
            //noop
        }
    }

    @Test
    public void testInvalidCredentials() {
        Database database2 = new Database("jdbc:mysql://localhost:3306/bank2?user=root2&password=root2");

        try {
            database2.connect();
            Assertions.fail("Should not be able to connect");
        } catch(SQLException exc) {
            //noop
        }
    }
}
