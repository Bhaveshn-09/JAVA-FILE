package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample {

    JLabel label;

    MouseEventExample() {
        JFrame frame = new JFrame("Mouse Event Example");

        label = new JLabel("Perform mouse actions on the button");
        label.setBounds(50, 50, 400, 30);

        // Button (you can also add image like your previous program)
        JButton button = new JButton("Click Me");
        button.setBounds(150, 120, 150, 80);

        // Mouse Listener
        button.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed (Mouse Down)");
            }

            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released (Mouse Up)");
            }

            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    label.setText("Mouse Double Clicked");
                } else if (e.getClickCount() == 1) {
                    label.setText("Mouse Single Clicked");
                }
            }
        });

        frame.add(button);
        frame.add(label);

        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}