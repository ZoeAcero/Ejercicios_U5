package Ejercicio_2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumerosNaturales {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Numeros Naturales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField startField = new JTextField();
        JTextField endField = new JTextField();
        JButton button = new JButton("Print Numbers");
        JTextArea textArea = new JTextArea();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(startField.getText());
                int d = Integer.parseInt(endField.getText());
                textArea.setText("");
                imprimirNaturalesEntre(a, d, textArea);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter start number:"));
        frame.add(startField);
        frame.add(new JLabel("Enter end number:"));
        frame.add(endField);
        frame.add(button);
        frame.add(new JScrollPane(textArea));

        frame.setVisible(true);
    }

    public static void imprimirNaturalesEntre(int a, int d, JTextArea textArea) {
        if (a <= d) {
            textArea.append(a + "\n");
            imprimirNaturalesEntre(a + 1, d, textArea);
        }
    }
}

