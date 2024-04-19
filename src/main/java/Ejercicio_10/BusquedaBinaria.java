package Ejercicio_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusquedaBinaria {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Busqueda Binaria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField();
        JButton button = new JButton("Select File and Search");
        JLabel label = new JLabel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        BufferedReader br = new BufferedReader(new FileReader(selectedFile));
                        List<String> palabras = new ArrayList<>();
                        String palabra;
                        while ((palabra = br.readLine()) != null) {
                            palabras.add(palabra);
                        }
                        br.close();

                        Collections.sort(palabras);

                        String palabraBuscada = textField.getText();

                        int indice = Collections.binarySearch(palabras, palabraBuscada);
                        if (indice >= 0) {
                            label.setText("La palabra se encontró en la posición " + (indice + 1));
                        } else {
                            label.setText("La palabra no se encontró en el archivo.");
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
}
