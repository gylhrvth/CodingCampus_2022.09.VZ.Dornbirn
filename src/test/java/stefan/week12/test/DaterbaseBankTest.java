package stefan.week12.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stefan.week12.Bank.DatabaseBank;

import java.sql.SQLException;

public class DaterbaseBankTest {
    private DatabaseBank databaseBank;

   @Test
    public void testConnectDisconnet() {
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


}
