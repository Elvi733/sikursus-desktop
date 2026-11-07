package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
<<<<<<< HEAD
private static final String URL =
"jdbc:mysql://localhost:3306/db_sikursus";
private static final String USER = "root";
private static final String PASS = "";

private Database() {
// Mencegah object Database dibuat sembarangan.
}
public static Connection getConnection() throws SQLException {
return DriverManager.getConnection(URL, USER, PASS);
}
=======
    private static final String URL = "jdbc:mysql://localhost:3306/db_sikursus?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = ""; // Kosongkan jika XAMPP tidak pakai password

    private Database() {}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
>>>>>>> b48d638000f112bca0ad178e196a2cba7f02d08a
}