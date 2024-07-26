public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private int telefono;
    private String correo;
    private String contrasena;
    private String rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String visualizacionProductos() {
        String listaIconos = "Lista de íconos";
        return listaIconos;
    }

    public String seleccionarProductos() {
        String idProductos = "Id de Productos";
        return idProductos;
    }

    public String filtrarProductos() {
        String filtrarProductos = "Filtrar los Productos";
        return filtrarProductos;
    }
}
