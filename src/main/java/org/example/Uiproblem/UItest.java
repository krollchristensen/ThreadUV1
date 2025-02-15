package org.example.Uiproblem;

import javax.swing.*;

public class UItest {
    public static void main(String[] args) {
        // Opret og vis GUI
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Blocking UI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Opret en knap til at udføre den langsommelige opgave
        JButton slowTaskButton = new JButton("Klik for at udføre en langsommelig opgave");
        slowTaskButton.addActionListener(e -> {
            // Simulerer en langsommelig opgave ved at sove tråden i 5 sekunder
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(frame, "Langsom opgave udført!");
        });

        // Opret en knap til at bekræfte, at UI er blokeret
        JButton confirmButton = new JButton("Klik for at bekræfte blokering af UI");
        confirmButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "UI er ikke blokeret mere"));

        // Tilføj knapperne til indholdspanelet
        JPanel panel = new JPanel();
        panel.add(slowTaskButton);
        panel.add(confirmButton);
        frame.getContentPane().add(panel);

        // Indstil vinduets størrelse og vis det
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
