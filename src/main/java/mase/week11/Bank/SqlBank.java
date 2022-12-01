package mase.week11.Bank;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SqlBank {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Bank?user=root&password=leomessi10");
            System.out.println("Erfolgreich");

            List<Konto> kontoList = getKonto(conn);
            List<Kunde> kundenList = getAlleKunden(conn);
            printQueryResultAsTable(conn);

            System.out.println("Kunden: " + kundenList);
            System.out.println("Konto: " + kontoList);
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
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM  kunde;");

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

    public static List<Konto> getKonto(Connection conn){
        List<Konto> result = new ArrayList<>();
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT KontoNr, Kontostand FROM Konto ");
            while (rs.next()){
                result.add(new Konto(
                        rs.getInt(1),
                        rs.getInt(2)
                ));
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return result;
    }
}
