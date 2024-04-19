package Ejercicio_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaximoVcetor {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Maximo Vector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField();
        JButton button = new JButton("Find Max");
        JLabel label = new JLabel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numbers = textField.getText().split(",");
                int[] vector = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    vector[i] = Integer.parseInt(numbers[i]);
                }
                int maximo = encontrarMaximo(vector, 0);
                label.setText("El valor máximo del vector es: " + maximo);
            }
        });
}
