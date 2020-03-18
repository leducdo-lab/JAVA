package game.center;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainBoard extends JPanel implements ActionListener, Common{
    private static final long serialVersionUID = 1L;
    
    private ArrayList<Item> items;
    private ArrayList<Enemy> enemies;
    private Box box;
    private Timer timer;
    private boolean inGame;
    private int point;

    public MainBoard(){
        initBoard();
    }

    public void initBoard(){
        inGame = true;
        point = 0;
        addMouseMotionListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.lightGray);
        setDoubleBuffered(true);
        box = new Box(INIT_BOX_X, INIT_BOX_Y);
        enemies = new ArrayList<Enemy>();
        items = new ArrayList<Item>();
        initEnemy();
        initItem();
        inGame = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    private void initEnemy(){
        int initX = (int)(Math.random() * (Common.WIDTH - 50));
        int initY = (int)(Math.random() * (Common.HEIGHT - 50));
        Enemy enemy = new Enemy(initX, initY);
        enemies.add(enemy);
    }

    private void initItem(){
        int initX = (int)(Math.random() * (Common.WIDTH - 50));
        int initY = (int)(Math.random() * (Common.HEIGHT - 50));
        Item item = new Item(initX, initY);
        items.add(item);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(inGame){
            drawObject(g);
        }else{
            drawGameOver(g);
        }
    }

    private void drawObject(Graphics g){
        // Draw Box
        g.drawImage(box.getImage(), box.getX(), box.getY(), this);
        // Draw Enemies
        for(Enemy enemy : enemies){
            g.drawImage(enemy.getImage(), enemy.getX(), enemy.getY(), this);
        }
        // draw Item
        for(Item item : items){
            g.drawImage(item.getImage(), item.getX(), item.getY(), this);
        }

        // Draw Point
        Font font = new Font("Arial", Font.BOLD, 12);
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString("Your Point: "+point ,5, 15);
    }

    private void drawGameOver(Graphics g){
        Font font = new Font("Helvetica", Font.BOLD, 20);
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString("Game Over!", 350 , Common.HEIGHT/ 2);
        g.drawString("Score: "+point, 370, Common.HEIGHT / 2 +30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inGame();
        // Update Object
        updateBox();
        updateItem();
        updateEnemy();
        // check Collision
        checkCollision();
        // Repaint
        repaint();
    }

    private void inGame(){
        if(!inGame){
            timer.stop();
        }
    }
    private void updateBox(){
        box.move();
    }

    private void checkCollision(){
        Rectangle rectBox = box.getBound();
        for(Enemy enemy : enemies){
            Rectangle rectEnemy = enemy.getBound();
            if(rectBox.intersects(rectEnemy)){
                inGame = false;
            }
        }
        for(Item item : items){
            Rectangle rectItem = item.getBound();
            if(rectBox.intersects(rectItem)){
                point++;
                item.visible = false;
                updateItem();
                // initItem();
                // initEnemy();
            }
        }
    }

    private void updateEnemy(){
        for(int i = 0; i < enemies.size(); i++){
            Enemy enemy = enemies.get(i);
            if(enemy.isVisible()){
                enemy.move();
            }else{
                enemies.remove(i);
            }
        }
    }
    private void updateItem(){
        for(int i = 0; i < items.size(); i++){
            Item item = items.get(i);
            if(!item.isVisible()){
                items.remove(i);
                initItem();
                initEnemy();
            }
        }
    }

    private class TAdapter extends MouseMotionAdapter{
        @Override
        public void mouseMoved(MouseEvent e){
            box.mouseMoved(e);
        }
    }
}