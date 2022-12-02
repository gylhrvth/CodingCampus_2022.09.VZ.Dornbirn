package michel.week11.Bank;

import michel.week11.Bank.Database.BankDatabaseTest;
import michel.week11.Bank.Tables.Database;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;

class DatabaseTest {
    private Database database;

    @BeforeEach // Vor jedem Test wird eine neue Datenbankinstanz erstellt hergeleitet von Klasse BankDatabaseTest()
    public void setUp() {
        database = new BankDatabaseTest();
    }

    @AfterEach // Nach jedem Test wird die Datenbank wieder disconnected
    public void tearDown() {
        try {
            if (database.getConnection() != null) {
                database.disconnect();
            }
        } catch (SQLException e) {
            //eawas
        }
    }

    @Test // Verbinden und Schließen der Datenbank
    public void connectAndDisconnect() {
        try {
            database.connect();
        } catch (SQLException e) {
            Assertions.fail("Connection failed: " + e.getMessage());
        }
        try {
            database.disconnect();
        } catch (SQLException e) {
            Assertions.fail("Disconnection failed: " + e.getMessage());
        }
    }

    @Test // Verbindung mit falschem Datenbank Name testen
    public void TestInvalideDatabase(){
        Database database1 = new Database("jdbc:mysql://localhost:3306/Datenbank?user=Mike&password=rootpw");
        try{
            database1.connect();
            Assertions.fail("Verbindung sollte nicht möglich sein!");
        }catch (SQLException e){
            //useless
        }
    }

    @Test // Verbindung mit falschem Passwort testen
    public void testInvalidPassword(){
        Database database1 = new Database("jdbc:mysql://localhost:3306/DatenbankAnwendung?user=Mike&password=rootpwXXX");
        try{
            database1.connect();
            Assertions.fail("Verbindung sollte nicht möglich sein!");
        }catch (SQLException e){
            //useless
        }
    }
}


