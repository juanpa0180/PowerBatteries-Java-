import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
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
}
