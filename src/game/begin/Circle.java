package game.begin;

public class Circle{
    private int x, y;
    private int radius;

    public Circle(int x, int y, int radius){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    public int getRadius(){
        return radius;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}