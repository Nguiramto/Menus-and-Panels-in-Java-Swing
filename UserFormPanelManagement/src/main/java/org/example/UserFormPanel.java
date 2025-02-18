package org.example;

import javax.swing.*;
import java.awt.*;

public class UserFormPanel extends JPanel {
    private String savedUsername = "";
    private String savedEmail = "";
    private String savedPhone = "";

    public UserFormPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(15);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(15);
        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField(15);
        JButton saveButton = new JButton("Save");

        gbc.gridx = 0; gbc.gridy = 0; add(userLabel, gbc);
        gbc.gridx = 1; add(userField, gbc);
        gbc.gridx = 0; gbc.gridy = 1; add(emailLabel, gbc);
        gbc.gridx = 1; add(emailField, gbc);
        gbc.gridx = 0; gbc.gridy = 2; add(phoneLabel, gbc);
        gbc.gridx = 1; add(phoneField, gbc);
        gbc.gridx = 1; gbc.gridy = 4; add(saveButton, gbc);

        saveButton.addActionListener(e -> {
            savedUsername = userField.getText();
            savedEmail = emailField.getText();
            savedPhone = phoneField.getText();
            JOptionPane.showMessageDialog(null, "User Data Saved!");
        });
    }
}
