import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connector {
        public static Connection connect() throws SQLException{
            String url = "jdbc:mysql://localhost:3306/power_batteries_2";
            String user = "root";
            String password = "Mj2Am7%2xA#%&5J";

            Connection connection = DriverManager.getConnection(url, user, password);

            return connection;
        }

        public static void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
            preparedStatement.close();
        }

        public static void closeConnection(Connection connection) throws SQLException {
            connection.close();
        }
}
