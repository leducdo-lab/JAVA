package game.begin;

import java.awt.event.*;

public class MyAdapter extends KeyAdapter{
    private Box box;
    
    public MyAdapter(){
        super();
    }

    public MyAdapter(Box box){
        this.box = box;
    }

    @Override
    public void keyPressed(KeyEvent e){
        box.keyPressed(e);
    }
    @Override
    public void keyReleased(KeyEvent e){
        box.keyReleased(e);
    }

}