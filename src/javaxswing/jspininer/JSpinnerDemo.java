package javaxswing.jspininer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;


public class JSpinnerDemo extends JFrame {

    private static final long serialVersionUID = 1L;

    JLabel head, status;
    JPanel panel;

    public JSpinnerDemo(){
        setTitle("Vi du Java Swing");
        setSize(400, 400);
        setLocation(400, 350);
        setLayout(new GridLayout(3, 1));
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        head = new JLabel("", JLabel.CENTER);
        status = new JLabel("", JLabel.CENTER);
        head.setBounds(5, 5, 350, 100);
        head.setBackground(Color.BLACK);
        status.setSize(350, 100);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        add(head);
        add(panel);
        add(status);

        setVisible(true);
    }

    private void showSpinnerDemo(){
        head.setText("Control in action: JSpinner");
        head.setForeground(Color.BLUE);

        SpinnerModel spimodel = new SpinnerNumberModel(10 // gia tri khoi tao
        , 0 // min
        , 100// max
        , 1 // step
        );

        JSpinner spinner = new JSpinner(spimodel);
        spinner.addChangeListener(new ChangeListener(){
        
            @Override
            public void stateChanged(ChangeEvent e) {
                status.setText("Value: "+((JSpinner)e.getSource()).getValue());
            }
        });

        panel.add(spinner);
        setVisible(true);
    }

    public static void main(String[] args) {
        JSpinnerDemo simple = new JSpinnerDemo();
        simple.showSpinnerDemo();
    }
}