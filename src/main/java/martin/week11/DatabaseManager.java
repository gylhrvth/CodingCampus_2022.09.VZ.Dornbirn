package martin.week11;


import lukas.week10.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
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

    // execute singular create Funktion
    public void cTbl(String sql) throws SQLException{
        exUp("Ipsum Larum");
    }

    //execute singular Update Funktion
    private void exUp(String sql) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
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
}
