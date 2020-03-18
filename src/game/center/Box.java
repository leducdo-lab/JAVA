package game.center;

import java.awt.event.*;

public class Box extends Sprite{
    private int dx;
    private int dy;

    public Box(int x, int y){
        super(x, y);
        initBox();
    }

    public void initBox(){
        loadImage("/Users/leducdo/Desktop/自習/Java_new/src/image/gautruc.png");
        getImageDimention();
    }
    public void move(){
        x = dx;
        y = dy;
    }
    public void mouseMoved(MouseEvent e){
        dx = e.getX();
        dy = e.getY();
    }
}