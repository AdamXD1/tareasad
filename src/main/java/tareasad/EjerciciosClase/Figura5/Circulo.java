package tareasad.EjerciciosClase.Figura5;

public class Circulo extends Figura {
    private double radio = 0;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        total = Math.PI * radio * radio;
    }
}
