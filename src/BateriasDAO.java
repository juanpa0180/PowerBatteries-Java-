import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BateriasDAO {
    public Baterias mostrarbateria(int id) throws SQLException {
        Connection con = Connector.connect();
        Baterias bateria = null;
        String sql = "SELECT caja, amperaje, linea, vehiculo, combustible, precio FROM bateria WHERE id_bateria = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            int idBateria = rs.getInt("id_bateria");
            int caja = rs.getInt("caja");
            int amperaje = rs.getInt("amperaje");
            String linea = rs.getString("linea");
            String vehiculo = rs.getString("vehiculo");
            String combustible = rs.getString("combustible");
            int precio = rs.getInt("precio");

            bateria = new Baterias(idBateria, caja, amperaje, linea, vehiculo, combustible, precio);
        }
        return bateria;
    }

    public int insertarBateria(Baterias baterias) throws SQLException{
        Connection con = Connector.connect();

        String sql = "INSERT INTO bateria(id_bateria, caja, amperaje, linea, vehiculo, combustible, precio) VALUES (?, ?, ?, ?, ?, ?, ?);";

        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, baterias.getIdBateria());
        statement.setInt(2, baterias.getTipoCaja());
        statement.setInt(3, baterias.getAmperaje());
        statement.setString(4, baterias.getMarcaLinea());
        statement.setString(5, baterias.getMarcaVehiculo());
        statement.setString(6, baterias.getTipoCombustible());
        statement.setInt(7, baterias.getPrecio());

        System.out.println("Datos enviados a BBDD");

        baterias.mostrarInfo();

        int result = statement.executeUpdate();
        Connector.closePreparedStatement(statement);
        Connector.closeConnection(con);
        return result;
    }

    public int actualizarbateria(Baterias baterias) throws SQLException{
        Connection con = Connector.connect();
        String sql = "UPDATE bateria SET caja = ?, amperaje = ?, linea = ?, vehiculo = ?, combustible = ?, precio = ? WHERE id_bateria = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, baterias.getTipoCaja());
        ps.setInt(2, baterias.getAmperaje());
        ps.setString(3, baterias.getMarcaLinea());
        ps.setString(4, baterias.getMarcaVehiculo());
        ps.setString(5, baterias.getTipoCombustible());
        ps.setInt(6, baterias.getPrecio());
        ps.setInt(7, baterias.getIdBateria());

        int result = ps.executeUpdate();
        baterias.mostrarInfo();
        Connector.closePreparedStatement(ps);
        Connector.closeConnection(con);

        return result;
    }

    public int eliminarBateria(Baterias baterias) throws SQLException{
        Connection con = Connector.connect();

        String sql = "DELETE FROM bateria WHERE id_bateria = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, baterias.getIdBateria());

        int result = ps.executeUpdate();
        System.out.println("Elemento con Id bateria: " + baterias.getIdBateria() + "ha sido eliminado.");

        Connector.closePreparedStatement(ps);
        Connector.closeConnection(con);

        return result;
    }
}
