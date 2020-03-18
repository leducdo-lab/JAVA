package javaxswing.jtextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextField_1{
    private JFrame frame;
    private JLabel headLabel, statusLabel;
    private JPanel panel;
    private JTextField textField;

    public JTextField_1(){
        showUI();
    }

    private void showUI(){
        frame = new JFrame("Ví dụ JAVA SWING");
        frame.setSize(400, 400);
        frame.setLocation(400,200);
        frame.setLayout(new GridLayout(3,1));

        headLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        headLabel.setSize(350,100);
        statusLabel.setSize(350, 100);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3,2)); //GridLayout(3,1) FlowLayout()

        frame.add(headLabel);
        frame.add(panel);
        frame.add(statusLabel);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    private void showTextField(){
        headLabel.setText("Vi du JTextField Demo");
        statusLabel.setText("した");
        System.out.println("head: "+headLabel.getHeight());
        System.out.println("status: "+statusLabel.getHeight());
        System.out.println("panel: "+panel.getHeight()+" - "+panel.getWidth());

        JPanel tk_panel = new JPanel();

        JLabel usename = new JLabel("usename: ", JLabel.CENTER);
        usename.setBounds(5, 130, 40, 20);
        System.out.println("use: "+usename.getHeight());
        JLabel password = new JLabel("password: ", JLabel.CENTER);
        password.setBounds(5, 140, 40, 20);
        System.out.println("pass: "+password.getHeight());
        textField = new JTextField("",6);
        textField.setBounds(50, 130, 40, 25);
        System.out.println("text: "+textField.getHeight());
        final JPasswordField passField = new JPasswordField(6);
        passField.setBounds(50, 140, 40, 25);
        System.out.println("paText: "+passField.getHeight());

        JButton button = new JButton("Login");
        button.setBounds(100, 170, 40, 30);
        JButton exit = new JButton("Thoat");
        System.out.println("button: "+button.getHeight());
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data = "Username : "+textField.getText();
                data += ", Password: "+ new String(passField.getPassword());
                statusLabel.setText(data);
            }
        });

        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        tk_panel.add(button);
        panel.add(usename);
        panel.add(textField);
        panel.add(password);
        panel.add(passField);
        panel.add(tk_panel);
        panel.add(exit);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JTextField_1 simple = new JTextField_1();
        simple.showTextField();
    }
}