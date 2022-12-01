package mase.week11.Bank;

import mase.week11.Database;

public class BankDatabaseTest extends Database {

    public BankDatabaseTest() {
        super("jdbc:mysql://127.0.0.1:3306/Bank?user=root&password=leomessi10");
    }
}
