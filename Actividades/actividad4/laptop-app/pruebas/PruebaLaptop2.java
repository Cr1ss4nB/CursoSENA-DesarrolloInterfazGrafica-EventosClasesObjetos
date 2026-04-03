package pruebas;

import modelo.Laptop;

import javax.swing.*;
import java.awt.*;

public class PruebaLaptop2 extends JFrame {

    private JTextField txtMarca, txtModelo, txtMemoria, txtPrecio;
    private JTextArea area;

    private Laptop l1, l2, l3;

    public PruebaLaptop2() {
        setTitle("Prueba Laptop 2");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));

        // PANEL SUPERIOR (FORMULARIO)
        JPanel panelTop = new JPanel(new GridLayout(4, 2, 10, 10));
        panelTop.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        panelTop.add(new JLabel("Marca:"));
        txtMarca = new JTextField();
        panelTop.add(txtMarca);

        panelTop.add(new JLabel("Modelo:"));
        txtModelo = new JTextField();
        panelTop.add(txtModelo);

        panelTop.add(new JLabel("Memoria:"));
        txtMemoria = new JTextField();
        panelTop.add(txtMemoria);

        panelTop.add(new JLabel("Precio:"));
        txtPrecio = new JTextField();
        panelTop.add(txtPrecio);

        add(panelTop, BorderLayout.NORTH);

        // PANEL CENTRAL (BOTONES)
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));

        JButton btnL1 = new JButton("Crear L1");
        JButton btnL2 = new JButton("Crear L2");
        JButton btnL3 = new JButton("Crear L3");
        JButton btnModificar = new JButton("Modificar L1");
        JButton btnMostrar = new JButton("Mostrar");

        panelBotones.add(btnL1);
        panelBotones.add(btnL2);
        panelBotones.add(btnL3);
        panelBotones.add(btnModificar);
        panelBotones.add(btnMostrar);

        add(panelBotones, BorderLayout.CENTER);

        // AREA DE RESULTADOS (GRANDE)
        area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scroll = new JScrollPane(area);
        scroll.setBorder(BorderFactory.createTitledBorder("Resultados"));

        add(scroll, BorderLayout.SOUTH);

        // EVENTOS
        btnL1.addActionListener(e -> l1 = crearDesdeCampos());
        btnL2.addActionListener(e -> l2 = crearDesdeCampos());
        btnL3.addActionListener(e -> l3 = crearDesdeCampos());

        btnModificar.addActionListener(e -> modificarL1());
        btnMostrar.addActionListener(e -> mostrar());
    }

    private Laptop crearDesdeCampos() {
        try {
            String marca = txtMarca.getText();
            String modelo = txtModelo.getText();
            int memoria = Integer.parseInt(txtMemoria.getText());
            double precio = Double.parseDouble(txtPrecio.getText());

            return new Laptop(marca, modelo, memoria, precio);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datos inválidos");
            return null;
        }
    }

    private void modificarL1() {
        if (l1 == null) {
            JOptionPane.showMessageDialog(this, "Primero cree L1");
            return;
        }

        try {
            l1.setMemoria(Integer.parseInt(txtMemoria.getText()));
            l1.setPrecio(Double.parseDouble(txtPrecio.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datos inválidos");
        }
    }

    private void mostrar() {
        area.setText("");

        if (l1 != null) area.append("L1: " + l1 + "\n");
        if (l2 != null) area.append("L2: " + l2 + "\n");
        if (l3 != null) area.append("L3: " + l3 + "\n");

        area.append("\nTotal objetos: " + Laptop.getCuenta());
        area.append("\nCuenta + extra: " + Laptop.getCuenta(2.5));
    }

    public static void main(String[] args) {
        new PruebaLaptop2().setVisible(true);
    }
}