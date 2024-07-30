public class Calificacion {
    private int idCalificacion;
    private int idUsuario;
    private int puntuacion;
    private String resena;

    public Calificacion(int idCalificacion, int idUsuario, int puntuacion, String resena) {
        this.idCalificacion = idCalificacion;
        this.idUsuario = idUsuario;
        this.puntuacion = puntuacion;
        this.resena = resena;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
        System.out.println("Id Calificacion: " + idCalificacion);
        System.out.println("Cliente: " + idUsuario);
        System.out.println("Puntuaciòn es: " + puntuacion);
        System.out.println("Reseña: " + resena);
    }
}
