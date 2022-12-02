package milan.week11.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    private Database database;

    @BeforeEach
    public void setUp() {
        database = new Database();
    }

    @AfterEach
    public void tearDown() {
        try {
            if (database.getConnection() != null) {
                database.disconnect();
            }
        } catch (SQLException exception) {
            //noop
        }
    }

    @Test
    public void testConnectDisconnect() {
        try {
            database.connect();
        } catch (SQLException exception) {
            Assertions.fail("Could not connect to database: " + exception.getMessage());
        }
        try {
            database.disconnect();
        } catch (SQLException exception) {
            Assertions.fail("Could not disconnect from database: " + exception.getMessage());
        }
    }

    @Test
    public void testInvalidDatabase() {
        Database database2 = new Database("jdbc:mysql://localhost:3306/Asdf?user=root&password=root");
        try {
            database2.connect();
            Assertions.fail("Should not be able to connect");
        } catch (SQLException exception) {
            //noop
        }
    }

    @Test
    public void testInvalidCredentials() {
        Database database2 = new Database("jdbc:mysql://localhost:3306/banktest2?user=root&password=root2");
        try {
            database2.connect();
            Assertions.fail("Should not be able to connect");
        } catch (SQLException exception) {
            //noop
        }
    }

}