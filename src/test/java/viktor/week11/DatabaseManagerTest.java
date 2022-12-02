package viktor.week11;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import viktor.week11.Kunde;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseManagerTest {

    private Database db;
    private DatabaseManager dbm;


    @BeforeEach
    public void setUp() throws SQLException {

        db = new BankTestDB();
        db.connect();
        dbm = new DatabaseManager(db);

        try {
            dbm.dropTables();
        } catch (SQLException sqe) {
        }

        try {
            dbm.createTable();
        } catch (SQLException sqe) {

        }

    }

    @Test
    public void testCreateSchema() {
        try {
            dbm.dropTables();
        } catch (SQLException sqe) {
        }

        try {
            dbm.createTable();
        } catch (SQLException sqe) {
            System.out.println("Schemaerstellung fehlgeschlagen!" + sqe.getMessage());
        }

    }

    @Test
    public void testDropTableSchema(){

        try{
            dbm.dropTables();
        } catch(SQLException sqe){
            Assertions.fail("Löschen der Tabellen fehlgeschlagen!" + sqe.getMessage());
        }

        try{
            dbm.dropTables();
        } catch(SQLException sqe){
            System.out.println("Löschen der Tabellen war nicht erfolgreich!");
        }

    }


    @Test
    public void testInsertItemToTable() {
        String date = "2022-11-21";
        Date sqlDate = Date.valueOf(date);

        Kunde kunde = new Kunde(1, "Peter", sqlDate, 1);

        try {
            PreparedStatement ps = db.getCon().prepareStatement("INSERT INTO " +
                    " `kunde`" +
                    "(`Name`,`Eintrittsdatum`,`BankID_fk`)" +
                    "VALUES (?, ?, ?);");
            ps.setString(1, kunde.getName());
            ps.setDate(2, kunde.getEintritt());
            ps.setInt(3, kunde.getBankidfk());

            ps.executeUpdate();
        } catch (SQLException sqe) {
            Assertions.fail("Das Einfügen wurde fehlgeschlagen!" + sqe.getMessage());
        }
    }

    @AfterEach
    public void tearDown() {
        try{
            if (db.getCon() != null){
                db.disconnect();
            }
        }catch(SQLException sqe){

        }
    }
}