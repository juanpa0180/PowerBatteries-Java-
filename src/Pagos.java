public class Pagos {
    private String medioDePago;
    private String datosPagador;
    private String datosCompra;

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    public String getDatosPagador() {
        return datosPagador;
    }

    public void setDatosPagador(String datosPagador) {
        this.datosPagador = datosPagador;
    }

    public int visualizarValor() {
        int valor = 125000;
        return valor;
    }

    public String pago() {
        String metodoPago = "Mastercard";
        return metodoPago;
    }
}
