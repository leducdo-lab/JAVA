package game.center;

public class Item extends Sprite{

    public Item(int x, int y) {
        super(x, y);
        initItem();
    }

    public void initItem(){
        loadImage("/Users/leducdo/Desktop/自習/Java_new/src/image/tim.png");
        getImageDimention();
    }

}