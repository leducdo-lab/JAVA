package game.begin;

import java.awt.event.*;

public class MyCharacter extends Sprite{

    private int mx;
    private int my;

    public MyCharacter(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void move(){
        x = mx;
        y = my;
    }

    public void mouseMoved(MouseEvent e){
        mx = e.getX();
        my = e.getY();
    }

}