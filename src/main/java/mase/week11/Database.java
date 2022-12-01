package mase.week11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
 private String url;
 private Connection conn;

 public Database(String url){
     this.url = url;
 }
 public Database(){
     this("jdbc:mysql://127.0.0.1:3306/Bank?user=root&password=leomessi10");
 }
 public Connection getConn(){
     return conn;
 }
 public void connect() throws SQLException {
     conn = DriverManager.getConnection(url);
 }
 public void disconnect() throws SQLException{
     conn.close();
 }
}
