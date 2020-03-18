package javaxswing.jradiobutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButton_1{
    private JFrame frame;
    private JLabel headJLabel, statusJLabel;
    private JPanel panel;
    private ButtonGroup button;
    private JRadioButton rabu1, rabu2, rabu3;

    public JRadioButton_1(){
        prageraUI();
    }
    public static void main(String[] args) {
        JRadioButton_1 simple = new JRadioButton_1();
        simple.showJRadioButton();
    }

    private void prageraUI(){
        frame = new JFrame("Vi du JRadioButton");
        frame.setSize(400,400);
        frame.setLocation(300, 300);
        frame.setLayout(new GridLayout(3,1));

        headJLabel = new JLabel("", JLabel.CENTER);
        statusJLabel = new JLabel("", JLabel.CENTER);
        statusJLabel.setSize(350, 100);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headJLabel);
        frame.add(panel);
        frame.add(statusJLabel);
        
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    private void showJRadioButton(){
        headJLabel.setText("JRadioButton Demo");
        statusJLabel.setText("Ket qua");

        button = new ButtonGroup();
        rabu1 = new JRadioButton("Apple", true);
        rabu2 = new JRadioButton("Mango");
        rabu3 = new JRadioButton("Sam Sung");
        rabu1.setBounds(50, 150, 100, 30);
        rabu2.setBounds(50, 170, 100, 30);
        rabu3.setBounds(50, 190, 100, 30);

        rabu1.setMnemonic(KeyEvent.VK_C);
        rabu2.setMnemonic(KeyEvent.VK_M);
        rabu3.setMnemonic(KeyEvent.VK_P);

        rabu1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                statusJLabel.setText("Apple RadioButton: "+(e.getStateChange() == 1?"Checked":"Unchecked"));
            }
        });
        rabu2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                statusJLabel.setText("Mango RadioButton: "+(e.getStateChange() == 1?"Checked":"Unchecked"));
            }
        });
        rabu3.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                statusJLabel.setText("Sam Sung RadioButton: "+(e.getStateChange() == 1?"Checked":"Unchecked"));
            }
        });

        button.add(rabu1);
        button.add(rabu2);
        button.add(rabu3);

        JButton button = new JButton("Click");
        button.setBounds(160, 210, 80, 30);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(rabu1.isSelected()){
                    JOptionPane.showMessageDialog(button, this, "Ban chon Apple", 0);
                }else if(rabu2.isSelected()){
                    JOptionPane.showMessageDialog(button, this, "Ban chon Mango", 0);
                }else if(rabu3.isSelected()){
                    JOptionPane.showMessageDialog(button, this, "Ban chon Sum Sung", 0);
                }
            }
        });
        panel.add(rabu1);
        panel.add(rabu2);
        panel.add(rabu3);
        panel.add(button);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}