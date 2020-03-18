package javaxswing.jscroll;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JScrollBar_Demo{
    private JFrame frame;
    private JLabel headLabel, statusLabel;
    private JPanel panel;

    public JScrollBar_Demo(){
        showUI();
    }

    public static void main(String[] args) {
        JScrollBar_Demo simple = new JScrollBar_Demo();
        simple.showJScrollBarDemo();
    }

    private void showUI(){
        frame = new JFrame("Vi du Java swing");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 1));
        frame.setLocation(350, 300);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        headLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", 0);
        headLabel.setSize(350, 120);
        statusLabel.setSize(350, 100);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headLabel);
        frame.add(panel);
        frame.add(statusLabel);

        frame.setVisible(true);
    }

    private void showJScrollBarDemo(){
        headLabel.setText("Control: JScrollBar");
        final JScrollBar hozScrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
        final JScrollBar verticalScroll = new JScrollBar(JScrollBar.VERTICAL);

        hozScrollBar.setMaximum(100);
        hozScrollBar.setMinimum(1);
        verticalScroll.setMaximum(100);
        verticalScroll.setMinimum(1);

        hozScrollBar.addAdjustmentListener(new AdjustmentListener(){
            @Override

            public void adjustmentValueChanged(AdjustmentEvent e){
                statusLabel.setText("Horozontal: "
                +hozScrollBar.getValue() 
                +" ,Vertical: "
                + verticalScroll.getValue());
            }
        });

        verticalScroll.addAdjustmentListener(new AdjustmentListener(){
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e){
                statusLabel.setText("Horozontal: "
                +hozScrollBar.getValue() 
                +" ,Vertical: "
                + verticalScroll.getValue());
            }
        });

        panel.add(hozScrollBar);
        panel.add(verticalScroll);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}