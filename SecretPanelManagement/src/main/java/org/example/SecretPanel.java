package org.example;

import javax.swing.*;
import java.awt.*;

public class SecretPanel extends JPanel {
    public SecretPanel() {
        setLayout(new FlowLayout());
        setBackground(new Color(0, 128, 128));

        JLabel label = new JLabel("Enter your secret word:");
        label.setForeground(Color.WHITE);
        JTextField inputField = new JTextField(15);
        JButton submitButton = new JButton("Submit");
        JLabel resultLabel = new JLabel("Your secret word will appear here.");
        resultLabel.setForeground(Color.WHITE);

        add(label);
        add(inputField);
        add(submitButton);
        add(resultLabel);

        submitButton.addActionListener(e -> resultLabel.setText("Entered Secret Word: " + inputField.getText()));
    }
}
