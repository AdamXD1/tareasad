package tareasad.EjerciciosClase.Persona2;

import java.util.Scanner;

public class PersonaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Introduce el sexo (H o M)");
        char sexo = scanner.next().charAt(0);

        System.out.print("Introduce el peso ");
        double peso = scanner.nextDouble();

        System.out.print("Introduce la altura ");
        double altura = scanner.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo);
        persona1.setPeso(peso);
        persona1.setAltura(altura);

        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona();
        persona3.setNombre("Juan");
        persona3.setEdad(30);
        persona3.setSexo('H');
        persona3.setPeso(75.5);
        persona3.setAltura(1.8);

        System.out.println("Datos de persona 1:");
        mostrarInformacionPersona(persona1);
        System.out.println("IMC: " + persona1.calcularIMC());

        System.out.println("\nDatos de persona 2:");
        mostrarInformacionPersona(persona2);
        System.out.println("IMC: " + persona2.calcularIMC());

        System.out.println("\nDatos de persona 3:");
        mostrarInformacionPersona(persona3);
        System.out.println("IMC: " + persona3.calcularIMC());
    }

    public static void mostrarInformacionPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("DNI: " + persona.getDNI());
        System.out.println("Sexo: " + persona.getSexo());
        System.out.println("Peso: " + persona.getPeso());
        System.out.println("Altura: " + persona.getAltura());
    }
}
