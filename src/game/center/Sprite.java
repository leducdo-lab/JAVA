package game.center;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class Sprite{
    protected int x, y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;

    public Sprite(int x, int y){
        this.x = x;
        this.y = y;
        visible = true;
    }

    public void loadImage(String fileImage){
        ImageIcon ii = (ImageIcon) load(fileImage, 50, 50);
        image = ii.getImage();
    }

    public void getImageDimention(){
        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    public boolean isVisible(){
        return visible;
    }

    public void setVisible(boolean visible){
        this.visible = visible;
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
    public Rectangle getBound(){
        return new Rectangle(x, y, width, height);
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