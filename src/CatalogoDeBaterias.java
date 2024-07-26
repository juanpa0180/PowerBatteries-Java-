public class CatalogoDeBaterias {
    private int tipoDeCaja;
    private int amperaje;
    private String marcaLinea;
    private String marcaVehiculo;
    private String tipoDeCombustible;
    private int precio;

    public String listaDeProductos() {
        String listaDeProductos = "Lista de Productos";
        return listaDeProductos;
    }

    public String ordenAlfabetico() {
        String ordenAlfabetico = "Orden Álfabetico";
        return ordenAlfabetico;
    }

    public String filtrarProductos() {
        String filtrarProductos = "Filtrar los Productos";
        return filtrarProductos;
    }
}
