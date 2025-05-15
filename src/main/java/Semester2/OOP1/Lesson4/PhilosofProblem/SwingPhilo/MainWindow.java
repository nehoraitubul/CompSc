package Semester2.OOP1.Lesson4.PhilosofProblem.SwingPhilo;

import javax.swing.*;

public class MainWindow {
    public static final int WINDOW_WIDTH = 900;
    public static final int WINDOW_HEIGHT = 700;

    public static void main(String[] args) {
        JFrame window = new JFrame("Stupid Philo");
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setLayout(null);

        MainPanel mainPanel = new MainPanel(WINDOW_WIDTH, WINDOW_HEIGHT, 0, 0);
        window.add(mainPanel);

        window.setVisible(true);

        window.repaint();
        window.revalidate();
    }
}
