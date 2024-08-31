import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws SQLException {
        generateUsuario();
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
        int result = usuarioDao.insertarUsuario(usuario);
        usuario.mostrarDatosUsuario();
        System.out.println("Result = " + result);
    }
}
