import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
   public Usuario mostrarUsuario(int id) throws SQLException{
      Connection con = Connector.connect();
      Usuario usuario = null;
      String sql = "SELECT id_usuario, nombre, apellido, telefono, direccion FROM usuario WHERE id_usuario = ?";

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, id);

      ResultSet rs = ps.executeQuery();

      if(rs.next()) {
         int idUsuario = rs.getInt("id_usuario");
         String nombre = rs.getString("nombre");
         String apellido = rs.getString("apellido");
         String telefono = rs.getString("telefono");
         String direccion = rs.getString("direccion");

         usuario = new Usuario(idUsuario, nombre, apellido, telefono, direccion);
      }



      return usuario;
   }

   public int insertarUsuario(Usuario usuario) throws SQLException{
      Connection con = Connector.connect();

      String sql = "INSERT INTO usuario(id_usuario, nombre, apellido, telefono, direccion) VALUES (?, ?, ?, ?, ?);";

      PreparedStatement statement = con.prepareStatement(sql);
      statement.setInt(1, usuario.getIdUsuario());
      statement.setString(2, usuario.getNombre());
      statement.setString(3, usuario.getApellido());
      statement.setString(4, usuario.getTelefono());
      statement.setString(5, usuario.getDireccion());

      System.out.println("Usuario creado en BBDD");

      int result = statement.executeUpdate();
      Connector.closePreparedStatement(statement);
      Connector.closeConnection(con);
      return result;
   }

   public int actualizarUsuario(Usuario usuario) throws SQLException{
      Connection con = Connector.connect();
      String sql = "UPDATE usuario SET nombre = ?, apellido = ?, telefono = ?, direccion = ? WHERE id_usuario = ?";

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setString(1, usuario.getNombre());
      ps.setString(2, usuario.getApellido());
      ps.setString(3, usuario.getTelefono());
      ps.setString(4, usuario.getDireccion());
      ps.setInt(5, usuario.getIdUsuario());

      int result = ps.executeUpdate();
      Connector.closePreparedStatement(ps);
      Connector.closeConnection(con);

      return result;

   }

   public int eliminarUsuario(Usuario usuario) throws SQLException{
      Connection con = Connector.connect();

      String sql = "DELETE FROM usuario WHERE id_usuario = ?";

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, usuario.getIdUsuario());

      int result = ps.executeUpdate();

      Connector.closePreparedStatement(ps);
      Connector.closeConnection(con);

      return result;
   }
}
