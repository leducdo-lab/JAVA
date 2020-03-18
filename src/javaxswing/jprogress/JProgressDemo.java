package javaxswing.jprogress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JProgressDemo{
    private JFrame frame;
    private JLabel headLabel, statusLabel;
    private JPanel panel;

    public JProgressDemo(){
        showUI();
    }

    public static void main(String[] args) {
        JProgressDemo simple = new JProgressDemo();
        simple.showProgressBar();
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

    private JProgressBar progressBar;
    private Task task;
    private JButton startButton;
    private JTextArea outpuArea;

    private void showProgressBar(){
        headLabel.setText("Control in action: JProgressBar");

        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        startButton = new JButton("Start");

        outpuArea = new JTextArea("", 5, 20);

        JScrollPane scrollPane = new JScrollPane(outpuArea);
        startButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                task = new Task();
                task.start();
            }
        });

        panel.add(startButton);
        panel.add(progressBar);
        panel.add(scrollPane);

        frame.setVisible(true);
    }

    private class Task extends Thread{
        public Task(){
            super();
        }
        public void run(){
            for(int i = 0; i <= 100; i+= 10){
                final int progress = i;
                SwingUtilities.invokeLater(new Runnable(){
                
                    @Override
                    public void run() {
                        progressBar.setValue(progress);
                        outpuArea.setText(outpuArea.getText()
                        + String.format("Completed %d%% of task.\n", progress));
                    }
                });
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}