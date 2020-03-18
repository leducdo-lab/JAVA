package javaxswing.jslider;

import javax.swing.*;

public class JSlider_Simple extends JFrame{
    private static final long serialVersionUID = 1L;

    public JSlider_Simple(){
        this.setTitle("Vi du java swing");
        // setSize(400, 400);
        // setLayout(null);
        // setLocation(400, 300);
        // setDefaultCloseOperation(3);
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }
    public JSlider_Simple(String title){
        setTitle(title);
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }
    public static void main(String[] args) {
        JSlider_Simple simple = new JSlider_Simple("Vi du Slider");
        simple.pack();
        simple.setLocation(400, 350);
        simple.setVisible(true);
    }
}   