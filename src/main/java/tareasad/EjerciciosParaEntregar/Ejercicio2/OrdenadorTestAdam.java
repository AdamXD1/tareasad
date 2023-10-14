package tareasad.EjerciciosParaEntregar.Ejercicio2;

public class OrdenadorTestAdam {
    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador("PC001", 8, "Intel i5", 800.0);
        Portatil portatil1 = new Portatil("PC002", 16, "AMD Ryzen 7", 1200.0, 1.5);

        System.out.println("--- Ordenador ---");
        System.out.println(ordenador1);
        System.out.println();


        System.out.println("--- Portátil ---");
        System.out.println(portatil1);
        System.out.println();

        ordenador1.setPrecio(900.0);
        System.out.println("--- Ordenador (después de cambiar el precio) ---");
        System.out.println(ordenador1);
    }
}
