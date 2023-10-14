package tareasad.EjerciciosClase.CuentaCorriente1;

public class CuentaTest {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("123456789", "Juan Pérez", "001", 5000.0);
        Cuenta cuenta2 = new Cuenta("987654321", "María Gómez", "002", 3000.0);

        Cuenta.ingresarDinero(1000.0);
        cuenta1.sacarDinero(500.0);
        Cuenta.ingresarDinero(2000.0);

        transferencia(cuenta1, cuenta2, 1500.0);
    }
    
    public static void transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double importe) {
        if (importe <= Cuenta.saldoCuenta) {
            cuentaOrigen.sacarDinero(importe);
            Cuenta.ingresarDinero(importe);
            System.out.println("Transferencia realizada correctamente");
        } else {
            System.out.println("Error: Saldo insuficiente en la cuenta origen");
        }
    }
}
