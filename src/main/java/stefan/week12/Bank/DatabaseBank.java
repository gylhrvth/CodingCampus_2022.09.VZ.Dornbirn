package stefan.week12.Bank;

import java.sql.*;

public class DatabaseBank {

private  DatenBaseManger datenBaseManger;
    private String url;
    private Connection connection;

    public DatabaseBank() {
        this("jdbc:mysql://localhost:3306/bank?user=stefan&password=stefan");
    }

    public DatabaseBank(String url) {
        this.url = url;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url);
    }

    public void disconnet() throws SQLException {
        connection.close();
    }


    }
