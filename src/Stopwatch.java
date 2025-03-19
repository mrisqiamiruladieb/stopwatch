import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Stopwatch implements ActionListener {

    //declare
    JFrame frame = new JFrame();
    JButton startButton = new JButton("START");
    JButton resetButton = new JButton("RESET");
    JLabel timeLabel = new JLabel();
    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean started = false;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
    String hours_string = String.format("%02d", hours);
    
    //construct
    Stopwatch() {
        
        
        
    }
    
    //method
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
    void start() {
        
    }
    
    void stop() {
        
    }
    
    void reset() {
        
    }
    
}
