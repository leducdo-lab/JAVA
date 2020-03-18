package game.begin;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Box {
    private int dx, dy; // hệ số delta
    private int x, y; // là tọa độ của nhân vật
    private Image image;
    private final int SPEED = 10;

    public Box(){
        ImageIcon ii = (ImageIcon) load("/Users/leducdo/Desktop/自習/Java_new/src/image/gautruc.png", 100, 100);
        image = ii.getImage();
        x = 50; y = 50;
    }

    public void move(){
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
                dy = -SPEED;
                break;
            case KeyEvent.VK_DOWN:
                dy = SPEED;
                break;
            case KeyEvent.VK_LEFT:
                dx = -SPEED;
                break;
            case KeyEvent.VK_RIGHT:
                dx = SPEED;
                break;
            default:
                break;
        }
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN:
                dy = 0;
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT:
                dx = 0;
                break;
            default:
                break;
        }
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Image getImage(){
        return image;
    }

    public Icon load(String linkimage, int k, int m){
        try {
            BufferedImage image = ImageIO.read(new File(linkimage));
            int x = k;
            int y = m;
            int ix = image.getWidth();
            int iy = image.getHeight();
            int dx = 0, dy = 0;

            if(x/y > ix / iy){
                dy = y;
                dx = dy * ix / iy;
            }else{
                dx = x;
                dy = dx * iy / ix;
            }
            return new ImageIcon(image.getScaledInstance(dx, dy, image.SCALE_SMOOTH));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}