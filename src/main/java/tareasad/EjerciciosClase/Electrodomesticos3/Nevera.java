package tareasad.EjerciciosClase.Electrodomesticos3;

public class Nevera extends Electrodomestico {
    private static int capacidadFrigorifico;
    private static int capacidadCongelador;
    private double sonoridad;


    public Nevera () {
        capacidadFrigorifico = 254;
        capacidadCongelador = 130;
    }

    public Nevera(String marca, String modelo, double precio, String color, double potenciaEnW,
            int horasDeUtlizacionDiarias, int horasDeUtlizacionAlAño, double precioDeLaEneria, int capacidadFrigorifico,
            int capacidadCongelador, double sonoridad) {
        super(marca, modelo, precio, color, potenciaEnW, horasDeUtlizacionDiarias, horasDeUtlizacionAlAño,
                precioDeLaEneria);
        Nevera.capacidadFrigorifico = capacidadFrigorifico;
        Nevera.capacidadCongelador = capacidadCongelador;
        this.sonoridad = sonoridad;
    }


    public static double consumoAnual(double potenciaEnW, double horasDeUtlizacionDiarias) {
    
        double potenciaEnkW = potenciaEnW / 1000;
        double consumokWh = potenciaEnkW * horasDeUtlizacionDiarias;
        double kWhAnuales = consumokWh * 365;
        double consumoEnEuros = precioDeLaEneria * kWhAnuales;
        
        if(capacidadFrigorifico > 300 && capacidadCongelador > 200){
            consumoEnEuros = consumoEnEuros + 50;
        }

        return consumoEnEuros;
        }


    public static int getCapacidadFrigorifico() {
        return capacidadFrigorifico;
    }


    public static void setCapacidadFrigorifico(int capacidadFrigorifico) {
        Nevera.capacidadFrigorifico = capacidadFrigorifico;
    }


    public static int getCapacidadCongelador() {
        return capacidadCongelador;
    }


    public static void setCapacidadCongelador(int capacidadCongelador) {
        Nevera.capacidadCongelador = capacidadCongelador;
    }


    public double getSonoridad() {
        return sonoridad;
    }


    public void setSonoridad(double sonoridad) {
        this.sonoridad = sonoridad;
    }


    @Override
    public String toString() {
        return "Nevera [capacidadFrigorifico=" + capacidadFrigorifico + ", capacidadCongelador=" + capacidadCongelador
                + ", sonoridad=" + sonoridad + "]";
    }

}
