package javaxswing.jfilechooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFileChoosed{
    private JFrame frame;
    private JLabel headLabel, statusLabel;
    private JPanel panel;

    public JFileChoosed(){
        showUI();
    }

    public static void main(String[] args) {
        JFileChoosed simple = new JFileChoosed();
        simple.showFileChooser();
    }

    private void showUI(){
        frame = new JFrame("Vi du Java Swing");
        frame.setSize(400, 400);
        frame.setLocation(350, 300);
        frame.setLayout(new GridLayout(3, 1));
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        headLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        headLabel.setSize(350, 120);
        statusLabel.setSize(350, 100);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headLabel);
        frame.add(panel);
        frame.add(statusLabel);
        frame.setVisible(true);
    }

    private void showFileChooser(){
        headLabel.setText("Control in action: JFileChooser");

        final JFileChooser fileDialog = new JFileChooser();
        JButton button = new JButton("Open File");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int returnVal = fileDialog.showOpenDialog(frame);
                if(returnVal == JFileChooser.APPROVE_OPTION){
                    java.io.File file = fileDialog.getSelectedFile();
                    statusLabel.setText("File Selected: "+file.getName());
                }
                else{
                    statusLabel.setText("Open command cancelled by user.");
                }
            }
        });
        panel.add(button);
        frame.setVisible(true);
    }
}