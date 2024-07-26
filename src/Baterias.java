public class Baterias {
    private int idBateria;
    private int tipoDeCaja;
    private int amperaje;
    private String marcaLinea;
    private int garantiaEnMeses;
    private int precio;
    //imagen


    public int getTipoDeCaja() {
        return tipoDeCaja;
    }

    public void setTipoDeCaja(int tipoDeCaja) {
        this.tipoDeCaja = tipoDeCaja;
    }

    public int getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(int amperaje) {
        this.amperaje = amperaje;
    }

    public String getMarcaLinea() {
        return marcaLinea;
    }

    public void setMarcaLinea(String marcaLinea) {
        this.marcaLinea = marcaLinea;
    }

    public int getGarantiaEnMeses() {
        return garantiaEnMeses;
    }

    public void setGarantiaEnMeses(int garantiaEnMeses) {
        this.garantiaEnMeses = garantiaEnMeses;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String visualizarFichaTecnica() {
        String caracteristicas = "Características de la Batería";
        return caracteristicas;
    }
}
