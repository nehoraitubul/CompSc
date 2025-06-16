package Year1.Semester2.ProgrammingWorkshop.Lesson2.ExeGrafics;

import javax.swing.*;

public class ExeGrafics {
    public static final int WINDOW_WIDTH = 900;
    public static final int WINDOW_HEIGHT = 700;

    public static void main(String[] args) {
        JFrame window = new JFrame("my first GUI");
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setLayout(null);

        Menu menu = new Menu(0,0, WINDOW_WIDTH/4, WINDOW_HEIGHT);

        MainContent mainContent = new MainContent(WINDOW_WIDTH/4,0, WINDOW_WIDTH - WINDOW_WIDTH/4, WINDOW_HEIGHT);

        window.add(mainContent);
        window.add(menu);
        window.setVisible(true);
    }
}
