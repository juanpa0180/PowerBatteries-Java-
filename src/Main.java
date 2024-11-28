import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        while (cont != 0) {
            System.out.println("Por favor seleccione la tabla de la cual necesita información");
            System.out.println("(1) Usuarios\n(2) Calificaciones\n(3) Baterías\n(4) Pagos\n(5) Vehículos");
            int opcion = evaluarOpcion(evaluarInt(), 5, 1);
            if (opcion == 1) {
                System.out.println("Por favor seleccione si desea ver(1), crear(2), modificar(3) o eliminar(4) un usuario");
                opcion = evaluarOpcion(evaluarInt(), 4, 1);
                switch (opcion) {
                    case 1 -> mostrarUsuario();
                    case 2 -> generarUsuario();
                    case 3 -> actualizarUsuario();
                    case 4 -> eliminarUsuario();
                }
            } else if (opcion == 2) {
                System.out.println("Por favor seleccione si desea ver(1), crear(2), modificar(3) o eliminar(4) una calificación");
                opcion = evaluarOpcion(evaluarInt(), 4, 1);
                switch (opcion) {
                    case 1 -> mostrarCalificacion();
                    case 2 -> generarCalificacion();
                    case 3 -> actualizarCalificacion();
                    case 4 -> eliminarCalificacion();
                }
            } else if (opcion == 3) {
                System.out.println("Por favor seleccione si desea ver(1), crear(2), modificar(3) o eliminar(4) una batería");
                opcion = evaluarOpcion(evaluarInt(), 4, 1);
                switch (opcion) {
                    case 1 -> mostrarBateria();
                    case 2 -> generarBateria();
                    case 3 -> actualizarBateria();
                    case 4 -> eliminarBateria();
                }
            } else if (opcion == 4) {
                System.out.println("Por favor seleccione si desea ver(1), crear(2), modificar(3) o eliminar(4) un pago");
                opcion = evaluarOpcion(evaluarInt(), 4, 1);
                switch (opcion) {
                    case 1 -> mostrarPagos();
                    case 2 -> generarPagos();
                    case 3 -> actualizarPagos();
                    case 4 -> eliminarPagos();
                }
            } else if (opcion == 5) {
                System.out.println("Por favor seleccione si desea ver(1), crear(2), modificar(3) o eliminar(4) un vehículo");
                opcion = evaluarOpcion(evaluarInt(), 4, 1);
                switch (opcion) {
                    case 1 -> mostrarVehiculos();
                    case 2 -> generarVehiculos();
                    case 3 -> actualizarVehiculos();
                    case 4 -> eliminarVehiculos();
                }
            }
            System.out.println("Desea continuar ejecutando el programa: sí(número entero) no(0)");
            cont = evaluarInt();
        }
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
        if(result != 0) {
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
        if(result != 0) {
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

        Baterias baterias = new BateriasDAO().mostrarBaterias((idBateria));
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
        int result = bateriasDao.insertarBaterias(baterias);
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
        bateriasDAO.actualizarBaterias(baterias);
        baterias.mostrarInfo();
    }

    public static void eliminarBateria() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        BateriasDAO bateriasDAO = new BateriasDAO();

        System.out.println("Por favor introduzca el ID de la bateria que se va a eliminar");
        int idBaterias = scanner.nextInt(); scanner.nextLine();

        Baterias baterias = bateriasDAO.mostrarBaterias(idBaterias);

        int result = bateriasDAO.eliminarBaterias(baterias);
        if(result != 0) {
            System.out.println("Bateria eliminada exitosamente");
        } else {
            System.out.println("Error!");
        }
    }

    public static void mostrarPagos() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        PagosDAO pagosDAO = new PagosDAO();
        System.out.println("Por favor introduzca el ID de su pago");
        int idPagos = scanner.nextInt(); scanner.nextLine();

        Pagos pagos = new PagosDAO().mostrarPagos((idPagos));
        pagos.mostrarInfo();
    }

    public static void generarPagos() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        PagosDAO pagosDao = new PagosDAO();

        System.out.println("Por favor introduzca el ID del pago");
        int idPagos = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca el medio de pago usado");
        String medioPago = scanner.nextLine();
        System.out.println("Por favor introduzca los datos del pagador");
        String datosPagador = scanner.nextLine();

        Pagos pagos = new Pagos(idPagos, medioPago, datosPagador);
        int result = pagosDao.insertarPagos(pagos);
        pagos.mostrarInfo();
        System.out.println("Result = " + result);
    }

    public static void actualizarPagos() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        PagosDAO pagosDAO = new PagosDAO();

        System.out.println("Por favor introduzca el ID del pago");
        int idPagos = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca el medio de pago usado");
        String medioPago = scanner.nextLine();
        System.out.println("Por favor introduzca los datos del pagador");
        String datosPagador = scanner.nextLine();

        Pagos pagos = new Pagos(idPagos, medioPago, datosPagador);
        pagosDAO.actualizarPagos(pagos);
        pagos.mostrarInfo();
    }

    public static void eliminarPagos() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        PagosDAO pagosDAO = new PagosDAO();

        System.out.println("Por favor introduzca el ID de la pagos que se va a eliminar");
        int idPagoss = scanner.nextInt(); scanner.nextLine();

        Pagos pagos = pagosDAO.mostrarPagos(idPagoss);

        int result = pagosDAO.eliminarPagos(pagos);
        if(result != 0) {
            System.out.println("Pago eliminado exitosamente");
        } else {
            System.out.println("Error!");
        }
    }

    public static void mostrarVehiculos() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        VehiculosDAO vehiculosDAO = new VehiculosDAO();
        System.out.println("Por favor introduzca el ID de su vehículo");
        int idVehiculos = scanner.nextInt(); scanner.nextLine();

        Vehiculos vehiculos = new VehiculosDAO().mostrarVehiculo(idVehiculos);
        vehiculos.mostrarInfo();
    }

    public static void generarVehiculos() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        VehiculosDAO vehiculosDao = new VehiculosDAO();

        System.out.println("Por favor introduzca el ID del vehiculo");
        int idVehiculos = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca la marca del vehículo");
        String marca = scanner.nextLine();
        System.out.println("Por favor introduzca el modelo del vehiculo");
        int modelo = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca la version del vehiculo");
        int version = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca el tipo de servicio del vehiculo");
        String tipoServicio = scanner.nextLine();
        System.out.println("Por favor introduzca el combustible del vehículo");
        String tipoCombustible = scanner.nextLine();

        Vehiculos vehiculos = new Vehiculos(idVehiculos, marca, modelo, version, tipoServicio, tipoCombustible);
        int result = vehiculosDao.insertarVehiculo(vehiculos);
        vehiculos.mostrarInfo();
        System.out.println("Result = " + result);
    }

    public static void actualizarVehiculos() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        VehiculosDAO vehiculosDAO = new VehiculosDAO();

        System.out.println("Por favor introduzca el ID del vehiculo");
        int idVehiculos = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca la marca del vehículo");
        String marca = scanner.nextLine();
        System.out.println("Por favor introduzca el modelo del vehiculo");
        int modelo = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca la version del vehiculo");
        int version = scanner.nextInt(); scanner.nextLine();
        System.out.println("Por favor introduzca el tipo de servicio del vehiculo");
        String tipoServicio = scanner.nextLine();
        System.out.println("Por favor introduzca el combustible del vehículo");
        String tipoCombustible = scanner.nextLine();

        Vehiculos vehiculos = new Vehiculos(idVehiculos, marca, modelo, version, tipoServicio, tipoCombustible);
        vehiculosDAO.actualizarVehiculo(vehiculos);
        vehiculos.mostrarInfo();
    }

    public static void eliminarVehiculos() throws SQLException{
        Scanner scanner = new Scanner(System.in);

        VehiculosDAO vehiculosDAO = new VehiculosDAO();

        System.out.println("Por favor introduzca el ID de la vehiculos que se va a eliminar");
        int idVehiculos = scanner.nextInt(); scanner.nextLine();

        Vehiculos vehiculos = vehiculosDAO.mostrarVehiculo(idVehiculos);

        int result = vehiculosDAO.eliminarVehiculo(vehiculos);
        if(result != 0) {
            System.out.println("Vehiculo eliminado exitosamente");
        } else {
            System.out.println("Error!");
        }
    }

    public static int evaluarInt() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        while (true) {
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                break;
            } else {
                System.out.println("Opción no disponible, intente de nuevo.");
                scanner.nextLine();
            }
        }
        return opcion;
    }

    public static int evaluarOpcion(int opcion, int max, int min) {
        while(opcion > max || opcion < min) {
            System.out.println("por favor elija una de las opciones dadas");
            opcion = evaluarInt();
        }
        return opcion;
    }
}
