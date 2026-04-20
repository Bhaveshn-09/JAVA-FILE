package Swings1;

import java.awt.*;
import javax.swing.*;

public class SwingExample {

    SwingExample() {
        JFrame jfrm = new JFrame("A Simple Swing Application");

        jfrm.setSize(600, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Hello! VI C , Welcome to Swing Programming!", JLabel.CENTER);

        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));
        jlab.setForeground(Color.BLUE);

        jfrm.setLayout(new BorderLayout());
        jfrm.add(jlab, BorderLayout.CENTER);

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new SwingExample());
    }
}