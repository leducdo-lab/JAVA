package javaxswing.jwindow;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JWindowDemo extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    
    private JLabel head, status;
    MessageWindow window;
    private JPanel panel;

    public JWindowDemo(){
        setTitle("Vi du Java Swing");
        setSize(400, 400);
        setLocation(400, 350);
        setLayout(new GridLayout(3, 1));
        addWindowFocusListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        head = new JLabel("", JLabel.CENTER);
        status = new JLabel("", JLabel.CENTER);
        status.setSize(350, 100);

        panel = new JPanel(new FlowLayout());
        
        add(head);
        add(panel);
        add(status);

        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public static void main(String[] args) {
        JWindowDemo simple = new JWindowDemo();
        simple.showWindowDemo();
    }

    private void showWindowDemo(){
        head.setText("Container in action: JWindow");
        window = new MessageWindow(this, "Chao mung ban");
        JButton button = new JButton("Open Window");
        button.setBounds(100, 150, 100, 50);
        button.addActionListener(this);

        panel.add(button);

        setDefaultCloseOperation(3);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        window.setVisible(true);
        status.setText("Mot Window duoc hien thi toi nguoi dung.");
    }

    class MessageWindow extends JWindow{
        private static final long serialVersionUID = 1L;
        
        private String message;
        public MessageWindow(JFrame jf, String message){
            super(jf);
            this.message = message;
            setSize(300, 300);
            setLocationRelativeTo(jf);
        }

        public void paint(Graphics gp){
            super.paint(gp);
            gp.drawRect(0, 0, getSize().width - 1, getSize().height -1);
            gp.drawString(message, 50, 150);
        }
    }
}