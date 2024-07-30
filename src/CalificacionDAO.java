import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CalificacionDAO {
   public void insertarCalificacion(Calificacion calificacion, Connection connection) throws SQLException{
      //Crear la variable
      String sql = "INSERT INTO calificacion VALUES (?, ?, ?, ?);";
      //Crear la galeria de importación
      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setInt(1, calificacion.getIdCalificacion());
      statement.setInt(2, calificacion.getIdUsuario());
      statement.setInt(3, calificacion.getPuntuacion());
      statement.setString(4, calificacion.getResena());

      System.out.println("Datos enviados a BBDD");

      statement.executeUpdate();
      statement.close();
   }
}
