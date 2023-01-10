package stefan.week12.Bank;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class DatenBaseManger {

    private DatabaseBank databaseBank;

    public DatenBaseManger(DatabaseBank databaseBank) {
        this.databaseBank = databaseBank;
    }

    public DatenBaseManger() {
        try {
            databaseBank = new DatabaseBank();
            databaseBank.connect();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }


    public void insertKunde(Kunde kunde) {
        try {
            PreparedStatement statement = databaseBank.getConnection().prepareStatement("INSERT INTO" + "`bank`.`kunde`" +
                    "(`kundenName`)" + "VALUES (?);", PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, kunde.getKundenname());

            int affectedRows = statement.executeUpdate();
            if (affectedRows > 0) {
                ResultSet set = statement.getGeneratedKeys();
                set.next();
                kunde.setKundenId(set.getInt(1));
            } else {
                System.out.println("Insert Kunde ist schiefgelaufen.");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void insertKonto(Konten konten) {
        try {
            PreparedStatement statement = databaseBank.getConnection().prepareStatement("INSERT INTO" + "`bank`.`konten`" +
                    "(`kontenummer`,`kontostand`)" + "VALUES (?,?);", PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setInt(1, konten.getKontenummer());
            statement.setInt(2, konten.getKontostand());
            statement.executeUpdate();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }

    public void kundeKontonummerVerbindung(Konten konten, Kunde kunde) {
        try {
            PreparedStatement statement = databaseBank.getConnection().prepareStatement("""
                    INSERT INTO kundekontoverbindung (kundenid_fk ,kontennummer_fk) VALUES (?, ?);"""
            );
            statement.setInt(1, kunde.getKundenId());
            statement.setInt(2, konten.getKontenummer());
            int linesAffected = statement.executeUpdate();
            if (linesAffected == 1) {
                System.out.println("Kunde-Kontoverbindung wurde erfolgreich eingetragen");
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    private void executeUpdate(String sql) throws SQLException {
        PreparedStatement statement = databaseBank.getConnection().prepareStatement(sql);
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
        executeUpdate("DROP TABLE IF EXISTS transaktionen");
        executeUpdate("DROP TABLE IF EXISTS kundekontoverbindung");
        executeUpdate("DROP TABLE IF EXISTS kunde");
        executeUpdate("DROP TABLE IF EXISTS konten");
    }

    public void createTables() throws SQLException {
        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `konten` (
                  `Kontenummer` int NOT NULL,
                  `kontostand` varchar(45) DEFAULT NULL,
                  PRIMARY KEY (`Kontenummer`)
                ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
                """);

        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `kunde` (
                  `kundenId` int NOT NULL AUTO_INCREMENT,
                  `kundenName` varchar(45) DEFAULT NULL,
                  PRIMARY KEY (`kundenId`)
                ) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci""");


        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `kundekontoverbindung` (
                  `kundenid_fk` int NOT NULL,
                  `kontennummer_fk` int NOT NULL,
                  KEY `kunden_konten_verbindung_kontonummer_fk_idx` (`kontennummer_fk`),
                  CONSTRAINT `kunden_konten_verbindung_kontonummer_fk` FOREIGN KEY (`kontennummer_fk`) REFERENCES `konten` (`Kontenummer`)
                ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;""");

        executeUpdate("""
                CREATE TABLE IF NOT EXISTS `transaktionen` (
                  `Transaktionenid` int NOT NULL,
                  `ueberweisungen` varchar(45) DEFAULT NULL,
                  `betrag` int DEFAULT NULL,
                  `ziel` int DEFAULT NULL,
                  `quelle` int DEFAULT NULL,
                  PRIMARY KEY (`Transaktionenid`),
                  KEY `quelle_fk_idx` (`quelle`),
                  KEY `Ziel_fk_idx` (`ziel`),
                  CONSTRAINT `quelle_fk` FOREIGN KEY (`quelle`) REFERENCES `konten` (`Kontenummer`),
                  CONSTRAINT `Ziel_fk` FOREIGN KEY (`ziel`) REFERENCES `konten` (`Kontenummer`)
                ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;""");

    }

}
