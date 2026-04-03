package cuentas;

import personas.Cliente;

public class CuentaInversion extends Cuenta {

    public CuentaInversion(int numeroCuenta, Cliente cliente, double saldoInicial) {
        super(numeroCuenta, cliente, saldoInicial);
    }

    public void retirar(double monto) {

        if ((saldo - monto) >= 10000) {
            saldo -= monto;
            System.out.println("Retiro realizado");
        } else {
            System.out.println("No se puede retirar, saldo mínimo 10000");
        }
    }
}