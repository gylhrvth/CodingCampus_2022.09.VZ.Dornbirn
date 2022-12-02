package viktor.week11;

import java.sql.SQLException;

public class BankTestDBSimulation {

    public static void main(String[] args) {

        Database btdb = new BankTestDB();
        DatabaseManager dbm =  new DatabaseManager(btdb);

        try{
            btdb.connect();
            //dbm.createTable();
            System.out.println("Affected rows: " + dbm.deleteItemFromATable());


        }
        catch(SQLException sqe){
            sqe.printStackTrace();
        }

    }
}
