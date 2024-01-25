import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class App extends JFrame implements MouseListener {

    int huh = 5;
    ArrayList<JLabel> boxes = new ArrayList<>();

    App() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(null);

        checkBoxes();
        progressBar();

        for (JLabel box : boxes) {
            this.add(box);
        }
        
        this.setVisible(true);
    }

    public void progressBar() {
        JLabel progress = new JLabel();
        progress.setBounds(100, 50, 600, 50);
        progress.setOpaque(true);
        progress.setBackground(Color.red);
        boxes.add(progress);
    }
 
    public void checkBoxes() {
        int distance = 120;
        for (int i = 0; i < huh; i++) {
            JLabel label = new JLabel();
            label.setBounds(150, distance, 50, 50);
            label.setOpaque(true);
            label.setBackground(Color.red);
            label.addMouseListener(this);
            boxes.add(label);
            distance += 70;

        }
    }

    public static void main(String[] args) {
        new App();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}