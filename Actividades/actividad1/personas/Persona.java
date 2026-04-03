package personas;

public abstract class Persona {

    protected int numero;
    protected String nombre;

    public Persona(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("Numero: " + numero);
        System.out.println("Nombre: " + nombre);
    }
}
