package berna.week12.sql;

import berna.week12.sql.bank.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;


class BankDatabaseManagerTest {

    private Database database;
    private BankDatabaseManager bankdbm;

    @BeforeEach
    public void setUp()throws SQLException{
        database = new BankDatabase();
        database.connectToSql();
        bankdbm = new BankDatabaseManager(database);
    }


    @Test
    public void testInsertClient() {
        Client c1= new Client("Ameise", "2000-01-02");
        try{
            int nrClientAdded = bankdbm.insertClient(c1);
            Assertions.assertEquals(1,nrClientAdded);
            System.out.println( nrClientAdded +" client inserted into DB table!\n");
        }catch (SQLException exc){
            Assertions.fail("Insert failed: " + exc.getMessage());
        }
    }

    @Test
    public void testGetClients(){
        try{
            bankdbm.insertClient(new Client("Arno", "1900-10-10"));
            bankdbm.insertClient(new Client("Boris", "1901-10-10"));
            bankdbm.insertClient(new Client("Cemal", "1902-10-10"));
            bankdbm.insertClient(new Client("Digga", "1903-10-10"));
        }catch (SQLException exc){
            //nix
        }

        try{
            List<Client> clientList = bankdbm.getClients();
            System.out.println("There are " +clientList.size() + " clients in the DB." );

        }catch(SQLException exc){
            Assertions.fail("Clients retrieval failed: " + exc.getMessage());
        }
    }



}