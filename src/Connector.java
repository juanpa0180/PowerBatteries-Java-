import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
        public static Connection connect() throws SQLException{
//            String url = "jdbc:mysql://localhost:3306/power_batteries";//Cambia dependiendo de la BD que usemos
//            String user = "root";
//            String password = "^2u%c^rG2!^o9G6"; //Cambia dependiendo de la BD que usemos

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/power_batteries_2",
                    "root", "^2u%c^rG2!^o9G6");

            System.out.println("Conexión exitosa a la BBDD");
            connection.close();

            //Crear retorno
            return connection;
        }
}
