package javaxswing.imageicon;

import javax.swing.*;
import java.awt.*;

public class DrawImage extends Canvas{

    private static final long serialVersionUID = 7229295234306930493L;

    public void paint(Graphics gr){
        Toolkit tool = Toolkit.getDefaultToolkit();
        Image image = tool.getImage("/Users/leducdo/Desktop/自習/Java_new/src/javaxswing/imageicon/icon.jpeg");
        gr.drawImage(image, 10, 5, this);
    }

    public static void main(String[] args) {
        DrawImage image = new DrawImage();
        JFrame frame = new JFrame("Vi du Java Swing");
        frame.add(image);
        frame.setSize(300, 300);
        frame.setLocation(400, 350);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}