import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class progress extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        Canvas canvas = new progress();
        canvas.setSize(800, 600);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);    
    }
}



