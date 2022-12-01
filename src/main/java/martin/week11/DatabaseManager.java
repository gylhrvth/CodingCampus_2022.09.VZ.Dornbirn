package martin.week11;


import martin.week11.zahlungssystem.Database;
import martin.week11.zahlungssystem.model.Konto;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Funktionen werden mit c,r,u,d und TBL bearbeitet.
 * i.E. cTBL kreiert eine neue Tabelle.
 */
public class DatabaseManager {
    private Database database;

    public DatabaseManager(Database database) {
        this.database = database;
    }

    // execute planned table creation Funktion
    public void zhlngsystmTBL() throws SQLException {
        //create Konto Tabelle
        exUp("""
                CREATE TABLE IF NOT EXISTS `konto` (
                `iban` int NOT NULL AUTO_INCREMENT,
                `stand` int NOT NULL DEFAULT '0',
                PRIMARY KEY (`iban`)
                )""");
        //create Kunde Tabelle
        exUp("""
                CREATE TABLE IF NOT EXISTS `kunde` (
                `kundenid` int NOT NULL AUTO_INCREMENT,
                `name` varchar(45) DEFAULT NULL,
                PRIMARY KEY (`kundenid`)
                )""");
        //create Konto zu Kunde Beziehungstabelle
        exUp("""
                CREATE TABLE IF NOT EXISTS `kundekonto` (
                `kundenid_fk` int NOT NULL,
                `iban_fk` int NOT NULL,
                `rolle` varchar(25) DEFAULT NULL,
                PRIMARY KEY (`kundenid_fk`,`iban_fk`),
                KEY `fk_konto_idx` (`iban_fk`),
                CONSTRAINT `fk_konto` FOREIGN KEY (`iban_fk`) REFERENCES `konto` (`iban`),
                CONSTRAINT `fk_kunde` FOREIGN KEY (`kundenid_fk`) REFERENCES `kunde` (`kundenid`)
                )""");
        //create Transaktionen Tabelle
        exUp("""
                CREATE TABLE `transaktion` (
                `tan` int NOT NULL,
                `betrag` int NOT NULL DEFAULT '0',
                `datum` date DEFAULT NULL,
                `quell_iban_fk` int DEFAULT NULL,
                `ziel_iban_fk` int DEFAULT NULL,
                PRIMARY KEY (`tan`),
                KEY `fk_quelliban_idx` (`quell_iban_fk`),
                KEY `fk_zieliban_idx` (`ziel_iban_fk`),
                CONSTRAINT `fk_quelliban` FOREIGN KEY (`quell_iban_fk`) REFERENCES `konto` (`iban`),
                CONSTRAINT `fk_zieliban` FOREIGN KEY (`ziel_iban_fk`) REFERENCES `konto` (`iban`)
                )""");
    }

    // execute insertion of sample data
    public void zhlngsystmLNS() throws SQLException {
//Insert sample Kontos
        exUp("""
                INSERT INTO `konto` VALUES (1,1465),(2,3154),(3,2254),(4,2115231543);
                    """);
        //Insert sample Kunden
        exUp("""
                INSERT INTO `kunde` VALUES (1,'Gerhard Itschet'),(2,'Abigail Mauenhatter'),
                (3,'Aurelio Reifenmetzger'),(4,'Martin Widhalm');
                """);
        //Insert Kunde to Konto sample links
        exUp("""
                INSERT INTO `kundekonto` VALUES (1,1,'besitzer'),(2,2,'besitzer'),(3,3,'besitzer'),
                (4,1,'verwalter'),(4,2,'verwalter'),(4,3,'verwalter'),(4,4,'besitzer');
                """);
        //Insert sample transactions
        exUp("""
                """);
    }

    //execute singular Update Funktion
    private void exUp(String sql) throws SQLException {
        PreparedStatement statement = database.gCon().prepareStatement(sql);
        try {
            statement.executeUpdate();
        } catch (SQLException exc) {
            System.out.println("That failed: " + exc.getMessage());
            throw exc;
        } finally {
            statement.close();
        }
    }

    // execute singular Delete Funktion
    public void dropTable(String tablename) throws SQLException {
        exUp("DROP TABLE " + tablename);
    }

    // execute plural Delete Funktion (List)
    public void dTBL(List<String> tableNames) throws SQLException {
        for (String table : tableNames) {
            dropTable(table);
        }
    }

    // execute plural Delete Funktion (Array)
    public void dTBL(String[] tableNames) throws SQLException {
        for (String table : tableNames) {
            dropTable(table);
        }
    }
    //execute dataSetInsertion
    public int iKonto (Konto konto){
        return 3;
    }
}
