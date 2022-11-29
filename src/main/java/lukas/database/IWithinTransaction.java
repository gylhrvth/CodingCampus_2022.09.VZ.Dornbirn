package lukas.database;

import java.sql.SQLException;

public interface IWithinTransaction {
    void withinTransaction() throws SQLException;
}
