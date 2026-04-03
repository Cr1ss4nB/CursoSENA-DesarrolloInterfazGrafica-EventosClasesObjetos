package modelo; 

public class Cuenta {

    private String numero;
    private String nombre;
    private double saldo;

    // método constructor sin parametros
    public Cuenta() {
        this.numero = "";
        this.nombre = "";
        this.saldo = 0.0;
    }

    // método constructor
    public Cuenta(String numero, String nombre, double saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // getters y setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    // método modificador
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "DATOS DE LA CUENTA BANCARIA:\n" +
                "Número: " + numero + "\n" +
                "Nombre: " + nombre + "\n" +
                "Saldo: " + saldo + "\n";
    }
}