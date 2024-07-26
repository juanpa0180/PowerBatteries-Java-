public class Factura {
    private String fecha;
    private int codigoFactura;
    private int idBateria;
    private int idUsuario;
    private String medioDePago;
    private String datosCompra;

    public String visualizarDatosCompra() {
        String datoscompra = "Estos son los datos de su compra";
        return datoscompra;
    }

    public int visualizarValor() {
        int valor = 125000;
        return valor;
    }
}
