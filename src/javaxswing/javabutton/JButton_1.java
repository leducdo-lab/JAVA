package javaxswing.javabutton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButton_1{
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Demo");
        JButton button = new JButton("click");
        JButton button2 = new JButton("hello");
        final JLabel label = new JLabel("Đổi tên của tao đi");

        frame.setSize(400 , 400);
        frame.setLocation(200, 250);
        frame.setLayout(new GridLayout(2,2,10,10));
        button.setBounds(50, 200, 50, 30);
        System.out.println(button.getWidth());
        button2.setBounds(100, 200, 50, 30);
        label.setBounds(50,100,100,30);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("bye bye");
            }
        });

        frame.add(label);
        frame.add(button,BorderLayout.CENTER);
        frame.add(button2, BorderLayout.AFTER_LAST_LINE);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}