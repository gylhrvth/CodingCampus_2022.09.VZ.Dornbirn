package martin.week11;

import martin.week11.zahlungssystem.Database;
import martin.week11.zahlungssystem.UebungsZahlungssystemDatabase;
import martin.week11.zahlungssystem.UebungsZahlungssystemTestDatabase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static martin.week11.zahlungssystem.Database.pwrd1;

public class DatabaseTest {
    private Database database;
    //String Array für Datenbank
    private final String[] urlC = {"", "zahlungssystem", "Corsus", pwrd1};


    @BeforeEach
    public void setUp() {
        database = new UebungsZahlungssystemDatabase(uSlocalHDL(
                urlC[1], urlC[2], urlC[3]));
    }

    @AfterEach
    public void tearDown() {
        try {
            if (database.gCon() != null) {
                database.discon();
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }

    @Test
    public void testConnectDisconnect() {
        try {
            database.connect();
        } catch (SQLException exc) {
            Assertions.fail("Could not connect to database: " + exc.getMessage());
        }

        try {
            database.discon();
        } catch (SQLException exc) {
            Assertions.fail("Could not disconnect from database: " + exc.getMessage());
        }
    }

    @Test
    public void testInvalidDatabase() {
        Database database2 = new UebungsZahlungssystemTestDatabase(uSlocalHDL(
                "fetterGorilla", urlC[2], urlC[3]));
        try {
            database2.connect();
            Assertions.fail("Should not be able to connect");
        } catch (SQLException exc) {
            //Hier könnte ihre Werbung stehen
        }
    }

    @Test
    public void testInvalidCredentials() {
        Database database2 = new UebungsZahlungssystemTestDatabase(uSlocalHDL(
                urlC[1], urlC[2], "dunnoBro"));
        try {
            database2.connect();
            Assertions.fail("Should not be able to connect");
        } catch (SQLException exc) {
            //nope
        }
    }

    public static String uSHDL(String host, String database, String user, String pw) {
        String c0 = "jdbc:";
        String c1 = "mysql:";
        String c2 = host;
        String c3 = database;
        String c4 = "?";
        String c5 = "user=";
        String c6 = user;
        String c7 = "&";
        String c8 = "password=";
        String c9 = pw;
        return c0 + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9;
    }

    // Localhost mit Datenbank und Login
    public static String uSlocalHDL(String database, String user, String pw) {
        return uSHDL("//localhost:3306/", database, user, pw);
    }
}
