package game.begin;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class CollisionDetection extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L;
    
    private MyCharacter myChar;
    private Enemy enemy;
    private Circle circle;
    private final int DELAY = 10;
    private Timer timer;

    public CollisionDetection(){
        myChar = new MyCharacter(50, 50, 50, 50);
        enemy = new Enemy(100, 100, 50, 50);
        circle = new Circle(200, 200, 50);
        addMouseMotionListener(new MyAdapter());
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(myChar.getX(), myChar.getY(), myChar.getWidth(), myChar.getHeight());
        g.drawRect(enemy.getX(), enemy.getY() , enemy.getWidth(), enemy.getHeight());
        g.drawOval(circle.getX() - circle.getRadius(), circle.getY() - circle.getRadius(), circle.getRadius()*2, circle.getRadius()*2);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        checkCollision();
        myChar.move();
        repaint();
        if(checkCollision(myChar.getBound(), circle)){
            System.out.println("Hinh chu nhat vaf tron");
        }
    }

    public void checkCollision(){
        Rectangle myCharBound = myChar.getBound();
        Rectangle enemyBound = enemy.getBound();
        if(myCharBound.intersects(enemyBound)){
            System.out.println("Va Cham");
        }
    }

    public boolean checkCollision(Rectangle rect, Circle cir){
        int rectLeft = (int) rect.getX();
        int rectRight = (int) (rect.getX() + rect.getWidth());
        int rectTop = (int) rect.getY();
        int rectBottom = (int) (rect.getY() + rect.getHeight());

        int xC = cir.getX();
        int yC = cir.getY();
        int xA = xC;
        int yA = yC;

        if(xC > rectRight){
            xA = rectRight;
        }else if(xC < rectLeft){
            xA = rectLeft;
        }

        if(yC < rectTop){
            yA = rectTop;
        }else if(yC > rectBottom){
            yA = rectBottom;
        }

        int dx = xC - xA;
        int dy = yC - yA;

        return (dx*dx + dy*dy) <= cir.getRadius() * cir.getRadius();
    }

    private class MyAdapter extends MouseMotionAdapter{
        @Override
        public void mouseMoved(MouseEvent e){
            myChar.mouseMoved(e);
        }
    }
}