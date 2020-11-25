package laba6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDB {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Univer";
    static final String USER = "postgres";
    static final String PASSWORD = "1111";
    private Connection conn = null;

    public void connect() {
        try {
            this.conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connected to the database.");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return this.conn;
    }

    public void closeConnection() {
        try {
            this.conn.close();
            System.out.println("Closed the connection.");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
