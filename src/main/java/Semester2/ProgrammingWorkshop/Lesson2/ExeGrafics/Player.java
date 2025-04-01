package Semester2.ProgrammingWorkshop.Lesson2.ExeGrafics;

import java.awt.*;

public class Player {
    private int x;
    private int y;

    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveRight(){
        this.x++;
    }

    public void moveLeft(){
        this.x--;
    }

    public void moveUp(){
        this.y--;
    }

    public void moveDown(){
        this.y++;
    }

    public int getX() {
        return this.x;
    }

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(this.x,this.y,100,100);
    }
}
