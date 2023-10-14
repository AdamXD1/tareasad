package tareasad.EjerciciosClase.Electrodomesticos3;

public class Electrodomestico {
    private String marca;
    private String modelo;
    private double precio;
    private String color;
    private static double potenciaEnW;
    private static int horasDeUtlizacionDiarias;
    private int horasDeUtlizacionAlAño;
    protected static double precioDeLaEneria = 0.14;

    public Electrodomestico() {
        marca = "bosch";
        modelo = "7200";
        precio = 400;
        color = "gris";
        potenciaEnW = 2300;
        horasDeUtlizacionDiarias = 1;
        horasDeUtlizacionAlAño = 3;
        precioDeLaEneria = 0.40397;
    }

    public Electrodomestico(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Electrodomestico(String marca, String modelo, double precio, String color, double potenciaEnW,
            int horasDeUtlizacionDiarias, int horasDeUtlizacionAlAño, double precioDeLaEneria) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        Electrodomestico.potenciaEnW = potenciaEnW;
        Electrodomestico.horasDeUtlizacionDiarias = horasDeUtlizacionDiarias;
        this.horasDeUtlizacionAlAño = horasDeUtlizacionAlAño;
        Electrodomestico.precioDeLaEneria = precioDeLaEneria;
    }

    
    public static double consumoAnual(double potenciaEnW, double horasDeUtlizacionDiarias) {
    
    double potenciaEnkW = potenciaEnW / 1000;
    double consumokWh = potenciaEnkW * horasDeUtlizacionDiarias;
    double kWhAnuales = consumokWh * 365;
    double consumoEnEuros = precioDeLaEneria * kWhAnuales;

    return consumoEnEuros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static double getPotenciaEnW() {
        return potenciaEnW;
    }

    public static void setPotenciaEnW(double potenciaEnW) {
        Electrodomestico.potenciaEnW = potenciaEnW;
    }

    public static int getHorasDeUtlizacionDiarias() {
        return horasDeUtlizacionDiarias;
    }

    public static void setHorasDeUtlizacionDiarias(int horasDeUtlizacionDiarias) {
        Electrodomestico.horasDeUtlizacionDiarias = horasDeUtlizacionDiarias;
    }

    public int getHorasDeUtlizacionAlAño() {
        return horasDeUtlizacionAlAño;
    }

    public void setHorasDeUtlizacionAlAño(int horasDeUtlizacionAlAño) {
        this.horasDeUtlizacionAlAño = horasDeUtlizacionAlAño;
    }

    public static double getPrecioDeLaEneria() {
        return precioDeLaEneria;
    }

    public static void setPrecioDeLaEneria(double precioDeLaEneria) {
        Electrodomestico.precioDeLaEneria = precioDeLaEneria;
    }

    @Override
    public String toString() {
        return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
                + ", horasDeUtlizacionAlAño=" + horasDeUtlizacionAlAño + "]";
    }

}
