package javaxswing.editmenu;

import javax.swing.*;
import java.awt.event.*;

public class Notepad extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    
    JMenuBar menubar;
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, selectAll, moi;
    JTextArea textarea;

    public Notepad(){
        setTitle("Vi du java swing");

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        moi = new JMenuItem("new");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        menubar = new JMenuBar();
        menubar.setBounds(5, 5, 460, 30);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        file.add(moi);
        edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
        menubar.add(file);menubar.add(edit);menubar.add(help);

        textarea = new JTextArea();
        textarea.setBounds(5, 40, 460, 460);

        add(menubar);
        add(textarea);

        setLayout(null);
        setSize(500, 500);
        setLocation(400, 350);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cut){
            textarea.cut();
        }
        if(e.getSource() == paste){
            textarea.paste();
        }
        if(e.getSource() == copy){
            textarea.copy();
        }
        if(e.getSource() == selectAll){
            textarea.selectAll();
        }
        if((e.getSource() == moi)){
            
        }
    }
    
    public static void main(String[] args) {
        new Notepad();
    }
}