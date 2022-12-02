package michel.week11.Bank;

import michel.week11.Bank.Tables.Database;
import michel.week11.Bank.Tables.Kunde;

import java.sql.*;
import java.util.List;
import java.util.Vector;


public class DatabaseManager {
    private static DatabaseManager instance = null;

    private Database database;

    public DatabaseManager() {
        try{
            database = new Database();
            database.connect();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static DatabaseManager getInstance() {
        if(instance == null){
            instance = new DatabaseManager();
        }
        return instance;
    }
    public void executeUpdate(String sql) throws SQLException {
        PreparedStatement preparedStatement = database.getConnection().prepareStatement(sql);
        try {
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Failed: " + e.getMessage());
            throw e;
        } finally {
            preparedStatement.close();
        }
    }

    public void dropTable() throws SQLException {
        executeUpdate("DROP TABLE KundenKonto");
        executeUpdate("DROP TABLE Transaktion");
        executeUpdate("DROP TABLE Konto");
        executeUpdate("DROP TABLE Kunde");

    }

    public void createTable() throws SQLException {
        executeUpdate("CREATE TABLE IF NOT EXISTS `Kunde` (" +
                "  `KdNr` int NOT NULL," +
                "  `Vorname` varchar(25) NOT NULL," +
                "  `Nachname` varchar(25) NOT NULL," +
                "  `Telefonnummer` varchar(25) DEFAULT NULL," +
                "  PRIMARY KEY (`KdNr`)" +
                ")");
        executeUpdate("CREATE TABLE IF NOT EXISTS `Konto` (\n" +
                "  `Kontonummer` int NOT NULL,\n" +
                "  `Besitzer` varchar(45) NOT NULL,\n" +
                "  `Kontostand` decimal(25,0) NOT NULL,\n" +
                "  PRIMARY KEY (`Kontonummer`)\n" +
                ")");
        executeUpdate("CREATE TABLE IF NOT EXISTS `KundenKonto` (\n" +
                "  `fk_Kundennummer` int NOT NULL,\n" +
                "  `fk_Kontonummer` int NOT NULL,\n" +
                "  PRIMARY KEY (`fk_Kundennummer`,`fk_Kontonummer`),\n" +
                "  KEY `fk_Kontonummer_idx` (`fk_Kontonummer`),\n" +
                "  CONSTRAINT `fk_Kontonummer` FOREIGN KEY (`fk_Kontonummer`) REFERENCES `Konto` (`Kontonummer`),\n" +
                "  CONSTRAINT `fk_Kundennummer` FOREIGN KEY (`fk_Kundennummer`) REFERENCES `Kunde` (`KdNr`)\n" +
                ") ");
        executeUpdate("CREATE TABLE IF NOT EXISTS `Transaktion` (\n" +
                "  `Transaktionsnummer` int NOT NULL,\n" +
                "  `Betrag` decimal(15,0) NOT NULL,\n" +
                "  `Datum` date NOT NULL,\n" +
                "  `Quelle` int NOT NULL,\n" +
                "  `Ziel` int NOT NULL,\n" +
                "  PRIMARY KEY (`Transaktionsnummer`),\n" +
                "  KEY `fk_Kontonummer_idx` (`Quelle`),\n" +
                "  KEY `fk_Kontonummer_Z_idx` (`Ziel`),\n" +
                "  CONSTRAINT `fk_Kontonummer_Q` FOREIGN KEY (`Quelle`) REFERENCES `Konto` (`Kontonummer`),\n" +
                "  CONSTRAINT `fk_Kontonummer_Z` FOREIGN KEY (`Ziel`) REFERENCES `Konto` (`Kontonummer`)\n" +
                ")");
    }

    public void insertKunde(Kunde k) throws SQLException {

        PreparedStatement preparedStatement = database.getConnection().prepareStatement("INSERT INTO " +
                "`DatenbankAnwendung`.`Kunde` " +
                "(`KdNr`, `Vorname`, `Nachname`, `Telefonnummer`)" +
                " VALUES (?, ?, ?, ?);");
        preparedStatement.setInt(1, k.getKundennummer());
        preparedStatement.setString(2, k.getVorname());
        preparedStatement.setString(3, k.getNachname());
        preparedStatement.setString(4, k.getTelefonnummer());
        preparedStatement.executeUpdate();

    }

    public void updateKunde(Kunde k)throws SQLException{
        if(k.getNachname() == null){
            System.out.println("Kunde ist nich in der Datenbank");
        }
        PreparedStatement preparedStatement = database.getConnection().prepareStatement("UPDATE "+
                "`DatenbankAnwendung`.`Kunde` " +
                "SET (`Vorname`, `Nachname`, `Telefonnummer`) WHERE KdNr = ?" +
                " VALUES (?, ?, ?, ?);");
        preparedStatement.setString(1,k.getVorname());
        preparedStatement.setString(2,k.getNachname());
        preparedStatement.setString(3,k.getTelefonnummer());
        preparedStatement.setInt(4,k.getKundennummer());
    }

    public void deleteKunde(Kunde k) throws SQLException{
        PreparedStatement preparedStatement = database.getConnection().prepareStatement("DELETE FROM " +
                "`DatenbankAnwendung`.`Kunde` " +
                "WHERE KdNr = ?");
        preparedStatement.setInt(1,k.getKundennummer());
    }

    public List<Kunde> getKunde(String KundenNummer) throws SQLException{
       PreparedStatement preparedStatement = database.getConnection().prepareStatement("SELECT * " +
               "FROM Kunde WHERE KdNr = ?");
       preparedStatement.setString(1,KundenNummer);
        ResultSet rs = preparedStatement.executeQuery();
        List<Kunde> kundenListe = new Vector<>();
            while (rs.next()) {
                kundenListe.add(new Kunde(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
            }
        return kundenListe;
    }

//    public void printQueryTable() {
//        try {
//            ResultSet rs = database.getConnection().createStatement().executeQuery("SELECT * FROM Kunde;");
//            ResultSetMetaData metaData = rs.getMetaData();
//            for (int i = 1; i <= metaData.getColumnCount(); i++) {
//                System.out.printf("| %" +
//                        (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "") +
//                        metaData.getPrecision(i) + "s", metaData.getColumnName(i));
//            }
//            System.out.println("|");
//
//            while (rs.next()) {
//                for (int i = 1; i <= metaData.getColumnCount(); i++) {
//                    System.out.printf("| %" +
//                            (metaData.getColumnTypeName(i).equals("VARCHAR") ? "-" : "")
//                            + metaData.getPrecision(i) + "s", rs.getString(i));
//                }
//                System.out.println("|");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}

