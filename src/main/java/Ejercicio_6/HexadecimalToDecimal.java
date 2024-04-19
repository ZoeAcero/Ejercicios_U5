package Ejercicio_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Hexadecimal to Decimal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField();
        JButton button = new JButton("Convert");
        JLabel label = new JLabel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hexadecimal = textField.getText();
                int decimal = hexToDecimal(hexadecimal, hexadecimal.length() - 1);
                label.setText("El valor decimal de " + hexadecimal + " es: " + decimal);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter hexadecimal number:"));
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }

    public static int hexToDecimal(String hex, int index) {
        if (index < 0) {
            return 0;
        } else {
            char c = hex.charAt(index);
            int valor = Character.isDigit(c) ? c - '0' : 10 + c - 'A';
            return valor * (int) Math.pow(16, hex.length() - 1 - index) + hexToDecimal(hex, index - 1);
        }
    }
}
