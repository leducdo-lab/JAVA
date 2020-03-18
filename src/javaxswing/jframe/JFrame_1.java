package javaxswing.jframe;

import javax.swing.*;

public class JFrame_1{

    public static void main(String[] args) {
        JFrame jf = new JFrame("Hello World :):)");
        JPanel jp = new JPanel();
        jf.add(jp);
        JButton jb = new JButton("Hello");
        jf.add(jb);
        
        jf.setSize(300, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}