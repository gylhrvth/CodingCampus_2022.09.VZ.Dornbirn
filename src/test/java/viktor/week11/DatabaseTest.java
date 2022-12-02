package viktor.week11;

import org.junit.jupiter.api.*;

import java.sql.SQLException;

public class DatabaseTest {

    private Database db;

    @BeforeEach
    public void setUp() {
        db = new BankTestDB();
    }


    @AfterEach
    public void tearDown() {
        try {
            if (db.getCon() != null) {
                db.disconnect();
            }
        } catch (SQLException sqe) {

        }
    }

    @Test

    public void testConDiscon() {

        try {
            db.connect();
        } catch (SQLException sqe) {
            Assertions.fail("Die Verbindung zum Server konnte nicht hergestellt werden!" + sqe.getMessage());
        }
        try {
            db.disconnect();
        } catch (SQLException sqe) {
            Assertions.fail("Die Verbindung von der Datenbank konnte nicht getrennt werden!");
        }
    }

    @Test
    public void testInvalidDatabase() {
        Database db2 = new Database("jdbc:mysql://localhost:3306/abc?user=root&password=root");

        try {
            db2.connect();
            Assertions.fail("Die Verbindung zur Datenbank konnte nicht hergestellt werden!");
        } catch (SQLException sqe) {

        }
    }

    @Test
    public void testInvalidCredentials() {

        Database db3 = new Database("jdbc:mysql://127.0.0.1:3306/banktestdb?user=viktor&password=root");

        try {
            db3.connect();
            Assertions.fail("Die Verbindung konnte nicht hergestellt werden!");

        } catch (SQLException sqe) {

        }
    }


}
