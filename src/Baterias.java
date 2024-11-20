public class Baterias {
    private int idBateria;
    private int tipoCaja;
    private int amperaje;
    private String marcaLinea;
    private String marcaVehiculo;
    private String tipoCombustible;
    private int precio;
    //imagen


    public Baterias(int idBateria, int tipoCaja, int amperaje, String marcaLinea, String marcaVehiculo, String tipoCombustible, int precio) {
        this.idBateria = idBateria;
        this.amperaje = amperaje;
        this.marcaLinea = marcaLinea;
        this.marcaVehiculo = marcaVehiculo;
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
    }

    public int getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(int tipoCaja) {
        this.tipoCaja = tipoCaja;
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

    public int getIdBateria() {
        return idBateria;
    }

    public void setIdBateria(int idBateria) {
        this.idBateria = idBateria;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public void mostrarInfo(){
        System.out.println("Id bateria: " + idBateria);
        System.out.println("Tipo de caja: " + tipoCaja);
        System.out.println("Amperaje: " + amperaje);
        System.out.println("Marca Línea: " + marcaLinea);
        System.out.println("Marca vehículo: " + marcaVehiculo);
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Precio: " + precio);
    }
}
