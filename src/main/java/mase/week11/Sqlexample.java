package mase.week11;

import java.sql.*;

public class Sqlexample {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mondial?user=root&password=leomessi10");
            System.out.println("you made it to the other side ");

            ResultSet rs = conn.createStatement().executeQuery("SELECT Name, Capital, Population FROM country WHERE Name LIKE 'B%' AND Population < 10000000");
            ResultSetMetaData metaData = rs.getMetaData();
//            for (int i = 1; i <= metaData.getColumnCount(); i++) {
//                System.out.println("Column: " + metaData.getColumnLabel(i)+ " " + metaData.getColumnTypeName(i) +" ("+ metaData.getPrecision(i) +")");
//            }
//            while (rs.next()){
//                for (int i = 1; i <metaData.getColumnCount() ; i++) {
//                    System.out.println("Spalte: "+ i + ":" + rs.getString(i));
//                }
//            }

            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.printf("| %" +
                        (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "") +
                        metaData.getPrecision(i) + "s", metaData.getColumnName(i));
            }
            System.out.println("|");

            while (rs.next()) {
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    System.out.printf("| %" +
                            (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "")
                            + metaData.getPrecision(i) + "s ", rs.getString(i));
                }
                System.out.println("|");
            }





        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
