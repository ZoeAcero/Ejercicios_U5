package Ejercicio_13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class QuickSortOptimizado {
    private static final int INSERTION_SORT_THRESHOLD = 10; // Umbral para cambiar a Insertion Sort

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("QuickSort Optimizado");
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

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            if (high - low <= INSERTION_SORT_THRESHOLD) {
                insertionSort(arr, low, high);
            } else {
                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = medianOfThree(arr, low, high);
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
}
