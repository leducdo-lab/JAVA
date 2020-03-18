package javaxswing.editmenu;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class OpenMenu extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;

    JMenuBar menubar;
    JMenu file;
    JMenuItem open;
    JTextArea textarea;

    public OpenMenu(){
        open = new JMenuItem("Open file");
        open.addActionListener(this);
        
        file = new JMenu("file");
        file.add(open);

        menubar = new JMenuBar();
        menubar.setBounds(0, 0, 800, 20);
        menubar.add(file);

        textarea = new JTextArea(800, 800);
        textarea.setBounds(0, 30, 800, 800);

        add(menubar);
        add(textarea);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == open){
            OpenFile();
        }
    }

    private void OpenFile(){
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showOpenDialog(this);

        if(i == JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            String filePath = file.getPath();
            displayContent(filePath);
        }
    }

    private void displayContent(String path){
        try{
            BufferedReader bfr = new BufferedReader(new FileReader(path));
            String str1 = "", str2 = "";

            while((str1 = bfr.readLine()) != null){
                str2 += str1 +"\n";
            }
            textarea.setText(str2);
            bfr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OpenMenu menu = new OpenMenu();
        menu.setSize(800, 850);
        menu.setLayout(null);
        menu.setDefaultCloseOperation(3);
        menu.setLocation(200, 100);
        menu.setVisible(true);
    }
}