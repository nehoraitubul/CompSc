package Year1.Semester2.ProgrammingWorkshop.Lesson2.ExeGrafics;

import javax.swing.*;
import java.awt.*;

public class MainContent extends JPanel {
    private Player player1;
    private int width;
    private boolean movingRight = true;

    public MainContent(int x, int y, int width, int height){
        this.setBounds(x,y,width,height);
        this.width = width;
        this.setBackground(new Color(177, 164, 118));

        this.player1 = new Player(100,100);
        this.startMoving();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.player1.paint(g);
    }


    public void startMoving(){
        new Thread(() -> {
            while (true){

                if (player1.getX() + 100 >= this.width) {
                    movingRight = false;
                } else if (player1.getX() <= 0) {
                    movingRight = true;
                }

                if (movingRight) {
                    player1.moveRight();
                } else {
                    player1.moveLeft();
                }

                try {
                    repaint();
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
