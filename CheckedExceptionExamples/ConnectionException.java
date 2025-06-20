package CheckedExceptionExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionException {
    public static void main(String[] args) {
        try {
            Connection obj = DriverManager.getConnection("/app/files/mongodb");
        } catch (SQLException e) {
            System.out.println("We got an exception");
            System.out.println("Exception occurs because Database doesn't exist");
        }
    }
}