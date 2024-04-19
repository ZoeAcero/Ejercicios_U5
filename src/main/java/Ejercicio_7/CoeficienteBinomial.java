package Ejercicio_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoeficienteBinomial {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Contador de Genes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField();
        JButton button = new JButton("Count Genes");
        JLabel label = new JLabel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadenaADN = textField.getText();
                int genes = contarGenes(cadenaADN);
                label.setText("La cadena de ADN tiene " + genes + " genes.");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter DNA sequence:"));
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }

    public static int contarGenes(String cadenaADN) {
        int contador = 0;
        int indice = 0;
        while (indice < cadenaADN.length()) {
            indice = cadenaADN.indexOf("ATG", indice);
            if (indice == -1) {
                break;
            }
            contador++;
            indice += 3;
        }
        return contador;
    }
}
