package tareasad.EjerciciosParaEntregar.Ejercicio3;

public interface Parking {
    boolean hayPlaza();
    void aparcaCoche(Vehiculo coche);
    void sacaCoche(Vehiculo coche);
    double getFactura(Vehiculo coche);
}
