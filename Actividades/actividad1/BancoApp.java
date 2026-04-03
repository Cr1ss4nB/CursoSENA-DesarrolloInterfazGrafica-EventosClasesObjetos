import personas.Cliente;
import cuentas.CuentaAhorro;
import cuentas.CuentaInversion;

public class BancoApp {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, "Juan Perez");

        CuentaAhorro ahorro = new CuentaAhorro(101, cliente1, 1000, 0.05);

        CuentaInversion inversion = new CuentaInversion(201, cliente1, 25000);

        ahorro.depositar(500);
        ahorro.retirar(200);

        inversion.retirar(5000);

        ahorro.mostrarSaldo();
        inversion.mostrarSaldo();

        System.out.println("Total cuentas creadas: " + cuentas.Cuenta.totalCuentas);
    }
}