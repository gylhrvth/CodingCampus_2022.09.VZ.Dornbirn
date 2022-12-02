//package michel.week11.Bank.Database;
//
//import michel.week11.Bank.Tables.Kunde;
//
//import java.sql.*;
//import java.util.List;
//import java.util.Vector;
//
//public class SqlBank {
//    public static void main(String[] args) {
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatenbankAnwendung?user=Mike&password=rootpw");
//            System.out.println("Erfolgreich");
//            Kunde kunde = new Kunde("mase","esam",2342352,"0557223456");
//            List<Kunde> kundenList = getAlleKunden(conn);
//            System.out.println("Kunden: " + kundenList);
//            printQueryTable(conn);
//        } catch (SQLException sqlException) {
//            sqlException.printStackTrace();
//        }
//    }
//
//    private static List<Kunde> getAlleKunden(Connection conn) {
//        List<Kunde> result = new Vector<>();
//        try {
//            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Kunde;");
//            while (rs.next()){
//                result.add(new Kunde(
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getInt(1),
//                        rs.getString(4)
//                ));
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    public static void printQueryTable(Connection conn){
//        try {
//            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM kunde;");
//            ResultSetMetaData metaData = rs.getMetaData();
//            for (int i = 1; i <= metaData.getColumnCount() ; i++) {
//                System.out.printf("| %"+
//                        (metaData.getColumnTypeName(i).equals("VARCHAR")? "-":"") +
//                        metaData.getPrecision(i) + "s", metaData.getColumnName(i));
//            }
//            System.out.println("|");
//
//            while (rs.next()){
//                for (int i = 1; i <= metaData.getColumnCount(); i++) {
//                    System.out.printf("| %" +
//                            (metaData.getColumnTypeName(i).equals("VARCHAR")? "-":"")
//                            +metaData.getPrecision(i)+ "s", rs.getString(i));
//                }
//                System.out.println("|");
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//
//    }
//}
