package game.center;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class LuckyBox extends JFrame implements Common{
    private static final long serialVersionUID = 1L;

    public LuckyBox() {
        setTitle("My First Game");
        add(new MainBoard());
        setSize(Common.WIDTH, Common.HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                new LuckyBox().setVisible(true);
            }
        });
    }
}