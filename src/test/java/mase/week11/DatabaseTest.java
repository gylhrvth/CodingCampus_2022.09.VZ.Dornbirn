package mase.week11;

import mase.week11.Bank.BankDatabaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class DatabaseTest {
    private Database database;

    @BeforeEach
    public void setup(){
        database = new BankDatabaseTest();
    }
    @AfterEach
    public void teardown(){
        try {
            if (database.getConn() != null){
                database.disconnect();
            }

        }catch (SQLException e){

        }
    }
    @Test
    public void testConnectDisconnect() {
        try {
            database.connect();
        } catch (SQLException e) {
            Assertions.fail("Could not connect" + e.getMessage());
        }
        try {
            database.disconnect();
        } catch (SQLException e) {
            Assertions.fail("Could not disconnect" + e.getMessage());
        }
    }
}