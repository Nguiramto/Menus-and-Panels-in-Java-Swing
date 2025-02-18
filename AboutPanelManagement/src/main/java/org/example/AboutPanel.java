package org.example;

import javax.swing.*;
import java.awt.*;

public class AboutPanel extends JPanel {
    public AboutPanel() {
        setLayout(new BorderLayout());
        JLabel textLabel = new JLabel("<html><h3>About Us</h3><p>We strive for excellence through unity and teamwork. Together, we believe in achieving perfection and delivering great work. Join us in creating something truly outstanding!</p></html>", SwingConstants.CENTER);
        textLabel.setBackground(Color.WHITE);
        textLabel.setOpaque(true);

        JLabel imageLabel = new JLabel(new ImageIcon("C:/GitHub/Menus-and-Panels-in-Java-Swing/AppManagement/src/main/java/org/example/8614c929-c95d-4e89-8b01-7b86bf44b8a9.jpeg"));
        add(textLabel, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);
    }
}
