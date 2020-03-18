package javaxswing.jmenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBarDemo extends JFrame{

    private static final long serialVersionUID = 1L;
    private JLabel head, status;
    private JPanel panel;

    public MenuBarDemo(){
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
    private void showMenu(){
        // tao mot menubar
        final JMenuBar bar = new JMenuBar();
        // tao cac menu
        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        final JMenu menuAbout = new JMenu("About");
        final JMenu menuLinks = new JMenu("Links");
        // tao item
        
    }
}