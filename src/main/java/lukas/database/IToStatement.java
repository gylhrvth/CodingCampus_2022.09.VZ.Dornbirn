package lukas.database;

import java.sql.PreparedStatement;

public interface IToStatement {
    void fillStatement(PreparedStatement preparedStatement);
    void setId(long id);
}
