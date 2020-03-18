package game.begin;

import javax.swing.JFrame;

public class Test extends JFrame{

    private static final long serialVersionUID = 1L;

    public Test(){
        super("Game Begin");
        add(new MainGame());
        setSize(480, 360);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new Test();
    }
}