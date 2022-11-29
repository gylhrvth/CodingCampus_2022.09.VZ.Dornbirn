package lukas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class Database {
    private final String url;
    private Connection connection;

    //I.e.: jdbc:mysql://localhost:3306/bank?user=root&password=test
    public Database(String url) {
        this.url = url;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url);
    }

    public void disconnect() throws SQLException {
        connection.close();
    }
}
