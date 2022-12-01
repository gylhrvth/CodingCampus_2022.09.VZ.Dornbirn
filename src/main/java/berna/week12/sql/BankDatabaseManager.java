package berna.week12.sql;

import berna.week12.sql.bank.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankDatabaseManager {

    private Database database;


    public BankDatabaseManager(Database database) {
        this.database = database;
    }



/*all methods are here. new client, new account, new transaction,.....

    public void addOwnerClients(Client... owners) {
        owner.addAll(Arrays.asList(owners));
    }

    public void addAuthorizedClients(Client... authorize) {
        authorized.addAll(Arrays.asList(authorize));
    }

    public void doTransaction(Transaction transaction) {
        saldo = saldo + transaction.getAmountTA();
        System.out.println("transaction done. New saldo: " + saldo);
    }

*/

    public int insertClient(Client newClient) throws SQLException {
        PreparedStatement statement = database.getConnectionToSql().prepareStatement("INSERT INTO" +
                "`zahlungssystem`.`client` (`clientName`, `clientBirthday`,`ID`)" +
                " VALUES (?,?,?); ", PreparedStatement.RETURN_GENERATED_KEYS);

        //TODO: 1.12.22: check if the client already exists before you insert!

        statement.setString(1, newClient.clientName);
        statement.setString(2, newClient.clientBirthday);
        Random rd = new Random();
        int rdID= rd.nextInt(100,999);
        statement.setInt(3,rdID);
        int affectedRows = statement.executeUpdate();
        return affectedRows;
    }

    public List<Client> getClients() throws SQLException{
        PreparedStatement statement = database.getConnectionToSql().prepareStatement("SELECT *FROM client");
        ResultSet resultSet = statement.executeQuery();
        List<Client> allClients = new ArrayList<>();
        //now auto-generate the index for the new clients
        while(resultSet.next()){
            int ID = resultSet.getInt(3);
            String clientName = resultSet.getString(1);
            String clientBirthday = resultSet.getString(2);
            Client client1 = new Client(clientName,clientBirthday);
            client1.setID(ID);
            allClients.add(client1);
        }
        return allClients;
    }




 /*   public String printQueryResult() {

        StringBuilder sb = new StringBuilder("");
        //TODO: how to bring in results of query?

        try {
            ResultSetMetaData metaData = rs.getMetaData();

            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                String text1 = "| " + metaData.getColumnName(i) + (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "");
                sb.append(text1);
            }
            sb.append("| \n");

            while (rs.next()) {
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    sb.append("| %" + (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "") + " " + rs.getString(i));
                }
                sb.append("| \n");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }*/
}
