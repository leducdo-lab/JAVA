package javaxswing.imageicon;

import static java.awt.Image.SCALE_SMOOTH;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageIcon_2 extends JFrame {
    private static final long serialVersionUID = 1L;

    public ImageIcon_2() throws IOException {
        this.setTitle("ImageIcon");
        this.setSize(400, 400);
        this.setLocation(350, 350);
        setResizable(false);
        this.setDefaultCloseOperation(3);

        JLabel label = new JLabel();
        label.setSize(350, 300);
        add(label);
        try {
            BufferedImage image = ImageIO.read(new File("/Users/leducdo/Desktop/自習/JAVA_NEW/src/javaxswing/anhDemo.jpg"));
            int x = label.getSize().width;
            int y = label.getSize().height;
            int ix = image.getWidth();
            int iy = image.getHeight();
            int dx = 0; 
            int dy = 0;
            if(x / y > ix / iy){
                dy = y;
                dx = x;
            }else{
                dy = iy;
                dx = ix;
            }
            ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, SCALE_SMOOTH));
            label.setIcon(icon);
        } catch (IOException e) {
            System.out.println(e);
        }
        
        setVisible(true);
    }

    public static void main(String[] args) throws IOException{
        new ImageIcon_2();
    }
}