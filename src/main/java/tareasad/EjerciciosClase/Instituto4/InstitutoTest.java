package tareasad.EjerciciosClase.Instituto4;

import java.util.ArrayList;

public class InstitutoTest {
    
    public static void main(String[] args) {
    Profesor profesorRoberto = new Profesor(null, 0, null, null);
    Profesor profesorJuan = new Profesor(null, 0, null, null);
    Profesor profesorMiguel = new Profesor(null, 0, null, null);

    ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
    listaProfesores.add(profesorRoberto);
    listaProfesores.add(profesorJuan);
    listaProfesores.add(profesorMiguel);

    Alumno alumnoPepe = new Alumno(null, 0, 0, null);
    Alumno alumnoPaco = new Alumno(null, 0, 0, null);
    Alumno alumnaMaria = new Alumno(null, 0, 0, null);
    Alumno alumnoAlex = new Alumno(null, 0, 0, null);
    ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

    listaAlumnos.add(alumnoPepe);
    listaAlumnos.add(alumnoPaco);
    listaAlumnos.add(alumnaMaria);
    listaAlumnos.add(alumnoAlex);

    
    Aula aula26 = new Aula(null, 0, args, args, args);
    System.out.println("Aula 2.6 incluye = " + aula26);

    }


}
