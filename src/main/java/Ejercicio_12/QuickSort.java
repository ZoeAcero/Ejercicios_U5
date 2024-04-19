package Ejercicio_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Quick Sort");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField();
        JButton button = new JButton("Sort Array");
        JLabel label = new JLabel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numbers = textField.getText().split(",");
                int[] arr = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
                quickSort(arr, 0, arr.length - 1);
                label.setText("Arreglo ordenado: " + Arrays.toString(arr));
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter array (comma separated):"));
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }
}
