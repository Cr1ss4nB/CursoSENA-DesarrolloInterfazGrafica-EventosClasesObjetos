package vista;
import modelo.Cuenta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletMetodos extends JFrame {

    private JTextField txtNombre;
    private JTextField txtNumero;
    private JTextField txtSaldo;
    private JTextArea areaResultado;

    public AppletMetodos() {
        setTitle("Métodos - Cuenta Bancaria");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new BorderLayout());

        JLabel titulo = new JLabel("Métodos - Cuenta Bancaria", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        panelSuperior.add(titulo, BorderLayout.NORTH);

        JPanel panelCampos = new JPanel(new GridLayout(1, 3, 10, 10));

        JPanel panelNombre = new JPanel(new GridLayout(2, 1));
        panelNombre.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelNombre.add(txtNombre);

        JPanel panelNumero = new JPanel(new GridLayout(2, 1));
        panelNumero.add(new JLabel("Número:"));
        txtNumero = new JTextField();
        panelNumero.add(txtNumero);

        JPanel panelSaldo = new JPanel(new GridLayout(2, 1));
        panelSaldo.add(new JLabel("Saldo:"));
        txtSaldo = new JTextField();
        panelSaldo.add(txtSaldo);

        panelCampos.add(panelNombre);
        panelCampos.add(panelNumero);
        panelCampos.add(panelSaldo);

        panelSuperior.add(panelCampos, BorderLayout.CENTER);

        JButton btnCrear = new JButton("Despliega Cuenta");
        panelSuperior.add(btnCrear, BorderLayout.SOUTH);

        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelInferior = new JPanel(new BorderLayout());
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        panelInferior.add(new JScrollPane(areaResultado), BorderLayout.CENTER);

        add(panelInferior, BorderLayout.CENTER);

        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearCuenta();
            }
        });
    }

    private void crearCuenta() {
        String nombre = txtNombre.getText();
        String numero = txtNumero.getText();
        double saldo = 0;

        try {
            saldo = Double.parseDouble(txtSaldo.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El saldo debe ser numérico");
            return;
        }

        Cuenta cuenta = new Cuenta(numero, nombre, saldo);
        areaResultado.setText(cuenta.toString());
    }
}