package tareasad.EjerciciosParaEntregar.Ejercicio3;

import java.util.Date;

public class ParkingTestAdam {
    public static void main(String[] args) {
        ParkingVehiculo parking = new ParkingVehiculo("Calle Principal");
        Vehiculo vehiculo1 = new Vehiculo("ABC123", new Date(), null);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", new Date(), null);
        Vehiculo vehiculo3 = new Vehiculo("GHI789", new Date(), null);
        Vehiculo vehiculo4 = new Vehiculo("JKL012", new Date(), null);
        Vehiculo vehiculo5 = new Vehiculo("MNO345", new Date(), null);

        parking.aparcaCoche(vehiculo1);
        parking.aparcaCoche(vehiculo2);
        parking.aparcaCoche(vehiculo3);
        parking.aparcaCoche(vehiculo4);
        parking.aparcaCoche(vehiculo5);

        parking.sacaCoche(vehiculo3);

        vehiculo1.setFechaFin(new Date());

        System.out.println("Factura de " + vehiculo1.getMatricula() + ": " + parking.getFactura(vehiculo1));
    }
}
