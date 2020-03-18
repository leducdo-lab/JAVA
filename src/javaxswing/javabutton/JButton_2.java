package javaxswing.javabutton;

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class JButton_2{
    private JFrame frame;
    private JLabel headLabel, statusJLabel;
    private JPanel panel;

    public JButton_2(){
        prepageUI();
    }

    public static void main(String[] args) {
        JButton_2 button = new JButton_2();
        button.showBorderLayoutDemo();
    }

    private void prepageUI(){
        frame = new JFrame("Demo Java Swing");
        frame.setSize(400,400);
        frame.setLayout(new GridLayout(3, 1));

        headLabel = new JLabel("", JLabel.CENTER);
        statusJLabel = new JLabel("",JLabel.CENTER);

        statusJLabel.setSize(350, 100);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headLabel);
        frame.add(panel);
        frame.add(statusJLabel);

        frame.setLocation(400,300);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
    private void showBorderLayoutDemo(){
        headLabel.setText("Demo BorderLayout");
        statusJLabel.setText("下");

        JPanel pannel = new JPanel();
        pannel.setForeground(Color.RED);
        pannel.setSize(300,300);
        BorderLayout layout = new BorderLayout();
        layout.setHgap(10);
        layout.setVgap(10);
        pannel.setLayout(layout);

        pannel.add(new JButton("Center"),BorderLayout.CENTER);
        pannel.add(new JButton("Line Start"),BorderLayout.LINE_START); 
        pannel.add(new JButton("Line End"),BorderLayout.LINE_END);
        pannel.add(new JButton("East"),BorderLayout.EAST);   
        pannel.add(new JButton("West"),BorderLayout.WEST); 
        pannel.add(new JButton("North"),BorderLayout.NORTH); 
        pannel.add(new JButton("South"),BorderLayout.SOUTH);

        panel.add(pannel);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}