public class Pagos {
    private int idPagos;
    private String medioDePago;
    private String datosPagador;
    private String datosCompra;

    public Pagos(int idPagos, String medioDePago, String datosPagador) {
        this.idPagos = idPagos;
        this.medioDePago = medioDePago;
        this.datosPagador = datosPagador;
    }

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }

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
    
    public void mostrarInfo() {
        System.out.println("Id de pago: " + idPagos);
        System.out.println("Medios de pago: " + medioDePago);
        System.out.println("Datos de pagador: " + medioDePago);
    }
}
