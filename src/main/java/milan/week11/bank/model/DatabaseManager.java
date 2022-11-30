package milan.week11.bank.model;

import milan.week11.bank.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    private Database database;

    public DatabaseManager(Database database) {
        this.database = database;
    }

    private void executeUpdate(String sql) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        try {
            statement.executeUpdate();
        } catch (SQLException exc) {
            System.err.println("That failed: " + exc.getMessage());
            throw exc;
        } finally {
            statement.close();
        }
    }

    public void dropTables() throws SQLException {
        executeUpdate("DROP TABLE kundekontoverbindung");
        executeUpdate("DROP TABLE transaktion");
        executeUpdate("DROP TABLE konto");
        executeUpdate("DROP TABLE kunde");


    }

    public void createTables() throws SQLException {
        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `konto` (
                `KontoNummer` int NOT NULL,
                `Kontostand` decimal(10,2) DEFAULT NULL,
                PRIMARY KEY (`KontoNummer`)
                )
                """);
        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `kunde` (
                `KundenNummer` int NOT NULL AUTO_INCREMENT,
                `Name` varchar(45) DEFAULT NULL,
                PRIMARY KEY (`KundenNummer`)
                )
                """);
        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `transaktion` (
                `TransaktionsNummer` int NOT NULL AUTO_INCREMENT,
                `Datum` date DEFAULT NULL,
                `Referenz` varchar(45) DEFAULT NULL,
                `Betrag` int DEFAULT NULL,
                `Quelle` int DEFAULT NULL,
                `Ziel` int DEFAULT NULL,
                PRIMARY KEY (`TransaktionsNummer`),
                KEY `Quelle_Kontonummer_fk_idx` (`Quelle`),
                KEY `Ziel_Kontonummer_fk_idx` (`Ziel`),
                CONSTRAINT `Quelle_Kontonummer_fk` FOREIGN KEY (`Quelle`) REFERENCES `konto` (`KontoNummer`) ON UPDATE CASCADE,
                CONSTRAINT `Ziel_Kontonummer_fk` FOREIGN KEY (`Ziel`) REFERENCES `konto` (`KontoNummer`) ON UPDATE CASCADE
                )
                """);
        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `kundekontoverbindung` (
                `fk_KontoNummer` int NOT NULL,
                `fk_KundenNummer` int NOT NULL,
                `Rolle` varchar(45) DEFAULT NULL,
                PRIMARY KEY (`fk_KontoNummer`,`fk_KundenNummer`),
                KEY `KundeKontoVerbindung_Kunde_KundenNummer_fk_idx` (`fk_KundenNummer`),
                CONSTRAINT `KundeKontoVerbindung_Konto_KontoNummer_fk` FOREIGN KEY (`fk_KontoNummer`) REFERENCES `konto` (`KontoNummer`) ON DELETE CASCADE ON UPDATE CASCADE,
                CONSTRAINT `KundeKontoVerbindung_Kunde_KundenNummer_fk` FOREIGN KEY (`fk_KundenNummer`) REFERENCES `kunde` (`KundenNummer`) ON DELETE CASCADE ON UPDATE CASCADE
                )
                """);
    }

    public int insertKunde(Kunde kunde) throws SQLException {
        if (kunde.getKundenNummer() != null) {
            System.out.println("Kunde ist bereit persistiert. Kann nicht noch einmal zugefügt werden");
            return 0;
        }
        PreparedStatement statement = database.getConnection().prepareStatement("INSERT INTO " +
                "`banktest`.`kunde`" +
                "(`Name`)" +
                "VALUES (?);", PreparedStatement.RETURN_GENERATED_KEYS);
        statement.setString(1, kunde.getName());
        int affectedRows = statement.executeUpdate();
        if (affectedRows > 0) {
            ResultSet set = statement.getGeneratedKeys();
            set.next();
            kunde.setKundenNummer(set.getInt(1));
        }
        return affectedRows;
    }

    public int updateKunde(Kunde kunde) throws SQLException {
        if (kunde.getKundenNummer() == null) {
            System.out.println("Kunde ist noch nicht in der Datenbank.");
            return 0;
        }
        PreparedStatement statement = database.getConnection().prepareStatement("UPDATE " +
                "`banktest`.`kunde`" +
                " set name = ? WHERE KundenNummer = ?");
        statement.setString(1, kunde.getName());
        statement.setInt(2, kunde.getKundenNummer());
        int affectedRows = statement.executeUpdate();
        return affectedRows;
    }

    public int deleteKunde(Kunde kunde) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement("DELETE FROM " +
                "`banktest`.`kunde`" +
                " WHERE KundenNummer = ?");
        statement.setInt(1, kunde.getKundenNummer());
        int affectedRows = statement.executeUpdate();
        return affectedRows;
    }


    public List<Kunde> getKunde() throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement("SELECT KundenNummer, Name FROM kunde;");
        ResultSet resultSet = statement.executeQuery();
        List<Kunde> kunden = new ArrayList<>();
        while (resultSet.next()) {
            int kundennummer = resultSet.getInt(1);
            String name = resultSet.getString(2);
            Kunde kunde = new Kunde(kundennummer, name);
            kunden.add(kunde);
        }
        return kunden;
    }

    public int insertKonto(Konto konto) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement("INSERT INTO " +
                "`banktest`.`konto`" +
                "(`KontoNummer`, `Kontostand`)" +
                "VALUES (?,?);", PreparedStatement.RETURN_GENERATED_KEYS);
        statement.setInt(1, konto.getKontoNummer());
        statement.setDouble(2, konto.getKontostand());
        int affectedRows = statement.executeUpdate();
        return affectedRows;
    }

}
