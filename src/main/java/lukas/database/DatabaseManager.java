package lukas.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"TryFinallyCanBeTryWithResources", "unused", "ClassCanBeRecord"})
public class DatabaseManager {
    private final Database database;

    public DatabaseManager(Database database) {
        this.database = database;
    }

    public <E extends IFromResultSet> List<E> readMultiple(Class<E> data, String query) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement(query);
        try {
            ResultSet resultSet = statement.executeQuery();
            List<E> elements = new ArrayList<>();

            while (resultSet.next()) {
                try {
                    E element = data.getDeclaredConstructor().newInstance();
                    element.fillFromResultSet(resultSet);
                    elements.add(element);
                } catch (Exception exc) {
                    throw new RuntimeException(exc);
                }
            }
            return elements;
        } finally {
            statement.close();
        }
    }

    public void runWithinTransaction(IWithinTransaction withinTransaction) throws SQLException {
        Connection connection = database.getConnection();
        try {
            withinTransaction.withinTransaction();
            connection.commit();
        } catch (SQLException exc) {
            connection.rollback();
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public boolean update(IToStatement data, String query) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement(query);
        try {
            data.fillStatement(statement);
            int rows = statement.executeUpdate();
            return rows > 0;
        } finally {
            statement.close();
        }
    }

    public long insert(IToStatement data, String query) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement(query);
        try {
            data.fillStatement(statement);
            int rows = statement.executeUpdate();
            if (rows > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()) {
                    long id = resultSet.getLong(1);
                    data.setId(id);
                    return id;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } finally {
            statement.close();
        }
    }

    public int delete(String query) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement(query);
        try {
            return statement.executeUpdate();
        } finally {
            statement.close();
        }
    }

    public <E extends IFromResultSet> E read(Class<E> data, String query) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement(query);
        try {
            ResultSet resultSet = statement.executeQuery();
            List<E> elements = new ArrayList<>();

            while (resultSet.next()) {
                try {
                    E element = data.getDeclaredConstructor().newInstance();
                    element.fillFromResultSet(resultSet);
                    elements.add(element);
                } catch (Exception exc) {
                    throw new RuntimeException(exc);
                }
            }
            return elements.size() > 0 ? elements.get(0) : null;
        } finally {
            statement.close();
        }
    }
}
