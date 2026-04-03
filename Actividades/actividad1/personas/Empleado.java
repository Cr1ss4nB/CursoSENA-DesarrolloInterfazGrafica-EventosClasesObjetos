package personas;

public class Empleado extends Persona {

    private String puesto;
    private int aniosTrabajando;

    public Empleado(int numero, String nombre, String puesto, int aniosTrabajando) {
        super(numero, nombre);
        this.puesto = puesto;
        this.aniosTrabajando = aniosTrabajando;
    }

    public int calcularVacaciones() {

        int dias = 5 + (aniosTrabajando * 2);

        if (dias > 20) {
            dias = 20;
        }

        return dias;
    }
}