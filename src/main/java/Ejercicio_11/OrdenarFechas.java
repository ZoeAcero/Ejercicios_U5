package Ejercicio_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class OrdenarFechas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Ordenar Fechas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField();
        JButton button = new JButton("Add Date");
        JButton sortButton = new JButton("Sort Dates");
        JTextArea textArea = new JTextArea();

        List<Date> fechas = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                try {
                    Date fecha = dateFormat.parse(input);
                    fechas.add(fecha);
                    textArea.append(input + "\n");
                    textField.setText("");
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(frame, "Formato de fecha incorrecto. Ingrese la fecha nuevamente.");
                }
            }
        });

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(fechas);
                textArea.setText("");
                for (Date fecha : fechas) {
                    textArea.append(dateFormat.format(fecha) + "\n");
                }
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter date (format dd/MM/yyyy):"));
        frame.add(textField);
        frame.add(button);
        frame.add(sortButton);
        frame.add(new JScrollPane(textArea));

    }
