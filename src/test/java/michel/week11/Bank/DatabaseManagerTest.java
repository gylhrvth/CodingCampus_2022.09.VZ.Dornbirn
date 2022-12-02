package michel.week11.Bank;

import michel.week11.Bank.Database.BankDatabaseTest;
import michel.week11.Bank.Tables.Database;
import michel.week11.Bank.Tables.Kunde;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class DatabaseManagerTest {
    private Database database;
    private DatabaseManager databaseManager;
    @BeforeEach
    public void setUp() throws SQLException{
        database = new BankDatabaseTest();
        database.connect();
        databaseManager = new DatabaseManager();
        try {
            databaseManager.createTable();
        }catch (SQLException e){
            //n
        }
    }
    @Test
    public void testCreateSchema(){
        try {
            databaseManager.dropTable();
        }catch (SQLException e){
            //n
        }
        try {
            databaseManager.createTable();
        }catch (SQLException e){
            Assertions.fail("Create schema failed" +e.getMessage());
        }
    }
    @Test
    public void testDropTableSchema(){
        try {
            databaseManager.dropTable();
        }catch (SQLException e){
            Assertions.fail("Drop tables failed: " + e.getMessage());
        }

    }
    @Test
    public void insertKunde(){
        Kunde k1 = new Kunde(237846264,"mark","krause","06653535353");
        Kunde k2 = new Kunde(237354264,"marko","kranz","06653564463");
        try {
            databaseManager.insertKunde(k1);
            databaseManager.insertKunde(k2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}