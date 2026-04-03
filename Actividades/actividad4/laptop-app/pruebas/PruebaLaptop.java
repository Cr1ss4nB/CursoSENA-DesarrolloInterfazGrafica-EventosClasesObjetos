package prueba;

import modelo.Laptop;

public class PruebaLaptop {

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("HP", "Pavilion", 8, 2500.0);
        Laptop l3 = new Laptop("Dell", "Inspiron", 16, 3000);

        System.out.println("Objetos creados: " + Laptop.getCuenta());

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}