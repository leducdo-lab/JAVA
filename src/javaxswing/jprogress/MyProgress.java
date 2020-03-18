package javaxswing.jprogress;

import javax.swing.*;

public class MyProgress extends JFrame{
    
    private static final long serialVersionUID = 1L;
    int i = 0, num = 0;
    JProgressBar jb;

    public MyProgress(){
        jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 200, 30);
        jb.setValue(0);
        jb.setStringPainted(true);

        setTitle("Vi du Java Swing");
        add(jb);
        setSize(400, 400);
        setLocation(400, 300);
        setLayout(null);
        setDefaultCloseOperation(3);
    }

    public void iterate(){
        while(i <= 2000){
            jb.setValue(i);
            i += 20;
            try {
                Thread.sleep(150);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

    public static void main(String[] args) {
        MyProgress simple = new MyProgress();
        simple.setVisible(true);
        simple.iterate();
    }
}