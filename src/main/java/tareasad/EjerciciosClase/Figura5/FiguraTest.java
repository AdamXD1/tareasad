package tareasad.EjerciciosClase.Figura5;

public class FiguraTest {
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(5,4);
        Circulo miCirculo = new Circulo(2.8);
        Triangulo miTriangulo = new Triangulo(3,4);
        Figura[] listFiguras = {miRectangulo, miCirculo, miTriangulo};

        for (int i = 0; i < listFiguras.length; i++){
            listFiguras[i].calcularArea();
            listFiguras[i].mostrarArea();
        }

    }
}
