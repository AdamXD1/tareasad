package tareasad.EjerciciosParaEntregar.Ejercicio2;

class Portatil extends Ordenador {
    private double peso;

    public Portatil(String codigo, int ram, String cpu, double precio, double peso) {
        super(codigo, ram, cpu, precio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String getCaracteristicas() {
        return super.getCaracteristicas() + "\nPeso: " + peso + "kg";
    }
}