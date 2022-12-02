package michel.week11.Bank.Database;

import michel.week11.Bank.Tables.Database;

public class BankDatabaseTest extends Database {
    public BankDatabaseTest() {
        super("jdbc:mysql://localhost:3306/DatenbankAnwendungTest?user=Mike&password=rootpw");
    }
}
