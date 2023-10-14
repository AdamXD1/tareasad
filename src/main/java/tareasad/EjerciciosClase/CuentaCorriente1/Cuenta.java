package tareasad.EjerciciosClase.CuentaCorriente1;

public class Cuenta {
    String dni;
    String nombre;
    String numCuenta;
    static double saldoCuenta;
    String titularCuenta;
    static final int MAXIMO_IMPORTE_RETIRO = 3000;
    static final int MAXIMO_IMPORTE_INGRESO = 6000;
    
    public Cuenta(String dni, String nombre, String numCuenta, double saldoCuenta) {
        this.dni = dni;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        Cuenta.saldoCuenta = saldoCuenta;
    }

    public static void ingresarDinero(double importeIngresado) {
        if (importeIngresado > MAXIMO_IMPORTE_INGRESO){
            System.out.println("Error: El máximo ingreso permitido es de 6000");
        }
        else {
            saldoCuenta = importeIngresado + saldoCuenta;
            System.out.println("Operación realizada correctamente");
            System.out.println("El nuevo saldo de la cuenta es " + saldoCuenta);
        }
    }

     public void sacarDinero (double importeRetirado){
        if (importeRetirado > MAXIMO_IMPORTE_RETIRO){
            System.out.println("Error: El máximo retiro permitido es de 3000");
        }
        else {
            saldoCuenta = saldoCuenta - importeRetirado;
            System.out.println("Operación realizada correctamente");
            System.out.println("El nuevo saldo de la cuenta es " + saldoCuenta);
        }
     }

     public static double mostrarSaldo(){
        System.out.println("El saldo actual de la cuenta" + saldoCuenta);
        return saldoCuenta;
     }

     public void cambioTitular(String titularCuenta){
        this.titularCuenta = titularCuenta;
     }

}


