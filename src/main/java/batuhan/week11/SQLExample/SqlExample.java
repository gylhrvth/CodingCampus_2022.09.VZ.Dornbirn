//package batuhan.week11.SQLExample;
//
//import com.mysql.cj.jdbc.PreparedStatementWrapper;
//import com.sun.jdi.connect.spi.Connection;
//
//import java.sql.*;
//import java.util.Scanner;
//
//public class SqlExample {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Geben Sie ein Land Name ein");
//        String land = sc.nextLine();
//
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.178.66:3306/mondial?user=root&password=Alperen5858");
//            System.out.println("Verbindung zum SQL Server wurde erfolgreich aufgebaut. :-)");
//
//            PreparedStatement ps = conn.prepareStatement("SELECT * \n" +
//                    "FROM city\n" +
//                    "JOIN country ON city.country = country.code\n" +
//                    "WHERE country.name = ?");
//            ps.setString(1, land);
//            ResultSet rs = ps.executeQuery();
//            ResultSetMetaData metaData = rs.getMetaData();
//
//            for (int i = 1; i <= metaData.getColumnCount(); i++) {
//                System.out.printf("| %" +
//                        (metaData.getColumnTypeName(i).equals("VARCHAR")?"-":"")
//                        + metaData.getPrecision(i) + "s ", metaData.getColumnName(i));
//            }
//            System.out.println("|");
//            while (rs.next()){
//                for (int i = 1; i <= metaData.getColumnCount() ; i++) {
//                    System.out.printf("| %" +
//                            (metaData.getColumnTypeName(i).equals("VARCHAR")?"-":"")
//                            + metaData.getPrecision(i) + "s ", rs.getString(i));
//                }
//                System.out.println("|");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
