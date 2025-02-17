package org.example;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    private final String savedUsername = "testUser"; // Example data
    private final String savedEmail = "test@example.com";
    private final String savedPhone = "1234567890";

    public LoginPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(15);
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        JTextArea userInfoArea = new JTextArea(5, 25);
        userInfoArea.setEditable(false);

        gbc.gridx = 0; gbc.gridy = 0; add(userLabel, gbc);
        gbc.gridx = 1; add(userField, gbc);
        gbc.gridx = 0; gbc.gridy = 1; add(passLabel, gbc);
        gbc.gridx = 1; add(passField, gbc);
        gbc.gridx = 1; gbc.gridy = 2; add(loginButton, gbc);
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2; add(new JScrollPane(userInfoArea), gbc);

        loginButton.addActionListener(e -> {
            userInfoArea.setText("User Details:\n");
            userInfoArea.append("Username: " + savedUsername + "\n");
            userInfoArea.append("Email: " + savedEmail + "\n");
            userInfoArea.append("Phone: " + savedPhone + "\n");
        });
    }
}
