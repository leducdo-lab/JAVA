package javaxswing.jtextare;
import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextArea_1{
    private JFrame frame;
    private JLabel headLabel, statusLabel;
    private JPanel panel;

    public JTextArea_1() {
        /* Đây là code JTEXTAREA đơn giản */
        // setTitle("Vi Du JAVA SWING");
        // setSize(400,400);
        // setLocation(300, 350);
        // setDefaultCloseOperation(3);

        // JTextArea area = new JTextArea(300,300);
        // area.setBounds(10, 30, 300, 100);
        // //area.setSize(300, 100);
        // area.setBackground(Color.BLACK);
        // area.setForeground(Color.WHITE);

        // add(area, BorderLayout.CENTER);
        // setLayout(null);
        // setVisible(true);

        showUI();
    }

    public static void main(String[] args) {
        JTextArea_1 simple = new JTextArea_1();
        simple.showTextArea();
    }

    private void showUI(){
        frame = new JFrame("Vi Du Java Swing");
        frame.setSize(400,400);
        frame.setLocation(350, 350);
        frame.setLayout(new GridLayout(3,1));

        headLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);

        statusLabel.setSize(350,100);
        headLabel.setSize(350, 120);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headLabel);
        frame.add(panel);
        frame.add(statusLabel);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    private void showTextArea(){
        headLabel.setText("Day la man: JTextArea");

        JLabel comment = new JLabel("Comment: ", JLabel.LEFT);
        comment.setSize(50, 50);
        System.out.println(comment.getWidth());
        
        final JTextArea commentText = new JTextArea("This is a Swing tutorial to make GUI application in Java.", 5, 20);
        commentText.setBackground(Color.WHITE);
        commentText.setForeground(Color.BLACK);
        commentText.setSize(300, 100);

        JScrollPane scrollPane = new JScrollPane(commentText);
        scrollPane.setBounds(60, 10, 300, 100);
        JButton button = new JButton("show");

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                statusLabel.setText(commentText.getText());
            }
        });

        panel.add(comment);
        panel.add(scrollPane);
        panel.add(button);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}