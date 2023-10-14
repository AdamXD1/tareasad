package tareasad.EjerciciosParaEntregar.Ejercicio3;

public class ParkingVehiculo implements Parking {
    private static final double PRECIO_POR_MINUTO = 0.0425;
    private static final int MAX_PLAZAS = 100;
    private String direccion;
    private int plazasOcupadas;

    public ParkingVehiculo(String direccion) {
        this.direccion = direccion;
        this.plazasOcupadas = 0;
    }

    public boolean hayPlaza() {
        return plazasOcupadas < MAX_PLAZAS;
    }

    public void aparcaCoche(Vehiculo coche) {
        if (hayPlaza()) {
            plazasOcupadas++;
            System.out.println("El vehículo con matrícula " + coche.getMatricula() + " ha sido aparcado en " + direccion);
        } else {
            System.out.println("No hay plazas disponibles en " + direccion);
        }
    }

    public void sacaCoche(Vehiculo coche) {
        plazasOcupadas--;
        System.out.println("El vehículo con matrícula " + coche.getMatricula() + " ha salido del parking " + direccion);
    }

    public double getFactura(Vehiculo coche) {
        double tiempoEstacionamiento = (coche.getFechaFin().getTime() - coche.getFechaInicio().getTime()) / 60000.0; // En minutos
        return tiempoEstacionamiento * PRECIO_POR_MINUTO;
    }
}
