package stefan.week12.test;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stefan.week12.Bank.DatabaseBank;

import stefan.week12.Bank.DatenBaseManger;



import java.sql.SQLException;


public class DaterbaseBankTest {
    private DatenBaseManger datenBaseManger;


    public static final String DATABASE_CONNECT_STRING = "jdbc:mysql://localhost:3306/bank?user=stefan&password=stefan";

    @Test
    public void testConnectDisconnet() {
        DatabaseBank databaseBank = new DatabaseBank(DATABASE_CONNECT_STRING);
        try {
            databaseBank.connect();

        } catch (SQLException exc) {
            Assertions.fail("Test fail not connect to database:" + exc.getMessage());

        }
        try {
            databaseBank.disconnet();
        } catch (SQLException exc) {
            Assertions.fail("Coul not disconnet from database:" + exc.getMessage());
        }
    }
    @Test
    public void testInvalidDatabase() {
        DatabaseBank databaseBank2 = new DatabaseBank(DATABASE_CONNECT_STRING);

        try {
            databaseBank2.connect();
            Assertions.fail("Should not be able to connect");
        } catch(SQLException exc) {
            //noop
        }
    }
}