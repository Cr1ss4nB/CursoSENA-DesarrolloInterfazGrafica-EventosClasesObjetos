package actividad3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraConEventos extends JFrame implements ActionListener {

    private JTextField txtNum1, txtNum2, txtResultado;

    private JButton btnSuma, btnResta, btnMulti, btnDiv;
    private JButton btnRaiz1, btnRaiz2, btnMayor, btnLimpiar;

    public CalculadoraConEventos() {

        setTitle("Calculadora con Eventos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 1));

        // Entrada de los números
        JPanel panelEntrada = new JPanel();

        panelEntrada.add(new JLabel("Número 1:"));
        txtNum1 = new JTextField(8);
        panelEntrada.add(txtNum1);

        panelEntrada.add(new JLabel("Número 2:"));
        txtNum2 = new JTextField(8);
        panelEntrada.add(txtNum2);

        add(panelEntrada);

        // operaciones básicas
        JPanel panelOperaciones = new JPanel();

        btnSuma = new JButton("Suma");
        btnResta = new JButton("Resta");
        btnMulti = new JButton("Multiplicación");
        btnDiv = new JButton("División");

        panelOperaciones.add(btnSuma);
        panelOperaciones.add(btnResta);
        panelOperaciones.add(btnMulti);
        panelOperaciones.add(btnDiv);

        add(panelOperaciones);

        // raices
        JPanel panelRaices = new JPanel();

        btnRaiz1 = new JButton("Raíz N°1");
        btnRaiz2 = new JButton("Raíz N°2");

        panelRaices.add(btnRaiz1);
        panelRaices.add(btnRaiz2);

        add(panelRaices);

        // nùmero mayor y limpiar el resultado
        JPanel panelOtros = new JPanel();

        btnMayor = new JButton("Mayor");
        btnLimpiar = new JButton("Limpiar");

        panelOtros.add(btnMayor);
        panelOtros.add(btnLimpiar);

        add(panelOtros);

        // resultado
        JPanel panelResultado = new JPanel();

        panelResultado.add(new JLabel("Resultado:"));
        txtResultado = new JTextField(15);
        txtResultado.setEditable(false);
        panelResultado.add(txtResultado);

        add(panelResultado);

        // todos los eventos para los botones
        btnSuma.addActionListener(this);
        btnResta.addActionListener(this);
        btnMulti.addActionListener(this);
        btnDiv.addActionListener(this);
        btnRaiz1.addActionListener(this);
        btnRaiz2.addActionListener(this);
        btnMayor.addActionListener(this);
        btnLimpiar.addActionListener(this);
    }

    // validaciones a divisiones entre cero y raices de nùmeros negativos
    private float getNumero(JTextField txt) throws Exception {
        String texto = txt.getText();
        float num = Float.parseFloat(texto);

        if (texto.contains(".")) {
            String dec = texto.substring(texto.indexOf(".") + 1);
            if (dec.length() > 2) {
                throw new Exception("Solo se permiten 2 decimales");
            }
        }

        return num;
    }

    // acciones para los botones
    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            if (e.getSource() == btnLimpiar) {
                txtNum1.setText("");
                txtNum2.setText("");
                txtResultado.setText("");
                return;
            }

            float n1 = getNumero(txtNum1);
            float n2 = getNumero(txtNum2);
            float resultado = 0;

            if (e.getSource() == btnSuma) {
                resultado = n1 + n2;
            }

            else if (e.getSource() == btnResta) {
                resultado = n1 - n2;
            }

            else if (e.getSource() == btnMulti) {
                resultado = n1 * n2;
            }

            else if (e.getSource() == btnDiv) {
                if (n2 == 0) {
                    System.out.println("Error: División por cero");
                    txtResultado.setText("Error división por cero");
                    return;
                }
                resultado = n1 / n2;
            }

            else if (e.getSource() == btnRaiz1) {
                if (n1 < 0) {
                    System.out.println("Error: Raíz negativa");
                    txtResultado.setText("Error raíz negativa");
                    return;
                }
                resultado = (float) Math.sqrt(n1);
            }

            else if (e.getSource() == btnRaiz2) {
                if (n2 < 0) {
                    System.out.println("Error: Raíz negativa");
                    txtResultado.setText("Error raíz negativa");
                    return;
                }
                resultado = (float) Math.sqrt(n2);
            }

            else if (e.getSource() == btnMayor) {
                resultado = Math.max(n1, n2);
            }

            txtResultado.setText(String.valueOf(resultado));

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            txtResultado.setText("Entrada inválida");
        }
    }

    public static void main(String[] args) {
        new CalculadoraConEventos().setVisible(true);
    }
}