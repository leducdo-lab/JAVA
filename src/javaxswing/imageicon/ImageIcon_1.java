package javaxswing.imageicon;

/*import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.*;
import java.awt.image.*;*/

/*public class ImageIcon_1{
    private JFrame frame;
    private JLabel headLabel, statusLabel;
    private JPanel panel;
    public ImageIcon_1(){
        showUI();
    }

    public static void main(String[] args) {
        ImageIcon_1 simple = new ImageIcon_1();
        simple.showImageIcon();
    }

    private void showUI(){
        frame = new JFrame("Vi du Java Swing");
        frame.setSize(400, 400);
        frame.setLocation(300, 300);
        frame.setLayout(new GridLayout(3,1));
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        headLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        headLabel.setSize(350, 120);
        statusLabel.setSize(350, 100);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headLabel);
        frame.add(panel);
        frame.add(statusLabel);

        frame.setVisible(true);
    }

    /*private static ImageIcon createImageIcon(String path, String descrip){
        java.net.URL imgURL = ImageIcon_1.class.getResource(path);
        if(imgURL != null){
            try {
                BufferedImage image = ImageIO.read(new File(path));
                return new ImageIcon(image.getScaledInstance(250, 100, image.SCALE_SMOOTH));
            } catch (IOException e) {
                System.out.println("Loi: "+e);
            }
        }else{
            System.err.println("Couldn't find file : "+path);
            return null;
        }
        return null;
    }

    private void showImageIcon(){
        headLabel.setText("Control in action: ImageIcon");
        //ImageIcon icon = createImageIcon("./anhDemo.png", "Java");
        

        JLabel comment = new JLabel(); //JLabel("", icon, JLabel.CENTER);
        comment.setSize(350, 120);
        // try{
        //     BufferedImage image = ImageIO.read(new File("/javaxswing/anhDemo.jpg"));
        //     ImageIcon icon = new ImageIcon(image.getScaledInstance(250, 100, image.SCALE_SMOOTH));
        //     comment.setIcon(icon);
        //     panel.add(comment);

        //     frame.setVisible(true);
        // }catch(IOException e){
        //     System.out.println("Loi: "+e);
        // }

        
    }
}*/