package tareasad.EjerciciosClase.Instituto4;

public class Aula {
    private String nombre;
    private int numeroEstudiantes;
    private String[] profesoresAsignados;
    private String[] alumnosAsignados;
    private String[] materiasQueSeImparten;
    
    public Aula(String nombre, int numeroEstudiantes, String[] profesoresAsignados, String[] alumnosAsignados,
            String[] materiasQueSeImparten) {
        this.nombre = nombre;
        this.numeroEstudiantes = numeroEstudiantes;
        this.profesoresAsignados = profesoresAsignados;
        this.alumnosAsignados = alumnosAsignados;
        this.materiasQueSeImparten = materiasQueSeImparten;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public String[] getProfesoresAsignados() {
        return profesoresAsignados;
    }

    public void setProfesoresAsignados(String[] profesoresAsignados) {
        this.profesoresAsignados = profesoresAsignados;
    }

    public String[] getAlumnosAsignados() {
        return alumnosAsignados;
    }

    public void setAlumnosAsignados(String[] alumnosAsignados) {
        this.alumnosAsignados = alumnosAsignados;
    }

    public String[] getMateriasQueSeImparten() {
        return materiasQueSeImparten;
    }

    public void setMateriasQueSeImparten(String[] materiasQueSeImparten) {
        this.materiasQueSeImparten = materiasQueSeImparten;
    }
   

    
}
