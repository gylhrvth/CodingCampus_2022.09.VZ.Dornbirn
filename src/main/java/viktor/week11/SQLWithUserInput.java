package viktor.week11;

import java.sql.*;
import java.util.Scanner;

public class SQLWithUserInput {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte ein Land an:");
        String land = sc.nextLine();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mondial?user=viktor&password=0905Tech");
            System.out.println("Die Verbindung zum Server wurde erfolgreich aufgebaut!");
            System.out.println();

            PreparedStatement ps = con.prepareStatement(            //Preparestatement, somit kann nur der Server die Abfrage ausführen, nicht der User
                            "select * \n" +
                            "from city\n" +
                            "join country on city.country = country.code\n" +
                            "where country.name = ?");

            ps.setString(1, land);                  // par.Index -> 1 -> es ist der Index fürs Land (User Input)

            ResultSet rs = ps.executeQuery();                   // Das Ergebnis der Abfrage wird in ResultSet (rs) gespeichert
            ResultSetMetaData meta = rs.getMetaData();

            for (int i = 1; i < meta.getColumnCount(); i++) {

                System.out.printf("| %-35s",meta.getColumnName(i));
            }
            System.out.println("|");
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i < meta.getColumnCount(); i++) {

                    System.out.printf("| %-35s", rs.getString(i));
                }
                System.out.println("|");
            }

        } catch (SQLException sqe) {
            sqe.printStackTrace();
        }
    }
}
