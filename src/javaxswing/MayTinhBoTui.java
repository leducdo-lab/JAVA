package javaxswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.UIManager;
import javax.swing.UIManager.*;

public class MayTinhBoTui extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    private double b;
    private JPanel panelcalculator, mainPanel, panelOUT;
    private JTextArea textarea;
    private String btnName[] = {"√","C", "Del" , "+",
                                "7", "8", "9", "/",
                                "4", "5", "6", "*",
                                "1", "2", "3", "-",
                                "neg", "0", ".", "="};

    private JButton btn;
    private double a = 0;
    private int casenumber = 0;
    private double result = 0;

    public MayTinhBoTui(){
        try {
            for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Loi: "+e);
        }
        setSize(240, 350);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setResizable(false);
        add(createmainFrame());
    }

    /* Hàm tạo panel chính */
    public JPanel createmainFrame(){
        setTitle("Máy tính bỏ túi");

        mainPanel = new JPanel(new BorderLayout(4,5));
        mainPanel.add(createButtonCaculator(), BorderLayout.CENTER);
        mainPanel.add(createTextarea(), BorderLayout.NORTH);
        mainPanel.setBackground(Color.white);

        return mainPanel;
    }

    /* khởi tạo jbutton */
    public JButton button(String btnName){
        btn = new JButton(btnName);
        btn.setBackground(Color.black);
        btn.setForeground(Color.red);
        btn.addActionListener(this);

        return btn;
    }

    /* Add jbutton vao panel */
    public JPanel createButtonCaculator(){
        panelcalculator = new JPanel(new GridLayout(5, 4));
        for(int i = 0; i < btnName.length; i++){
            panelcalculator.add(button(btnName[i]));
        }
        panelcalculator.setBackground(Color.white);

        return panelcalculator;
    }

    /* create jtextare */
    private JPanel createTextarea(){
        panelOUT = new JPanel(new GridLayout(1,1));
        textarea = new JTextArea(3,3);
        textarea.setBackground(Color.WHITE);
        textarea.setForeground(Color.DARK_GRAY);
        panelOUT.add(textarea);
        textarea.setEditable(false);

        return panelOUT;
    }

    /*  xử lý sự kiện */
    public void actionPerformed(ActionEvent e){
        String button = e.getActionCommand();
        if(button == "1"){
            textarea.append("1");
        }
        if(button == "2")
            textarea.append("2");
        if(button == "3"){
            textarea.append("3");
        }
        if(button == "4"){
            textarea.append("4");
        }
        if(button == "5"){
            textarea.append("5");
        }
        if(button == "6"){
            textarea.append("6");
        }
        if(button == "7"){
            textarea.append("7");
        }
        if(button == "8"){
            textarea.append("8");
        }
        if(button == "9"){
            textarea.append("9");
        }
        if(button == "0"){
            textarea.append("0");
        }
        if(button == "."){
            textarea.append(".");
        }
        if(button == "neg"){
            textarea.append("-");
        }

        if(button == "+"){
            a = Double.parseDouble(textarea.getText());
            casenumber = 1;
            textarea.setText("");
        }
        if(button == "-"){
            a = Double.parseDouble(textarea.getText());
            casenumber = 2;
            textarea.setText("");
        }
        if(button == "*"){
            a = Double.parseDouble(textarea.getText());
            casenumber = 3;
            textarea.setText("");
        }
        if(button == "/"){
            a = Double.parseDouble(textarea.getText());
            casenumber = 4;
            textarea.setText("");
        }
        if(button == "√"){
            String s = textarea.getText();
            if(s.length() >= 2){
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) != '√'){
                        double c = Double.parseDouble(textarea.getText());
                        a = Math.sqrt(c);
                        casenumber = 5;
                        textarea.setText("");
                    }
                }
            }else{
                textarea.setText("√");
            }
        }
        if(button == "="){
            b = Double.parseDouble(textarea.getText());
            switch (casenumber) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = (double)a / b;
                case 5:
                    result = a;
                default:
                    result = 0;
                    break;
            }
            textarea.setText(new Double(result).toString());
        }
        if(button == "Del"){
            String s = textarea.getText();
            textarea.setText("");
            for(int i = 0; i < s.length()-1; i++){
                textarea.setText(textarea.getText() + s.charAt(i));
            }
        }
        if(button == "C"){
            textarea.setText("");
        }
    }

    public static void main(String[] args) {
        new MayTinhBoTui().setVisible(true);
    }
}