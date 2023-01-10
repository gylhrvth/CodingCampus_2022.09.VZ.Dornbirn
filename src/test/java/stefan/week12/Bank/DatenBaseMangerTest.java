package stefan.week12.Bank;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class DatenBaseMangerTest {
    private DatenBaseManger datenBaseManger;
    private DatabaseBank databaseBank;
    public static final String DATABASE_CONNECT_STRING = "jdbc:mysql://localhost:3306/bank?user=stefan&password=stefan";


    @Test
    public void setUp() throws SQLException {
          databaseBank = new DatabaseBank(DATABASE_CONNECT_STRING);
        databaseBank.connect();
        datenBaseManger = new DatenBaseManger(databaseBank);

        //Clean database before every test
        try {
            datenBaseManger.dropTables();
        } catch (SQLException exc) {
            //noop
        }
        try {
            datenBaseManger.createTables();
        } catch (SQLException exc) {
            //noop
        }
    }


}
