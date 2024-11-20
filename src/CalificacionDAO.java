import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CalificacionDAO {
   public Calificacion mostrarCalificacion(int id) throws SQLException{
      Connection con = Connector.connect();
      Calificacion calificacion = null;
      String sql = "SELECT id_calificacion, id_usuario, puntuacion, resena FROM calificacion WHERE id_calificacion = ?";

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, id);

      ResultSet rs = ps.executeQuery();

      if(rs.next()) {
         int idCalificacion = rs.getInt("id_calificacion");
         int idUsuario = rs.getInt("id_usuario");
         int puntuacion = rs.getInt("puntuacion");
         String resena = rs.getString("resena");

         calificacion = new Calificacion(idCalificacion, idUsuario, puntuacion, resena);
      }
      return calificacion;
   }

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

   public int actualizarCalificacion(Calificacion calificacion) throws SQLException{
      Connection con = Connector.connect();
      String sql = "UPDATE calificacion SET id_usuario = ?, puntuacion = ?, resena = ? WHERE id_calificacion = ?";

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, calificacion.getIdUsuario());
      ps.setInt(2, calificacion.getPuntuacion());
      ps.setString(3, calificacion.getResena());
      ps.setInt(4, calificacion.getIdCalificacion());

      int result = ps.executeUpdate();
      Connector.closePreparedStatement(ps);
      Connector.closeConnection(con);

      return result;

   }

   public int eliminarCalificacion(Calificacion calificacion) throws SQLException{
      Connection con = Connector.connect();

      String sql = "DELETE FROM calificacion WHERE id_calificacion = ?";

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, calificacion.getIdCalificacion());

      int result = ps.executeUpdate();

      Connector.closePreparedStatement(ps);
      Connector.closeConnection(con);

      return result;
   }
}
