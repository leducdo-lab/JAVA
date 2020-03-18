package javaxswing.jcombox;

import javax.swing.*;

public class JComBox_1{
    public static void main(String[] args) {
        String country[] = {"India","Aus","U.S.A","England","Newzeland"};
        JFrame frame = new JFrame("Vi du Java Swing");
        JComboBox comboBox = new JComboBox<>(country);

        comboBox.setBounds(50, 50, 150, 20);

        frame.setSize(400,500);
        frame.setLocation(300, 400);
        frame.setLayout(null);
        frame.add(comboBox);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}