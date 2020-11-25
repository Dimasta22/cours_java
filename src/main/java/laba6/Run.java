package laba6;

import java.sql.SQLException;

public class Run {
    public static void main(String[] args) throws SQLException {
        DataDB dataDB = new DataDB();
        dataDB.checkDB();
    }
}
