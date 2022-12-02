package viktor.week11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    @SuppressWarnings("unused")
    private final String url;
    private Connection con;

    public Database(String url) {

        this.url = url;
    }

    public Connection getCon() {
        return con;
    }

    public void connect() throws SQLException {

        con = DriverManager.getConnection(url);
        System.out.println("Die Verbindung zum Server wurde erfolgreich aufgebaut!");
    }


    public void disconnect() throws SQLException {

        con.close();
    }

}
