package Ejercicio_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNaturales {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Suma Naturales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField();
        JButton button = new JButton("Calculate Sum");
        JLabel label = new JLabel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(textField.getText());
                int suma = sumaNaturales(n);
                label.setText("La suma de los primeros " + n + " números naturales es: " + suma);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter number:"));
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }

    public static int sumaNaturales(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaNaturales(n - 1);
        }
    }
}

