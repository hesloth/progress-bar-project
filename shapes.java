import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class shapes extends Canvas {

    int[] toDo = new int[4];

    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        Canvas canvas = new shapes();
        canvas.setSize(800, 600);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);    
    }

    public void paint(Graphics g) {
        g.drawRect(50, 80, 700, 50);

        int j = 140;
        for (int i = 0; i < toDo.length; i++) {
            g.drawRect(100, j + 70, 50, 50);
            j += 70;
        }
    }
}



