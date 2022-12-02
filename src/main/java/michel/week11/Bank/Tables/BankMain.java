package michel.week11.Bank.Tables;

import michel.week11.Bank.DatabaseManager;

import java.sql.SQLException;

public class BankMain {

    public static void main(String[] args) {
        try {
            DatabaseManager.getInstance().dropTable();
            DatabaseManager.getInstance().createTable();
        }catch (SQLException e){
            e.printStackTrace();
        }

        Kunde kunde1 = new Kunde(123456789,"Martin","Mustermartin","066055643122");
        Kunde kunde2 = new Kunde(223456789,"Mase","Mustermase","066055624324");
        Kunde kunde3 = new Kunde(323456789,"Patric","Musterpatric","0660465788");
        Kunde kunde4 = new Kunde(423456789,"Klaus","Musterklaus","06605590987");

    }
}
