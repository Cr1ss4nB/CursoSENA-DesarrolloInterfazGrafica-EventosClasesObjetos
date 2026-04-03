package prueba;

import modelo.Laptop;

public class PruebaLaptop2 {

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Lenovo", "IdeaPad", 8, 2000.0);
        Laptop l2 = new Laptop("HP", "Victus", 16, 3500);
        Laptop l3 = new Laptop("Asus", "ROG", 32, 5000.0);

        mostrar(l1, l2, l3);

        l1.setMemoria(12);
        l2.setMemoria(20.5);
        l3.setPrecio(4800);

        System.out.println("\nDespués de modificar:\n");
        mostrar(l1, l2, l3);

        System.out.println("\nCuenta total: " + Laptop.getCuenta());
        System.out.println("Cuenta con valor extra: " + Laptop.getCuenta(2.5));
    }

    public static void mostrar(Laptop l1, Laptop l2, Laptop l3) {
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}