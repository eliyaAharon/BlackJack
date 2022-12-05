import com.company.Main;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login() {
        this.setTitle("Login Window");
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(7, 161, 44));
        // label setting
        JLabel label = new JLabel();
        label.setBounds(70, 100, 350, 100);
        Font f = new Font("Monospaced", Font.BOLD, 28);
        label.setFont(f);
        label.setText("Enter the bet amount");
        label.setForeground(Color.white);
        label.setBackground(Color.green.brighter());
        this.add(label);
        // text field
        JTextField textField = new JTextField();
        textField.setBounds(80, 200, 175, 40);
        Font f1 = new Font("Monospaced", Font.BOLD, 19);
        textField.setFont(f1);
        this.add(textField);
        this.setVisible(true);
        // button
        JButton button = new JButton("Confirm✔️");
        button.setBounds(260, 200, 150, 40);
        Font f2 = new Font("Monospaced", Font.BOLD, 16);
        button.setFont(f2);
        this.add(button);

        button.addActionListener((e -> {
            if (!textField.getText().equals("")) {
                this.dispose();
                Main main = new Main(textField.getText());
            }

        }));

    }

    public static void main(String[] args) {
        Login login = new Login();
    }
}
