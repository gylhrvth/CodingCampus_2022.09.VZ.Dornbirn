package michel.week11.Bank.Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private final String url;

    private Connection connection;

    public Database() {
        this("jdbc:mysql://localhost:3306/DatenbankAnwendung?user=Mike&password=rootpw");
    }
    public Database(String url) {
        this.url = url;
    }


    public Connection getConnection() {
        return connection;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/DatenbankAnwendung?user=Mike&password=rootpw");
    }

    public void disconnect() throws SQLException {
        connection.close();
    }

}
