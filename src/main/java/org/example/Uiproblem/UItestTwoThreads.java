package org.example.Uiproblem;

import javax.swing.*;
public class UItestTwoThreads {
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
            // Start en ny tråd til at udføre den langsommelige opgave
            Thread slowTaskThread = new Thread(() -> {
                // Simulerer en langsommelig opgave ved at sove tråden i 5 sekunder
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                // Vis beskedboks efter den langsommelige opgave er udført
                SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(frame, "Langsom opgave udført!"));
            });
            // Start den nye tråd
            slowTaskThread.start();
        });

        // Opret en knap til at bekræfte, at UI er blokeret
        JButton confirmButton = new JButton("UI er ikke blokeret...");
        confirmButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "UI er blokeret!"));

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
