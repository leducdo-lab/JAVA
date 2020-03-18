package javaxswing.jlist;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JList_1{
    private JFrame frame;
    private JLabel headLabel, statusLabel;
    private JPanel panel;

    public JList_1(){
        showUI();
    }

    private void showUI(){
        frame = new JFrame();
        frame.setTitle("Vi du JList");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3,1));

        headLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350,100);
        headLabel.setSize(300, 150);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headLabel);
        frame.add(panel);
        frame.add(statusLabel);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    private void showJList(){
        headLabel.setText("Chuong Trinh JList");
        statusLabel.setText("Day La statusLabel");

        final DefaultListModel deLiMo = new DefaultListModel();

        deLiMo.addElement("Apple");
        deLiMo.addElement("Grapes");
        deLiMo.addElement("Mango");
        deLiMo.addElement("Peer");

        final JList fruitList = new JList<>(deLiMo);
        fruitList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fruitList.setSelectedIndex(0);
        fruitList.setVisibleRowCount(13);

        final JScrollPane fruitSPane = new JScrollPane(fruitList);

        final DefaultListModel vegModel = new DefaultListModel();
        vegModel.addElement("Lady Finger");
        vegModel.addElement("Onion");
        vegModel.addElement("Potato");
        vegModel.addElement("Tomato");

        final JList vegList = new JList<>(vegModel);
        vegList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        vegList.setSelectedIndex(0);
        vegList.setVisibleRowCount(3);

        final JScrollPane vegSPane = new JScrollPane(vegList);

        final JButton button = new JButton("show");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                String data = "";
                if (fruitList.getSelectedIndex() != -1) {
                    data = "Fruits Selected: " + fruitList.getSelectedValue();
                    statusLabel.setText(data);
                }
                if (vegList.getSelectedIndex() != -1) {
                    data += "Vegetables selected: ";
                    for (final Object veg : vegList.getSelectedValues()) {
                        data += veg + " ";
                    }
                    statusLabel.setText(data);
                }
            }
        });

        panel.add(fruitSPane);
        panel.add(vegSPane);
        panel.add(button);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    public static void main(final String[] args) {
        final JList_1 simple = new JList_1();
        simple.showJList();
    }
}