import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws SQLException {
        //mostrarUsuario();
        //generarUsuario();
        //actualizarUsuario();
        //eliminarUsuario();
        //mostrarCalificacion();
        //generarCalificacion();
        //actualizarCalificacion();
        //eliminarCalificacion();
    }

    public static void mostrarUsuario() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        System.out.println("Por favor introduzca el ID de su usuario");
        int idUsuario = scanner.nextInt(); scanner.nextLine();

        Usuario usuario = new UsuarioDAO().mostrarUsuario(idUsuario);
        usuario.mostrarDatosUsuario();
    }

    public static void generarUsuario() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        UsuarioDAO usuarioDao = new UsuarioDAO();

        System.out.println("Por favor introduzca el ID de su usuario");
        int idUsuario = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Por favor introduzca su apellido");
        String apellido = scanner.nextLine();
        System.out.println("Por favor introduzca su telefono");
        String telefono = scanner.nextLine();
        System.out.println("Por favor introduzca su direccion");
        String direccion = scanner.nextLine();

        Usuario usuario = new Usuario(idUsuario, nombre, apellido, telefono, direccion);
        /*int result = */usuarioDao.insertarUsuario(usuario);
        usuario.mostrarDatosUsuario();
        //System.out.println("Result = " + result);
    }

    public static void actualizarUsuario() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        UsuarioDAO usuarioDao = new UsuarioDAO();

        System.out.println("Por favor introduzca el ID del usuario que se va a modificar");
        int idUsuario = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca el nuevo nombre");
        String nombre = scanner.nextLine();
        System.out.println("Por favor introduzca el nuevo apellido");
        String apellido = scanner.nextLine();
        System.out.println("Por favor introduzca el nuevo telefono");
        String telefono = scanner.nextLine();
        System.out.println("Por favor introduzca la nueva direccion");
        String direccion = scanner.nextLine();

        Usuario usuario = new Usuario(idUsuario, nombre, apellido, telefono, direccion);
        usuarioDao.actualizarUsuario(usuario);
        usuario.mostrarDatosUsuario();
    }

    public static void eliminarUsuario() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        UsuarioDAO usuarioDao = new UsuarioDAO();

        System.out.println("Por favor introduzca el ID del usuario que se va a eliminar");
        int idUsuario = scanner.nextInt(); scanner.nextLine();

        Usuario usuario = usuarioDao.mostrarUsuario(idUsuario);

        int result = usuarioDao.eliminarUsuario(usuario);
        if(result == 0) {
            System.out.println("Usuario eliminado exitosamente");
        } else {
            System.out.println("Error!");
        }
    }

    public static void mostrarCalificacion() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        CalificacionDAO calificacionDAO = new CalificacionDAO();
        System.out.println("Por favor introduzca el ID de su calificacion");
        int idCalificacion = scanner.nextInt(); scanner.nextLine();

        Calificacion calificacion = new CalificacionDAO().mostrarCalificacion(idCalificacion);
        calificacion.mostrarInfo();
    }

    public static void generarCalificacion() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        CalificacionDAO calificacionDao = new CalificacionDAO();

        System.out.println("Por favor introduzca el ID de su reseña");
        int idResena = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca su ID");
        int id = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca la puntuación");
        int puntuacion = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca su reseña");
        String resena = scanner.nextLine();

        Calificacion calificacion = new Calificacion(idResena, id, puntuacion, resena);
        int result = calificacionDao.insertarCalificacion(calificacion);
        calificacion.mostrarInfo();
        System.out.println("Result = " + result);
    }

    public static void actualizarCalificacion() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        CalificacionDAO calificacionDAO = new CalificacionDAO();

        System.out.println("Por favor introduzca el ID de la reseña a modificar");
        int idCalificacion = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca el ID del usuario");
        int idUsuario = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca la nueva puntuación");
        int puntuacion = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca la nueva reseña");
        String resena = scanner.nextLine();

        Calificacion calificacion = new Calificacion(idCalificacion, idUsuario, puntuacion, resena);
        calificacionDAO.actualizarCalificacion(calificacion);
        calificacion.mostrarInfo();
    }

    public static void eliminarCalificacion() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        CalificacionDAO calificacionDAO = new CalificacionDAO();

        System.out.println("Por favor introduzca el ID de la reseña que se va a eliminar");
        int idCalificacion = scanner.nextInt(); scanner.nextLine();

        Calificacion calificacion = calificacionDAO.mostrarCalificacion(idCalificacion);

        int result = calificacionDAO.eliminarCalificacion(calificacion);
        if(result == 0) {
            System.out.println("Calificación eliminado exitosamente");
        } else {
            System.out.println("Error!");
        }
    }

    public static void mostrarBateria() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        BateriasDAO bateriasDAO = new BateriasDAO();
        System.out.println("Por favor introduzca el ID de su bateria");
        int idBateria = scanner.nextInt(); scanner.nextLine();

        Baterias baterias = new BateriasDAO().mostrarbateria((idBateria));
        baterias.mostrarInfo();
    }

    public static void generarBateria() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        BateriasDAO bateriasDao = new BateriasDAO();

        System.out.println("Por favor introduzca el ID de la bateria");
        int idBaterias = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca el tipo de caja");
        int caja = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca el amperaje");
        int amperaje = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca la línea de la bateria");
        String linea = scanner.nextLine();
        System.out.println("Por favor introduzca el (los) vehículo(s) que le sirven");
        String vehiculo = scanner.nextLine();
        System.out.println("Por favor introduzca el tipo de combustible");
        String combustible = scanner.nextLine();
        System.out.println("Por favor introduzca el precio de la bateria");
        int precio = scanner.nextInt(); scanner.nextLine();

        Baterias baterias = new Baterias(idBaterias, caja, amperaje, linea, vehiculo, combustible, precio);
        int result = bateriasDao.insertarBateria(baterias);
        baterias.mostrarInfo();
        System.out.println("Result = " + result);
    }

    public static void actualizarBateria() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        BateriasDAO bateriasDAO = new BateriasDAO();

        System.out.println("Por favor introduzca el ID de la bateria");
        int idBaterias = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca el tipo de caja");
        int caja = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca el amperaje");
        int amperaje = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca la línea de la bateria");
        String linea = scanner.nextLine();
        System.out.println("Por favor introduzca el (los) vehículo(s) que le sirven");
        String vehiculo = scanner.nextLine();
        System.out.println("Por favor introduzca el tipo de combustible");
        String combustible = scanner.nextLine();
        System.out.println("Por favor introduzca el precio de la bateria");
        int precio = scanner.nextInt(); scanner.nextLine();

        Baterias baterias = new Baterias(idBaterias, caja, amperaje, linea, vehiculo, combustible, precio);
        bateriasDAO.actualizarbateria(baterias);
        baterias.mostrarInfo();
    }

    public static void eliminarBateria() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        BateriasDAO bateriasDAO = new BateriasDAO();

        System.out.println("Por favor introduzca el ID de la bateria que se va a eliminar");
        int idBaterias = scanner.nextInt(); scanner.nextLine();

        Baterias baterias = bateriasDAO.mostrarbateria(idBaterias);

        int result = bateriasDAO.eliminarBateria(baterias);
        if(result == 0) {
            System.out.println("Bateria eliminada exitosamente");
        } else {
            System.out.println("Error!");
        }
    }


}
