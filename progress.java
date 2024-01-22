import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import java.util.ArrayList;

public class progress extends Canvas implements MouseListener {

    int[] toDo = new int[4];
    ArrayList<Label> boundings = new ArrayList<Label>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        Canvas canvas = new label();
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
            boundings.add(new Label());
            j += 70;
        }
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }


}



