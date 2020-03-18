package game.begin;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")

public class MainTest extends JFrame{
    public MainTest(){
        super("Va Cham main");
        add(new CollisionDetection());
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainTest();
    }
}