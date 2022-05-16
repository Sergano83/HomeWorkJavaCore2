package DZ8;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//public class DbConnection {
//    private Connection connection;
//    private Statement statement;
//
//    public DbConnection() {
//        try {
//            connection = DriverManager.getConnection("jdbc:mysql://@localhost:3306/gb_test", "root", "root");
//            statement = connection.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS weather" +
//                    "(" +
//                    "city TEXT NOT NULL," +
//                    "localDate TEXT NOT NULL," +
//                    "weatherText TEXT NOT NULL," +
//                    "temperature DOUBLE NOT NULL" +
//                    ");");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}