package Year1.Semester2.OOP1.Lesson4.PhilosofProblem.SwingPhilo;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private int width;
    private int height;
    private int x;
    private int y;

    public MainPanel(int width, int height, int x, int y){
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;

        setBounds(x, y, width, height);
        this.setLayout(null);
        this.setBackground(new Color(155, 157, 159));

        Waiter waiter = new Waiter();

        Fork fork1 = new Fork(1, 300, 250);
        Fork fork2 = new Fork(2, 300, 450);

        this.add(fork1);
        this.add(fork2);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(0xB88149));
        g.fillOval(width / 2 - 225, height / 2 - 225, 450, 450);
    }
}
