import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VehiculosDAO {
    public Vehiculos mostrarVehiculo(int id) throws SQLException {
        Connection con = Connector.connect();
        Vehiculos vehiculos = null;
        String sql = "SELECT id_vehiculo, marca, modelo, version, tipo_servicio, tipo_combustible FROM vehiculos WHERE id_vehiculo = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            int idVehiculo = rs.getInt("id_vehiculo");
            String marcaVehiculo = rs.getString("marca");
            int modelo = rs.getInt("modelo");
            int version = rs.getInt("version");
            String tipoServicio = rs.getString("tipo_servicio");
            String tipoDeCombustible = rs.getString("tipo_combustible");

            vehiculos = new Vehiculos(idVehiculo, marcaVehiculo, modelo, version, tipoServicio, tipoDeCombustible);
        }
        return vehiculos;
    }

    public int insertarVehiculo(Vehiculos vehiculos) throws SQLException{
        Connection con = Connector.connect();

        String sql = "INSERT INTO vehiculos(id_vehiculo, marca, modelo, version, tipo_servicio, tipo_combustible) VALUES (?, ?, ?, ?, ?, ?);";

        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, vehiculos.getIdVehiculo());
        statement.setString(2, vehiculos.getMarcaVehiculo());
        statement.setInt(3, vehiculos.getModelo());
        statement.setInt(4, vehiculos.getVersion());
        statement.setString(5, vehiculos.getTipoServicio());
        statement.setString(6, vehiculos.getTipoDeCombustible());

        System.out.println("Datos enviados a BBDD");

        int result = statement.executeUpdate();
        Connector.closePreparedStatement(statement);
        Connector.closeConnection(con);
        return result;
    }

    public int actualizarVehiculo(Vehiculos vehiculos) throws SQLException{
        Connection con = Connector.connect();
        String sql = "UPDATE vehiculos SET marca = ?, modelo = ?, version = ?, tipo_servicio = ?, tipo_combustible = ? WHERE id_vehiculo = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, vehiculos.getMarcaVehiculo());
        ps.setInt(2, vehiculos.getModelo());
        ps.setInt(3, vehiculos.getVersion());
        ps.setString(4, vehiculos.getTipoServicio());
        ps.setString(5, vehiculos.getTipoDeCombustible());
        ps.setInt(6, vehiculos.getIdVehiculo());

        int result = ps.executeUpdate();
        Connector.closePreparedStatement(ps);
        Connector.closeConnection(con);

        return result;
    }

    public int eliminarVehiculo(Vehiculos vehiculos) throws SQLException{
        Connection con = Connector.connect();

        String sql = "DELETE FROM vehiculos WHERE id_vehiculo = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, vehiculos.getIdVehiculo());

        int result = ps.executeUpdate();

        Connector.closePreparedStatement(ps);
        Connector.closeConnection(con);

        return result;
    }

}
