public class Calificacion {
    private int idUsuario;
    private int puntuacion;
    private String resena;

    public Calificacion(int idUsuario, int puntuacion, String resena) {
        this.idUsuario = idUsuario;
        this.puntuacion = puntuacion;
        this.resena = resena;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int calificarServicio() {
        puntuacion = 5;
        return puntuacion;
    }

    public String generarResena() {
        resena = "Excelente!";
        return resena;
    }

    public void mostrarInfo(){
        System.out.println("Cliente: " + idUsuario);
        System.out.println("Puntuaciòn es: " + puntuacion);
        System.out.println("Reseña: " + resena);
    }
}
