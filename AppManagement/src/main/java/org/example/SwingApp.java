package org.example;

import javax.swing.*;
import java.awt.*;

/**
 * Main application class that initializes and runs the Java Swing application.
 * It integrates multiple panels using CardLayout and a menu system.
 */
public class SwingApp extends JFrame {
    private final JPanel mainPanel;
    private final CardLayout cardLayout;

    /**
     * Constructor to set up the Swing Application with a menu and different panels.
     */
    public SwingApp() {
        setTitle("Java Swing Application");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set up menu bar
        setJMenuBar(createMenuBar());

        // Set up card layout for switching between different panels
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Adding panels to the main container
        mainPanel.add(new HomePanel(), "Home");
        mainPanel.add(new UserFormPanel(), "UserForm");
        mainPanel.add(new LoginPanel(), "Login");
        mainPanel.add(new AboutPanel(), "About");

        add(mainPanel);
        cardLayout.show(mainPanel, "Home"); // Set default view
    }

    /**
     * Creates and returns the menu bar with menu items and event handling.
     */
    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem userFormMenuItem = new JMenuItem("User");
        JMenuItem loginMenuItem = new JMenuItem("Login");
        JMenuItem aboutMenuItem = new JMenuItem("About Us");
        JMenuItem secretWordMenuItem = new JMenuItem("Secret Word");

        menu.add(userFormMenuItem);
        menu.add(loginMenuItem);
        menu.add(aboutMenuItem);
        menu.add(secretWordMenuItem);
        menuBar.add(menu);

        // Menu actions to switch between panels
        userFormMenuItem.addActionListener(e -> cardLayout.show(mainPanel, "UserForm"));
        loginMenuItem.addActionListener(e -> cardLayout.show(mainPanel, "Login"));
        aboutMenuItem.addActionListener(e -> cardLayout.show(mainPanel, "About"));
        secretWordMenuItem.addActionListener(e -> openSecretWordPanel());

        return menuBar;
    }

    /**
     * Opens a separate JFrame for the Secret Word panel.
     */
    private void openSecretWordPanel() {
        JFrame secretFrame = new JFrame("Secret Word Panel");
        secretFrame.setSize(400, 200);
        secretFrame.setLocationRelativeTo(this);
        secretFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        secretFrame.add(new SecretPanel());
        secretFrame.setVisible(true);
    }

    /**
     * Main method to launch the Swing application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingApp().setVisible(true));
    }
}