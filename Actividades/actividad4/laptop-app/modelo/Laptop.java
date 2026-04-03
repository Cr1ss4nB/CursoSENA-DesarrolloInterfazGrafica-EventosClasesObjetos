package modelo;

public class Laptop {

    private String marca;
    private String modelo;
    private int memoria;
    private double precio;

    private static int cuenta = 0;

    // método constructor sin parametros
    public Laptop() {
        this.marca = "";
        this.modelo = "";
        this.memoria = 0;
        this.precio = 0.0;
        cuenta++;
    }

    // método constructor
    public Laptop(String marca, String modelo, int memoria, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.precio = precio;
        cuenta++;
    }

    // método constructor sobrecargado
    public Laptop(String marca, String modelo, int memoria, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.precio = precio;
        cuenta++;
    }

    // getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoria() {
        return memoria;
    }

    // método modificador
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // método modificador sobrecargado
    public void setMemoria(double memoria) {
        this.memoria = (int) memoria;
    }

    public double getPrecio() {
        return precio;
    }

    // método modificador
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // método modificador sobrecargado
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // método estático
    public static int getCuenta() {
        return cuenta;
    }

    // método estático sobrecargado
    public static double getCuenta(double valor) {
        return cuenta + valor;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                " | Modelo: " + modelo +
                " | Memoria: " + memoria +
                "GB | Precio: " + precio;
    }
}