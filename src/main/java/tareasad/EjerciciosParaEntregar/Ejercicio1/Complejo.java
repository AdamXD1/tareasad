package tareasad.EjerciciosParaEntregar.Ejercicio1;

public class Complejo {
    private double dPReal;
    private double dPImag;

    public Complejo() {
    }

    public Complejo(double dPReal, double dPImag) {
        this.dPReal = dPReal;
        this.dPImag = dPImag;
    }

    public void asignar(double x, double y) {
        dPReal = x;
        dPImag = y;
    }

    public Complejo sumar(Complejo c1, Complejo c2) {
        double sumaReal = c1.dPReal + c2.dPReal;
        double sumaImag = c1.dPImag + c2.dPImag;
        return new Complejo(sumaReal, sumaImag);
    }

    public void imprimir() {
        System.out.println(dPReal + " + " + dPImag + "i");
    }
}
