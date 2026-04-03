package pruebas;

import modelo.Laptop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaLaptop extends JFrame {

    private JTextArea area;

    public PruebaLaptop() {
        setTitle("Prueba Laptop");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton btn = new JButton("Crear Laptops");
        add(btn, BorderLayout.NORTH);

        area = new JTextArea();
        area.setEditable(false);
        add(new JScrollPane(area), BorderLayout.CENTER);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutar();
            }
        });
    }

    private void ejecutar() {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("HP", "Pavilion", 8, 2500.0);
        Laptop l3 = new Laptop("Dell", "Inspiron", 16, 3000);

        area.setText("");
        area.append("Objetos creados: " + Laptop.getCuenta() + "\n\n");
        area.append(l1 + "\n");
        area.append(l2 + "\n");
        area.append(l3 + "\n");
    }

    public static void main(String[] args) {
        new PruebaLaptop().setVisible(true);
    }
}