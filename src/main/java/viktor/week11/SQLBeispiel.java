package viktor.week11;

import java.sql.Connection;
import java.sql.*;

public class SQLBeispiel {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mondial?user=viktor&password=0905Tech");
            System.out.println("Die Verbindung zum Server wurde erfolgreich aufgebaut!");
            System.out.println();

            ResultSet rs = con.createStatement().executeQuery("select Name, Capital, Population from mondial.country where name like 'a%' and population < 1000000");
            ResultSetMetaData meta = rs.getMetaData();

            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.println(meta.getColumnLabel(i) + " " + meta.getColumnTypeName(i) + "("
                        + meta.getPrecision(i) + ")");
            }

            System.out.println("\n");
            System.out.println("Tabelle: " + meta.getTableName(1));
            System.out.println("Abfrage für alle Länder, die mit 'A' anfangen und die Anzahl der Bevölkerung größer ist als 1 000 000");
            System.out.println();

            // Hier werden nur die Spalten ausgeschrieben
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("| %" +
                        (meta.getColumnTypeName(i).equals("VARCHAR") ? "-" : "") +   //linksbündig werden die Spalten mit dem Datentyp varchar
                        meta.getPrecision(i) + "s ", meta.getColumnName(i));             //  -> "%-35s"


            }
            System.out.println("|");

            // Datensätze von den Spalten
            while (rs.next()) {
                for (int i = 1; i <= meta.getColumnCount(); i++) {

                    System.out.printf("| %" +
                            (meta.getColumnTypeName(i).equals("VARCHAR") ? "-" : "") +
                            meta.getPrecision(i) + "s ", rs.getString(i));
                }
                System.out.println("|");

            }

        } catch (SQLException sqe) {
            sqe.printStackTrace();
        }


    }
}
