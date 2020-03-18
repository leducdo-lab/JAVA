package javaxswing.jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameDemo extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    
    private JLabel head, status;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public FrameDemo(){
        setTitle("Vi du Java Swing");
        setSize(400, 400);
        setLocation(400, 350);
        setLayout(new GridLayout(3, 1));
        addWindowFocusListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        head = new JLabel("", JLabel.CENTER);
        status = new JLabel("", JLabel.CENTER);
        status.setSize(350, 100);

        panel = new JPanel(new FlowLayout());
        label = new JLabel("Chao mung ban den voi Apple", JLabel.CENTER);

        add(head);
        add(panel);
        add(status);

        setDefaultCloseOperation(3);
        setVisible(true);
    }

    private void showFrame(){
        head.setText("Control in action: JFrame");

        frame = new JFrame();
        frame.setSize(350, 300);
        frame.setLayout(new FlowLayout());
        frame.setLocation(400, 350);
        frame.add(label);
        frame.addWindowFocusListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        JButton button = new JButton("Open frame");
        button.addActionListener(this);
        panel.add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        status.setText("Mot Frame duoc hien thi toi nguoi dung");
        frame.setVisible(true);
        setVisible(false);
        frame.setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        FrameDemo simple = new FrameDemo();
        simple.showFrame();
    }
}
