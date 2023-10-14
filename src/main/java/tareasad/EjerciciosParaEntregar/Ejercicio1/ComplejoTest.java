package tareasad.EjerciciosParaEntregar.Ejercicio1;

public class ComplejoTest {
    public static void main(String[] args) {
        Complejo c1 = new Complejo();
        Complejo c2 = new Complejo(2.5, 3.7);

        c1.asignar(1.2, -0.8);

        Complejo suma = c1.sumar(c1, c2);

        System.out.println("c1: ");
        c1.imprimir();

        System.out.println("c2: ");
        c2.imprimir();

        System.out.println("Suma: ");
        suma.imprimir();
    }
}