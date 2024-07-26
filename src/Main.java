import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws SQLException {
        Scanner sId = new Scanner(System.in);
        Scanner sPuntuacion = new Scanner(System.in);
        Scanner sResena = new Scanner(System.in);

        System.out.println("Por favor introduzca su ID");
        int id = sId.nextInt();
        System.out.println("Por favor introduzca la puntuación");
        int puntuacion = sPuntuacion.nextInt();
        System.out.println("Por favor introduzca su reseña");
        String resena = sResena.nextLine();

        Calificacion calificacion = new Calificacion(id, puntuacion, resena);
        calificacion.mostrarInfo();

        Connector.connect();
    }
}
