package laba6;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ManagerDB {

    private final ConnectionDB database = new ConnectionDB();

    public ManagerDB() {
        System.out.println("Trying to connect to the database...");
        database.connect();
    }

    public void exit() {
        System.out.println("Exiting and closing the connection...");
        database.closeConnection();
    }

    public void create(String name, String surname, int age, String faculty) {
        String sql = "INSERT INTO students (name, surname, age, faculty) VALUES (?, ?, ?, ?)";
        try {
            executeInsertQuery(sql, name, surname, age, faculty);
            System.out.println("Successfully created a student!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void searchByAge(int age) {
        String sql = "SELECT * FROM Students WHERE age = ?";
        try {
            executeSelectQuery(sql, age);
            System.out.println("Successfully performed a search!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void clearTable() {
        String sql = "DELETE FROM Students";
        try {
            PreparedStatement query = database.getConnection().prepareStatement(sql);
            query.executeUpdate();
            query.close();
            System.out.println("Successfully cleared the database!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void executeInsertQuery(String sql, String name, String surname, int age,
                                    String faculty) throws SQLException {
        PreparedStatement query = database.getConnection().prepareStatement(sql);
        query.setString(1, name);
        query.setString(2, surname);
        query.setInt(3, age);
        query.setString(4, faculty);
        query.executeUpdate();
        query.close();
    }

    private void executeSelectQuery(String sql, int age) throws SQLException {
        PreparedStatement query = database.getConnection().prepareStatement(sql);
        query.setInt(1, age);
        printQueryResults(query.executeQuery());
        query.close();
    }

    private void printQueryResults(ResultSet result) throws SQLException {
        ResultSetMetaData meta = result.getMetaData();
        int i = 1;
        while (result.next()) {
            System.out.print("Row " + i++ + ": ");
            for (int j = 1; j < meta.getColumnCount() + 1; j++) {
                System.out.print(meta.getColumnLabel(j) + ": " + result.getObject(j) + ", ");
            }
            System.out.println();
        }
    }
}
