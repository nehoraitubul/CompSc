package Semester2.ProgrammingWorkshop.Lesson2.ExeGrafics;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {

    public Menu(int x, int y, int width, int height){
        this.setBounds(x,y,width,height);
        this.setBackground(new Color(43, 46, 48));
        GridLayout gridLayout = new GridLayout(2,2);
        this.setLayout(gridLayout);

        JButton button1 = new JButton("Button 1");
        button1.setBackground(new Color(43, 46, 48));
        button1.setForeground(Color.white);
        this.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.setBackground(new Color(43, 46, 48));
        button2.setForeground(Color.white);
        this.add(button2);

        JButton button3 = new JButton("Button 3");
        button3.setBackground(new Color(43, 46, 48));
        button3.setForeground(Color.white);
        this.add(button3);

        JButton button4 = new JButton("Button 4");
        button4.setBackground(new Color(43, 46, 48));
        button4.setForeground(Color.white);
        this.add(button4);
    }
}
