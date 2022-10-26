package za.ac.cput.views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginGUI extends JFrame implements ActionListener {
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnExit;
    private Font ft;


    public LoginGUI() {
        super("User Authentication");
        lblUsername = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        btnLogin = new JButton("Login");
        btnExit = new JButton("Exit");

        ft = new Font("Arial", Font.PLAIN, 24);
    }

    public void setGUI() {
        this.setLayout(new GridLayout(3, 2));

        lblUsername.setFont(ft);
        txtUsername.setFont(ft);
        lblPassword.setFont(ft);
        txtPassword.setFont(ft);
        btnLogin.setFont(ft);
        btnExit.setFont(ft);

        this.add(lblUsername);
        this.add(txtUsername);
        this.add(lblPassword);
        this.add(txtPassword);
        this.add(btnLogin);
        this.add(btnExit);

        btnLogin.addActionListener(this);
        btnExit.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public boolean isValidUser(String username, String password) {
        String user[] = {"Admin", "Danni"};
        String passwd[] = {"admin123", "danni123"};
        boolean found = false;

        for (int i = 0; i < user.length; i++) {
            if (username.equals(user[i]) && password.equals(passwd[i])) {
                found = true;
                break;
            }
        }
        return found;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Login")) {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            if (isValidUser(username, password)) {
                JOptionPane.showMessageDialog(null, "Welcome. Login successful!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid user");
            }
        }
        else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LoginGUI().setGUI();
//        new LoginGUI().runAdminGui();

    }
}
