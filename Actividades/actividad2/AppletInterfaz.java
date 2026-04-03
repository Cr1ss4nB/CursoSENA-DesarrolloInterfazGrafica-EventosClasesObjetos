package actividad2;

import javax.swing.*;
import java.awt.*;

public class AppletInterfaz extends JFrame {

    private JComboBox<String> comboColores;
    private JPanel panelDibujo;
    private Color colorSeleccionado = Color.WHITE;

    public AppletInterfaz() {

        setTitle("AppletInterfaz - Selección de Colores");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new GridBagLayout());

        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Negro", "Cyan", "Magenta", "Gris", "Naranja", "Rosa"};
        comboColores = new JComboBox<>(colores);
        comboColores.setPreferredSize(new Dimension(150, 25));

        panelSuperior.add(comboColores);

        add(panelSuperior, BorderLayout.NORTH);

        panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(colorSeleccionado);

                int ancho = 350;
                int alto = 100;

                int x = (getWidth() - ancho) / 2;
                int y = (getHeight() - alto) / 2;

                g.fillRect(x, y, ancho, alto);
            }
        };

        panelDibujo.setBackground(Color.WHITE);
        panelDibujo.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

        add(panelDibujo, BorderLayout.CENTER);

        comboColores.addActionListener(e -> {

            String color = (String) comboColores.getSelectedItem();

            switch (color) {
                case "Rojo":
                    colorSeleccionado = Color.RED;
                    break;
                case "Verde":
                    colorSeleccionado = Color.GREEN;
                    break;
                case "Azul":
                    colorSeleccionado = Color.BLUE;
                    break;
                case "Amarillo":
                    colorSeleccionado = Color.YELLOW;
                    break;
                case "Negro":
                    colorSeleccionado = Color.BLACK;
                    break;
                case "Cyan":
                    colorSeleccionado = Color.CYAN;
                    break;
                case "Magenta":
                    colorSeleccionado = Color.MAGENTA;
                    break;
                case "Gris":
                    colorSeleccionado = Color.GRAY;
                    break;
                case "Naranja":
                    colorSeleccionado = Color.ORANGE;
                    break;
                case "Rosa":
                    colorSeleccionado = Color.PINK;
                    break;
                default:
                    colorSeleccionado = Color.WHITE;
                    break;
            }

            panelDibujo.repaint();
        });
    }

    public static void main(String[] args) {
        new AppletInterfaz().setVisible(true);
    }
}