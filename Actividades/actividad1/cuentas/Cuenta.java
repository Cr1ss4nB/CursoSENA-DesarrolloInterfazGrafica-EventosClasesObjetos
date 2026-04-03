package cuentas;

import personas.Cliente;

public abstract class Cuenta {

    protected int numeroCuenta;
    protected double saldo;
    protected Cliente cliente;

    public static int totalCuentas = 0;

    public Cuenta(int numeroCuenta, Cliente cliente, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = saldoInicial;
        totalCuentas++;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public abstract void retirar(double monto);

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}