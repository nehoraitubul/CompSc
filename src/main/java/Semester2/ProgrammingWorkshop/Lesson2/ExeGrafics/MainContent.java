package Semester2.ProgrammingWorkshop.Lesson2.ExeGrafics;

import javax.swing.*;
import java.awt.*;

public class MainContent extends JPanel {
    private Player player1;

    public MainContent(int x, int y, int width, int height){
        this.setBounds(x,y,width,height);
        this.setBackground(new Color(177, 164, 118));

        this.player1 = new Player(100,100);
        this.moveRight();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.player1.paint(g);
    }


    public void moveRight(){
        new Thread(() -> {
            while (true){
                this.player1.moveRight();
                try {
                    Thread.sleep(100);
                    repaint();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
