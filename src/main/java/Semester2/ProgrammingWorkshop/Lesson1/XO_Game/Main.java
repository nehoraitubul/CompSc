package Semester2.ProgrammingWorkshop.Lesson1.XO_Game;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


        JFrame window = new JFrame("XO Game");
        window.setSize(screenSize.width / 3, screenSize.height / 2);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainScreen mainScreen = new MainScreen(0, 0, window.getWidth(), window.getHeight());

        window.add(mainScreen);


        window.setVisible(true);
    }
}
