package tareasad.EjerciciosClase.Figura5;

public class Rectangulo extends Figura {
    private double base = 0;
    private double altura = 0;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        total = base * altura;
    }
}



