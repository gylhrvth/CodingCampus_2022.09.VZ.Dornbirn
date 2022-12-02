package viktor.week11;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseManager {

    private Database db;

    public DatabaseManager(Database db) {
        this.db = db;
    }

    public void executeUpdate(String sql) throws SQLException {
        PreparedStatement ps = db.getCon().prepareStatement(sql);
        try {
            ps.executeUpdate();
        } catch (SQLException sqe) {
            System.out.println("Fehler: " + sqe.getMessage());
            throw sqe;
        } finally {
            ps.close();
        }


    }

    public void createTable() throws SQLException {
        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `bank`(
                 `BankID` int NOT NULL AUTO_INCREMENT,
                 `Name` varchar(45) NOT NULL,
                 `Standort` varchar(45) NOT NULL,
                  PRIMARY KEY (`BankID`)
                )
                """);

        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `kunde`(
                `KundenID` int NOT NULL AUTO_INCREMENT,
                `Name` varchar(45) NOT NULL,
                `Eintrittsdatum` date NOT NULL,
                `BankID_fk` int NOT NULL,
                PRIMARY KEY (`KundenID`),
                KEY `BankID_fk_idx` (`BankID_fk`),
                CONSTRAINT `BankID_fk` FOREIGN KEY (`BankID_fk`) REFERENCES `bank` (`BankID`) ON DELETE CASCADE ON UPDATE CASCADE
                  )
                   """);

        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `konto` (
                 `KontoID` int NOT NULL AUTO_INCREMENT,
                  `Kontostand` decimal(9,2) NOT NULL,
                  `IBAN_Nr` varchar(45) NOT NULL,
                  PRIMARY KEY (`KontoID`),
                  UNIQUE KEY `IBAN_Nr_UNIQUE` (`IBAN_Nr`) 
                  )
                """);

        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `Rolle`(
                 `Kunde_KundenID_fk` int NOT NULL,
                  `Konto_KontoID_fk` int NOT NULL,
                  `Rolle` enum('B','ZB') NOT NULL,
                  PRIMARY KEY (`Kunde_KundenID_fk`,`Konto_KontoID_fk`),
                  KEY `Konto_KontoID_fk_idx` (`Konto_KontoID_fk`),
                  CONSTRAINT `Konto_KontoID_fk` FOREIGN KEY (`Konto_KontoID_fk`) REFERENCES `konto` (`KontoID`) ON DELETE CASCADE ON UPDATE CASCADE,
                  CONSTRAINT `Kunde_KundenID_fk` FOREIGN KEY (`Kunde_KundenID_fk`) REFERENCES `kunde` (`KundenID`) ON DELETE CASCADE ON UPDATE CASCADE
                )
                """);

        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `Transaktion`(
                  `TransID` int NOT NULL AUTO_INCREMENT,
                  `Konto_KontoID_fk_Quellkonto` int NOT NULL,
                  `Konto_KontoID_fk_Zielkonto` int NOT NULL,
                  `Betrag` decimal(9,2) NOT NULL,
                  PRIMARY KEY (`TransID`),
                  KEY `Konto_KontoID_fk_Quellkonto_idx` (`Konto_KontoID_fk_Quellkonto`),
                  KEY `Konto_KontoID_fk_Zielkonto_idx` (`Konto_KontoID_fk_Zielkonto`),
                  CONSTRAINT `Konto_KontoID_fk_Quellkonto` FOREIGN KEY (`Konto_KontoID_fk_Quellkonto`) REFERENCES `konto` (`KontoID`),
                  CONSTRAINT `Konto_KontoID_fk_Zielkonto` FOREIGN KEY (`Konto_KontoID_fk_Zielkonto`) REFERENCES `konto` (`KontoID`) ON DELETE CASCADE ON UPDATE CASCADE
                )
                """);
    }

    public int insertItemToTable() throws SQLException {

        PreparedStatement ps = db.getCon().prepareStatement("INSERT INTO " +
                " `rolle`" +
                "(`Kunde_KundenID_fk`,`Konto_KontoID_fk`,`Rolle`)" +
                "VALUES (6, 4, 'B');");

        int affectedRows = ps.executeUpdate();

        return affectedRows;

    }


    public int updateItemInATable() throws SQLException {

        PreparedStatement ps = db.getCon().prepareStatement("UPDATE konto SET kontostand = (5000.87 + 20000)"+
                                                                "WHERE kontoid = 4 ");
        int affectedRows = ps.executeUpdate();

        return affectedRows;

    }



    public int deleteItemFromATable() throws SQLException {

        PreparedStatement ps = db.getCon().prepareStatement("DELETE FROM konto where kontoid = 1");
        int affectedRows = ps.executeUpdate();
        return affectedRows;

    }


    public void dropTables() throws SQLException {
        executeUpdate("DROP TABLE bank");
        executeUpdate("DROP TABLE kunde");
        executeUpdate("DROP TABLE konto");
        executeUpdate("DROP TABLE rolle");
        executeUpdate("DROP TABLE transaktion");

    }


}
