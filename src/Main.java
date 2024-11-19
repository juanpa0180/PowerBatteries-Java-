import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws SQLException {
        //mostrarUsuario();
        //generateUsuario();
        //actualizarUsuario();
        //eliminarUsuario();
        //generateCalificacion();
    }

    public static void generateCalificacion() throws SQLException {
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

    public static void mostrarUsuario() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        System.out.println("Por favor introduzca el ID de su usuario");
        int idUsuario = scanner.nextInt(); scanner.nextLine();

        Usuario usuario = new UsuarioDAO().mostrarUsuario(idUsuario);
        usuario.mostrarDatosUsuario();
    }

    public static void generateUsuario() throws SQLException {
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

        usuarioDao.eliminarUsuario(usuario);
        int result = usuarioDao.eliminarUsuario(usuario);
        if(result == 0) {
            System.out.println("Usuario eliminado exitosamente");
        } else {
            System.out.println("Error!");
        }
    }
}
