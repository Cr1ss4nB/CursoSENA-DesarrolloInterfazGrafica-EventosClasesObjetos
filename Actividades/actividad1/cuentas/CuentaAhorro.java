package cuentas;

import personas.Cliente;

public class CuentaAhorro extends Cuenta {

    private double interesAnual;

    public CuentaAhorro(int numeroCuenta, Cliente cliente, double saldoInicial, double interesAnual) {
        super(numeroCuenta, cliente, saldoInicial);
        this.interesAnual = interesAnual;
    }

    public void retirar(double monto) {

        if ((saldo - monto) >= 500) {
            saldo -= monto;
            System.out.println("Retiro realizado");
        } else {
            System.out.println("No se puede retirar, saldo mínimo 500");
        }
    }

    public void calcularInteres() {
        saldo += saldo * interesAnual / 12;
    }
}