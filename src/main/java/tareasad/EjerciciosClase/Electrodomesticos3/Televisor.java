package tareasad.EjerciciosClase.Electrodomesticos3;

public class Televisor extends Electrodomestico {
    private static int resolucion;

    public Televisor(){
        resolucion = 50;
    }

    public Televisor(String marca, String modelo, double precio, String color, double potenciaEnW,
            int horasDeUtlizacionDiarias, int horasDeUtlizacionAlAño, double precioDeLaEneria, int resolucion) {
        super(marca, modelo, precio, color, potenciaEnW, horasDeUtlizacionDiarias, horasDeUtlizacionAlAño,
                precioDeLaEneria);
        Televisor.resolucion = resolucion;
    }

    public static double consumoAnual(double potenciaEnW, double horasDeUtlizacionDiarias) {
    
        double potenciaEnkW = potenciaEnW / 1000;
        double consumokWh = potenciaEnkW * horasDeUtlizacionDiarias;
        double kWhAnuales = consumokWh * 365;
        double consumoEnEuros = precioDeLaEneria * kWhAnuales;
        
        if(resolucion > 50){
            consumoEnEuros = consumoEnEuros + 30;
        }

        return consumoEnEuros;
        }

    public static int getResolucion() {
        return resolucion;
    }

    public static void setResolucion(int resolucion) {
        Televisor.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Televisor [resolucion=" + resolucion + "]";
    }
    
}
