package javaxswing.jcheckedbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCheckBox_1{
    private JFrame frame;
    private JLabel headJLabel, statusJLabel, textCheckBox;
    private JPanel panel;

    public JCheckBox_1(){
        pragareUI();
    }

    public static void main(String[] args) {
        JCheckBox_1 simple = new JCheckBox_1();
        simple.showChexBoxDemo();
    }

    private void pragareUI(){
        frame = new JFrame("Vi du JCheckBox");
        frame.setSize(400,400);
        frame.setLayout(new GridLayout(3,1,10,10));
        frame.setLocation(300,300);

        headJLabel = new JLabel("",JLabel.CENTER);
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

    private void showChexBoxDemo(){
        headJLabel.setText("JCheckBox Demo");
        textCheckBox = new JLabel("Moi Ban Chon");

        final JCheckBox chkApple = new JCheckBox("Apple");
        final JCheckBox chkMango = new JCheckBox("Mango");
        final JCheckBox chkPeer = new JCheckBox("Peer");

        chkApple.setMnemonic(KeyEvent.VK_C);
        chkMango.setMnemonic(KeyEvent.VK_M);
        chkPeer.setMnemonic(KeyEvent.VK_P);

        chkApple.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                statusJLabel.setText("Apple Checkbox: "+(e.getStateChange()==1?"Checked":"unchecked"));
            }
        });
        chkMango.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                statusJLabel.setText("Mango Checkbox: "+(e.getStateChange()==1?"Checked":"unchecked"));
            }
        });
        chkPeer.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                statusJLabel.setText("Peer Checkbox: "+(e.getStateChange()==1?"Checked":"unchecked"));
            }
        });

        panel.add(textCheckBox);
        panel.add(chkApple);
        panel.add(chkMango);
        panel.add(chkPeer);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}