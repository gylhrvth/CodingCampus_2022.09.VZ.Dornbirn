package lukas.week10.uebungsfirma;


import lukas.week10.Database;
import lukas.week10.uebungsfirma.model.Mitarbeiter;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
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
        executeUpdate("DROP TABLE mitarbeiterprojekt");
        executeUpdate("DROP TABLE mitarbeiter");
        executeUpdate("DROP TABLE abteilung");
        executeUpdate("DROP TABLE projekt");
    }

    public void createTables() throws SQLException {
        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `abteilung` (
                  `Abteilungsnummer` int NOT NULL AUTO_INCREMENT,
                  `Name` varchar(45) NOT NULL,
                  `Stockwerk` varchar(45) NOT NULL,
                  PRIMARY KEY (`Abteilungsnummer`)
                )""");
        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `mitarbeiter` (
                  `Svn` int NOT NULL AUTO_INCREMENT,
                  `Name` varchar(255) NOT NULL,
                  `abteilung_abteilungsnummer_fk` int DEFAULT NULL,
                  `vorgesetzter_fk` int DEFAULT NULL,
                  PRIMARY KEY (`Svn`),
                  KEY `fk_abteilung_idx` (`abteilung_abteilungsnummer_fk`),
                  KEY `fk_vorgesetzter_idx` (`vorgesetzter_fk`),
                  CONSTRAINT `fk_abteilung` FOREIGN KEY (`abteilung_abteilungsnummer_fk`) REFERENCES `abteilung` (`Abteilungsnummer`) ON DELETE SET NULL ON UPDATE CASCADE,
                  CONSTRAINT `fk_vorgesetzter` FOREIGN KEY (`vorgesetzter_fk`) REFERENCES `mitarbeiter` (`Svn`) ON DELETE SET NULL ON UPDATE CASCADE
                )
                """);
        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `projekt` (
                  `ProjektName` varchar(30) NOT NULL,
                  `Startdatum` date DEFAULT NULL,
                  `Enddatum` date DEFAULT NULL,
                  PRIMARY KEY (`ProjektName`)
                )
                """);
        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `mitarbeiterprojekt` (
                  `Mitarbeiter_Svn_fk` int NOT NULL,
                  `Projekt_ProjektName_fk` varchar(30) NOT NULL,
                  `von` datetime NOT NULL,
                  `bis` datetime DEFAULT NULL,
                  PRIMARY KEY (`Mitarbeiter_Svn_fk`,`Projekt_ProjektName_fk`,`von`),
                  KEY `fk_projekt_idx` (`Projekt_ProjektName_fk`),
                  CONSTRAINT `fk_mitarbeiter` FOREIGN KEY (`Mitarbeiter_Svn_fk`) REFERENCES `mitarbeiter` (`Svn`) ON DELETE CASCADE ON UPDATE CASCADE,
                  CONSTRAINT `fk_projekt` FOREIGN KEY (`Projekt_ProjektName_fk`) REFERENCES `projekt` (`ProjektName`) ON DELETE CASCADE ON UPDATE CASCADE
                )
                """);
    }

    public int insertMitarbeiter(Mitarbeiter m1) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement("INSERT INTO " +
                "`uebungsfirmatest`.`mitarbeiter`" +
                "(`Name`, `abteilung_abteilungsnummer_fk`, `vorgesetzter_fk`)" +
                "VALUES (?, ?, ?);", PreparedStatement.RETURN_GENERATED_KEYS);
        statement.setString(1, m1.getName());
        if (m1.getAbteilungAbteilungsnummerFk() == 0) {
            statement.setNull(2, Types.INTEGER);
        } else {
            statement.setInt(2, m1.getAbteilungAbteilungsnummerFk());
        }
        if (m1.getVorgesetzterFk() == 0) {
            statement.setNull(3, Types.INTEGER);
        } else {
            statement.setInt(3, m1.getVorgesetzterFk());
        }
        int affectedRows = statement.executeUpdate();
        if (affectedRows > 0) {
            ResultSet set = statement.getGeneratedKeys();
            set.next();
            m1.setSvn(set.getInt(1));
        }
        return affectedRows;

    }

    public List<Mitarbeiter> getMitarbeiter() throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement("SELECT svn, name, abteilung_abteilungsnummer_fk, vorgesetzter_fk FROM mitarbeiter;");
        ResultSet resultSet = statement.executeQuery();
        List<Mitarbeiter> mitarbeiters = new ArrayList<>();
        while (resultSet.next()) {
            int svn = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int abteilungsFk = resultSet.getInt(3);
            int vorgesetzterFk = resultSet.getInt(4);
            Mitarbeiter mitarbeiter = new Mitarbeiter(name, abteilungsFk, vorgesetzterFk);
            mitarbeiter.setSvn(svn);
            mitarbeiters.add(mitarbeiter);
        }
        return mitarbeiters;
    }
}
