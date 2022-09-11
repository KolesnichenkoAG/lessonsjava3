package lesson2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class lesson2Main {

    public static void main(String[] args) {
       try {
           connect();
       } catch (ClassNotFoundException | SQLException e) {
           throw new RuntimeException(e);
       }
        try {
            statement.execute("INSERT INTO students (id, name, score) VALUES (5, 'ALEX5', 3)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Connection connection;
    private static Statement statement;
    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:students_java3_lesson2.db");
        statement = connection.createStatement();
    }
}
