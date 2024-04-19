package Ejercicio_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Potencia {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Potencia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField baseField = new JTextField();
        JTextField exponentField = new JTextField();
        JButton button = new JButton("Calculate Power");
        JLabel label = new JLabel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(baseField.getText());
                int y = Integer.parseInt(exponentField.getText());
                int resultado = potencia(x, y);
                label.setText(x + " elevado a la " + y + " es igual a: " + resultado);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter base:"));
        frame.add(baseField);
        frame.add(new JLabel("Enter exponent:"));
        frame.add(exponentField);
        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }

    public static int potencia(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * potencia(x, y - 1);
        }
    }
}
