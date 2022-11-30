package milan.week11.bank;

import java.sql.*;
import java.util.Scanner;

public class SqlExampleWithUserParameter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie Bitte ihren Namen ein");
        String name = sc.nextLine();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?user=milan&password=Brutus");
            System.out.println("Verbindung zum SQL Server wurde erflogreich aufgebaut.");

            PreparedStatement ps = conn.prepareStatement("SELECT kunde.name as Kundenname, konto.Kontostand, kundekontoverbindung.fk_KontoNummer as KontoNummer, kundekontoverbindung.fk_KundenNummer as KundenNummer\n" +
                    "from kunde, kundekontoverbindung, konto\n" +
                    "WHERE kundekontoverbindung.fk_KundenNummer = kunde.KundenNummer \n" +
                    "AND kundekontoverbindung.fk_KontoNummer = konto.KontoNummer\n" +
                    "AND kunde.name = ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();

            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.printf("| %" +
                        (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "")
                        + metaData.getPrecision(i) + "s ", metaData.getColumnName(i));
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
