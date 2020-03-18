package javaxswing.digitalclock;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DigitanWatch extends JFrame implements Runnable{
    private static final long serialVersionUID = 1L;
    
    int hours = 0, minutes = 0, seconds = 0;
    Thread thr = null;
    String timeString = "";
    JButton button;

    public DigitanWatch(){
        setTitle("Vi du Java Swing");
        setSize(400, 350);
        setLayout(null);
        setDefaultCloseOperation(3);
        
        thr = new Thread(this);
        thr.start();

        button = new JButton();
        button.setBounds(100, 100, 100, 50);

        add(button);
        setVisible(true);
    }

    @Override
    public void run() {
        try {
            while (true ){
                Calendar cal = Calendar.getInstance();
                hours = cal.get(Calendar.HOUR_OF_DAY);
                if(hours > 12) hours = -12;
                minutes = cal.get( Calendar.MINUTE );
                seconds = cal.get( Calendar.SECOND );

                SimpleDateFormat form = new SimpleDateFormat("hh:mm:ss");
                Date date = cal.getTime();
                timeString = form.format(date);
                printTime();
                Thread.sleep(10);
            }
        } catch (Exception e) {
        }
    }
    public void printTime(){
        button.setText(timeString);
    }

    public static void main(String[] args) {
        new DigitanWatch();
    }
}