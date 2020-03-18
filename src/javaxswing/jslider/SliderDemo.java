package javaxswing.jslider;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo extends JFrame{
    private static final long serialVersionUID = 1L;

    private JLabel head, status;
    private JPanel panel;

    public SliderDemo(){
        setTitle("Vi du java swing");
        setSize(400, 400);
        setLocation(400, 350);
        setLayout(new GridLayout(3, 1));
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        head = new JLabel("", JLabel.CENTER);
        status = new JLabel("", JLabel.CENTER);
        head.setSize(350, 120);
        status.setSize(360, 100);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        add(head);
        add(panel);
        add(status);

        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public static void main(String[] args) {
        SliderDemo simple = new SliderDemo();
        simple.showSlider();
    }

    private void showSlider(){
        head.setText("Control is: JSlider");
        status.setText("Control is: Status");

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener(){
        
            @Override
            public void stateChanged(ChangeEvent e) {
                status.setText("Value: "+((JSlider)e.getSource()).getValue());
            }
        });
        panel.add(slider);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
}