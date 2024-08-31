public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String direccion;
    private String contrasena;
    private String rol;

    public Usuario(int idUsuario, String nombre, String apellido, String telefono, String direccion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public void mostrarDatosUsuario(){
        System.out.println("Id Usuario: " + idUsuario);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
    }
}
