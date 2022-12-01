package stefan.week12.SqlExample;

import java.sql.*;

public class mySqlBeispiel {


    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?user=root&password=stivo-007");

            ResultSet rs = con.createStatement().executeQuery("select kunde.kundenName, konten.kontostand, kundekontoverbindung.kundenid_fk as KundenId,kundekontoverbindung.kontennummer_fk as Kontonummer\n" +
                    "from kunde \n" +
                    "join kundekontoverbindung on kundekontoverbindung.kundenid_fk = kunde.kundenId\n" +
                    "join konten on konten.Kontenummer =kundekontoverbindung.kontennummer_fk; ");
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

        } catch (SQLException exe) {
            exe.printStackTrace();

        }

    }


}
