package milan.week11.bank;

import java.sql.*;

public class SqlExample {
    public static void main(String[] args) {


        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?user=milan&password=Brutus");
            System.out.println("Verbindung zum SQL Server wurde erfolgreich aufgebaut.");
            ResultSet rs = conn.createStatement().executeQuery("SELECT kunde.name as Kundenname, " +
                    "kundekontoverbindung.fk_KontoNummer as KontoNummer, " +
                    "kundekontoverbindung.fk_KundenNummer as KundenNummer from kunde, " +
                    "kundekontoverbindung " +
                    "WHERE kundekontoverbindung.fk_KundenNummer = kunde.KundenNummer");
            ResultSetMetaData metaData = rs.getMetaData();

            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.printf("| %" +
                        (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "")
                        + metaData.getPrecision(i) + "s ", metaData.getColumnLabel(i)
                );
            }
            System.out.println("|");
            while (rs.next()) {
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    System.out.printf("| %" +
                            (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "")
                            + metaData.getPrecision(i) + "s ", rs.getString(i)
                    );
                }
                System.out.println("|");

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
