package milan.week11.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {

    private String url;

    private Connection connection;

    public Database() {
        this("jdbc:mysql://localhost:3306/bank?user=milan&password=Brutus");
    }

    public Database(String url){
        this.url = url;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect() throws SQLException{
        connection = DriverManager.getConnection(url);
    }

    public void disconnect() throws SQLException{
        connection.close();
    }

}
