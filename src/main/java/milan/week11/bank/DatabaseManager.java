package milan.week11.bank;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
