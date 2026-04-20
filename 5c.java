package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {

    JLabel label;

    ImageButtonExample() {
        JFrame frame = new JFrame("Image Button Example");

        label = new JLabel();
        label.setBounds(50, 50, 400, 50);

        // Load images correctly
        ImageIcon clockIcon = new ImageIcon("images/clock.png");
        ImageIcon hourglassIcon = new ImageIcon("images/hourglass.png");

        // Resize images
        Image img1 = clockIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image img2 = hourglassIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

        clockIcon = new ImageIcon(img1);
        hourglassIcon = new ImageIcon(img2);

        JButton btn1 = new JButton("Digital Clock", clockIcon);
        JButton btn2 = new JButton("Hour Glass", hourglassIcon);

        btn1.setBounds(50, 120, 200, 80);
        btn2.setBounds(260, 120, 200, 80);

        btn1.addActionListener(e -> label.setText("Digital Clock is pressed"));
        btn2.addActionListener(e -> label.setText("Hour Glass is pressed"));

        frame.add(btn1);
        frame.add(btn2);
        frame.add(label);

        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}