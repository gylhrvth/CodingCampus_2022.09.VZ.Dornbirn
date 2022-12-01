package martin.week11.zahlungssystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String[] pw = {String.valueOf((char) 0156), String.valueOf((char) 0157), String.valueOf((char) 0165), String.valueOf((char) 0163), String.valueOf((char) 0143), String.valueOf((char) 0164)};
    public static final String pwrd1 = pw[4] + pw[1] + pw[4] + pw[1] + pw[0] + pw[2] + pw[5] + pw[3];
    private String url;
    public static final String zhlngssystmURL = uSlocalHDL("zahlungssystem", "Corsus", pwrd1);
    private Connection connection;

    public Database() {
        this(uSlocalHDL("zahlungssystem", "Corsus", pwrd1));
    }

    public Database(String url) {
        this.url = url;
    }

    // Abkürzung get Connection
    public Connection gCon() {
        return connection;
    }

    // Connect
    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url);
    }

    //Abkürzung disconnect
    public void discon() throws SQLException {
        connection.close();
    }


    //Abkürzung für URL SQL Host Datanbank und Logindaten
    public static String uSHDL(String host, String database, String user, String pw) {
        String c0 = "jdbc:";
        String c1 = "mysql:";
        String c2 = host;
        String c3 = database;
        String c4 = "?";
        String c5 = "user=";
        String c6 = user;
        String c7 = "&";
        String c8 = "password=";
        String c9 = pw;
        return c0 + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9;
    }

    // Localhost mit Datenbank und Login
    public static String uSlocalHDL(String database, String user, String pw) {
        return uSHDL("//localhost:3306/", database, user, pw);
    }
}
