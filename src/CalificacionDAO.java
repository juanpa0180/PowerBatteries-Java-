import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CalificacionDAO {
   public int insertarCalificacion(Calificacion calificacion) throws SQLException{
      Connection con = Connector.connect();

      String sql = "INSERT INTO calificacion(id_calificacion, id_usuario, puntuacion, resena) VALUES (?, ?, ?, ?);";

      PreparedStatement statement = con.prepareStatement(sql);
      statement.setInt(1, calificacion.getIdCalificacion());
      statement.setInt(2, calificacion.getIdUsuario());
      statement.setInt(3, calificacion.getPuntuacion());
      statement.setString(4, calificacion.getResena());

      System.out.println("Datos enviados a BBDD");

      int result = statement.executeUpdate();
      Connector.closePreparedStatement(statement);
      Connector.closeConnection(con);
      return result;
   }
}
