package tareasad.EjerciciosClase.Instituto4;

public class Alumno {
    private String nombre;
    private int nota;
    private int edad;
    private String aulaAsignada;
    
    public Alumno(String nombre, int nota, int edad, String aulaAsignada) {
        this.nombre = nombre;
        this.nota = nota;
        this.edad = edad;
        this.aulaAsignada = aulaAsignada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAulaAsignada() {
        return aulaAsignada;
    }

    public void setAulaAsignada(String aulaAsignada) {
        this.aulaAsignada = aulaAsignada;
    }

    
    
}
