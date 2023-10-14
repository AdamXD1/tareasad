package tareasad.EjerciciosParaEntregar.Ejercicio2;

class Ordenador {
    private String codigo;
    private int ram;
    private String cpu;
    private double precio;

    public Ordenador(String codigo, int ram, String cpu, double precio) {
        this.codigo = codigo;
        this.ram = ram;
        this.cpu = cpu;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCaracteristicas() {
        return "Código: " + codigo + "\nRAM: " + ram + "GB\nCPU: " + cpu + "\nPrecio: $" + precio;
    }

    @Override
    public String toString() {
        return getCaracteristicas();
    }
}
