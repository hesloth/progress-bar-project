import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class App extends JFrame implements MouseListener {

    int numBoxes = 5;
    ArrayList<JLabel> boxes = new ArrayList<>();
    ArrayList<JLabel> progressSegments = new ArrayList<>();
    JLabel progressBar;
    int greenBoxCount = 0;

    App() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(null);

        checkBoxes();
        createProgressBar();

        for (JLabel box : boxes) {
            this.add(box);
        }
        
        this.setVisible(true);
    }

    public void createProgressBar() {
        JLabel progress = new JLabel();
        progress.setBounds(100, 50, 600, 50);
        progress.setOpaque(true);
        progress.setBackground(Color.red);
        boxes.add(progress);

        int totalWidth = 600;
        int segmentWidth = totalWidth / numBoxes;
        for (int i = 0; i < numBoxes; i++) {
            JLabel segment = new JLabel();
            segment.setBounds(100 + i * segmentWidth, 50, segmentWidth, 50);
            segment.setOpaque(true);
            segment.setBackground(new Color(0, 0, 0, 0));
            this.add(segment);
            progressSegments.add(segment);      
        }
    }
 
    public void checkBoxes() {
        int distance = 120;
        for (int i = 0; i < numBoxes; i++) {
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
        Object source = e.getSource();
        if (source instanceof JLabel && boxes.contains(source)) {
            JLabel clickedLabel = (JLabel) source;
            int index = boxes.indexOf(clickedLabel);
            if (clickedLabel.getBackground().equals(Color.red)) {
                clickedLabel.setBackground(Color.green);
                progressSegments.get(index).setBackground(Color.green);
            } else {
                clickedLabel.setBackground(Color.red);
                progressSegments.get(index).setBackground(new Color(0, 0, 0, 0));
            }
        }
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