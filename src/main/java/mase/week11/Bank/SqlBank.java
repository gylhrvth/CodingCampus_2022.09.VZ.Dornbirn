package mase.week11.Bank;

import java.sql.*;
import java.util.List;
import java.util.Vector;

public class SqlBank {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Bank?user=root&password=leomessi10");
            System.out.println("Erfolgreich");

            List<Kunde> kundenList = getAlleKunden(conn);
            System.out.println("Kunden: " + kundenList);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }


    public static void printQueryResultAsTable(Connection conn){
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM kunde;");
            ResultSetMetaData metaData = rs.getMetaData();
            for (int i = 1; i <= metaData.getColumnCount() ; i++) {
                System.out.printf("| %"+
                        (metaData.getColumnTypeName(i).equals("VARCHAR")? "-":"") +
                        metaData.getPrecision(i) + "s", metaData.getColumnName(i));
                }
            System.out.println("|");

            while (rs.next()){
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    System.out.printf("| %" +
                            (metaData.getColumnTypeName(i).equals("VARCHAR")? "-":"")
                    +metaData.getPrecision(i)+ "s", rs.getString(i));
                }
                System.out.println("|");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }


    public static List<Kunde> getAlleKunden(Connection conn){
        List<Kunde> result = new Vector<>();
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT svnr, name FROM kunde;");

            while (rs.next()){
                result.add(new Kunde(
                        rs.getInt(1),
                        rs.getString(2)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }
}
