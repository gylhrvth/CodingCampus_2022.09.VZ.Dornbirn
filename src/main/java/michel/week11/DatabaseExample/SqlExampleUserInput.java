package michel.week11.DatabaseExample;

import java.sql.*;
import java.util.Scanner;

public class SqlExampleUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib ein Land ein");
        String country = sc.nextLine();
        try {
            // Verbinden mit SQL Datenbank
            // 1. DriverManager connection
            // 2. Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mondial?user=root&password=rootpw");
            System.out.println("Des war nur glück!");


            // Ausdruck der Tabelle erstellen in 3 schritten da die direkte eingabe sicherheitslücken aufweist
            // 1 PreparedStatement - SELECT FROM.... Statement
            PreparedStatement ps = conn.prepareStatement("SELECT * \n" +
                    "FROM city\n" +
                    "JOIN country ON city.country = country.code\n" +
//                    "WHERE country.name = 'Austria'"); --> unsichere Variante da Statement vom Nutzer erweitert werden kann!!!!
                    "WHERE country.name = ?"); // Alternative >?< als Platzhalter
            // 1.1 erweiterung Platzhalter
            ps.setString(1,country);
            // 2 ResultSet = Inhalt der Tabelle
            ResultSet rs = ps.executeQuery();
            // 3 ResultSetMetaDaten
            ResultSetMetaData metaData = rs.getMetaData();

            // Ausdruck der Spalten Namen
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                // Formatierung String zusammenbauen mit der max Zeichenlänge in der Tabelle (getPercision oder getColumnDisplaySize)
                // if Abfrage ob VARCHAR wenn ja wird - hinzugefügt um Text Linksbündig zu formatieren
                System.out.printf("| %" + (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "") + metaData.getPrecision(i) + "s ", metaData.getColumnName(i));
            }
            System.out.println("|");
            while (rs.next()) {
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    System.out.printf("| %" + (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "") + metaData.getPrecision(i) + "s ", rs.getString(i));

                }
                System.out.println("|");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
