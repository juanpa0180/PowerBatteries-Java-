import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PagosDAO {
    public Pagos mostrarPagos(int id) throws SQLException {
        Connection con = Connector.connect();
        Pagos pagos = null;
        String sql = "SELECT id_pagos, medio_de_pago, datos_pagador FROM pagos WHERE id_pagos = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            int idPagos = rs.getInt("id_pagos");
            String medioPago = rs.getString("medio_de_pago");
            String datosPagador = rs.getString("datos_pagador");

            pagos = new Pagos(idPagos, medioPago, datosPagador);
        }
        return pagos;
    }

    public int insertarPagos(Pagos pagos) throws SQLException{
        Connection con = Connector.connect();

        String sql = "INSERT INTO pagos(id_pagos, medio_de_pago, datos_pagador) VALUES (?, ?, ?);";

        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, pagos.getIdPagos());
        statement.setString(2, pagos.getMedioDePago());
        statement.setString(3, pagos.getDatosPagador());

        System.out.println("Datos enviados a BBDD");

        int result = statement.executeUpdate();
        Connector.closePreparedStatement(statement);
        Connector.closeConnection(con);
        return result;
    }

    public int actualizarPagos(Pagos pagos) throws SQLException{
        Connection con = Connector.connect();
        String sql = "UPDATE pagos SET medio_de_pago = ?, datos_pagador = ? WHERE id_pagos = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, pagos.getMedioDePago());
        ps.setString(2, pagos.getDatosPagador());
        ps.setInt(3, pagos.getIdPagos());

        int result = ps.executeUpdate();
        Connector.closePreparedStatement(ps);
        Connector.closeConnection(con);

        return result;
    }

    public int eliminarPagos(Pagos pagos) throws SQLException{
        Connection con = Connector.connect();

        String sql = "DELETE FROM pagos WHERE id_pagos = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, pagos.getIdPagos());

        int result = ps.executeUpdate();

        Connector.closePreparedStatement(ps);
        Connector.closeConnection(con);

        return result;
    }
}
