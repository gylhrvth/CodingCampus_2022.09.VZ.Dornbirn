package berna.week12.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private String url;
    private Connection connection;

    public Database(){
        //default url to default database
        this("jdbc:mysql://127.0.0.1:3306/?user=berna&password=ert.34QUP09o0.!");
    }

    public Database(String url){this.url = url;}

    public void connectToSql() throws SQLException{
        connection = DriverManager.getConnection(url);
        System.out.println("you are now connected to SQL \n");
    }
    public Connection getConnectionToSql(){return connection;}

    public void disconnectFromSql() throws SQLException{
        connection.close();
        System.out.println("you are now disconnected from SQL");
    }

}
