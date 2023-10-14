package tareasad.EjerciciosClase.Instituto4;

public class Profesor {
    private String nombre;
    private int edad;
    private String aulaAsignada;
    private String materia;
    
    public Profesor(String nombre, int edad, String aulaAsignada, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.aulaAsignada = aulaAsignada;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    
    
}
