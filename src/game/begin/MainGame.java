package game.begin;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")

public class MainGame extends JPanel implements ActionListener{

    private Timer timer;
    private final int DELAY = 10;
    private Box box;

    public MainGame(){
        setFocusable(true);
        setBackground(Color.WHITE);
        box = new Box();
        MyAdapter myadap = new MyAdapter(box);
        addKeyListener(myadap);
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(box.getImage(), box.getX(), box.getY(), this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        box.move();
        repaint();
    }

}