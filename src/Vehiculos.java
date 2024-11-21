public class Vehiculos {
    private int idVehiculo;
    private String marcaVehiculo;
    private int modelo;
    private int version;
    private String tipoServicio;
    private String tipoDeCombustible;

    public Vehiculos(int idVehiculo, String marcaVehiculo, int modelo, int version, String tipoServicio, String tipoDeCombustible) {
        this.idVehiculo = idVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.modelo = modelo;
        this.version = version;
        this.tipoServicio = tipoServicio;
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String sipoDeCombustible) {
        this.tipoDeCombustible = sipoDeCombustible;
    }

    public void mostrarInfo() {
        System.out.println("Id de vehiculo: " + idVehiculo);
        System.out.println("Marca de vehículo: " + marcaVehiculo);
        System.out.println("Modelo del vehículo: " + modelo);
        System.out.println("Versión del vehículo: " + version);
        System.out.println("Tipo de servicio del vehículo: " + tipoServicio);
        System.out.println("Tipo de combustible: " + tipoDeCombustible);
    }
}
