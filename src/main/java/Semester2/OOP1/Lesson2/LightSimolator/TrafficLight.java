package Semester2.OOP1.Lesson2.LightSimolator;

import java.util.Random;

public class TrafficLight {
    private int currentColor;
    private int greenTime;
    private int yellowTime;
    private int redTime;
    private int distanceFromStart;

    public TrafficLight(int currentColor, int distanceFromStart) {
        Random rnd = new Random();
        this.currentColor = currentColor;
        this.greenTime = rnd.nextInt(5000,8001);
        this.yellowTime = 1000;
        this.redTime = rnd.nextInt(4000,7001);
        this.distanceFromStart = distanceFromStart;
        lightRotate();
    }

    public String toString() {
        String color = "Green";
        if (this.currentColor == 1) {
            color = "Yellow";
        }
        if (this.currentColor == 2) {
            color = "Red";
        }
        return "The current color is " + color;
    }

    public void lightRotate() {
        int[] timings = {this.greenTime, this.yellowTime, this.redTime};
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(timings[this.currentColor]);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (this.currentColor == 2){
                    this.currentColor = 0;
                } else {
                    this.currentColor++;
                }
            }
        }).start();
    }

    public int getCurrentColor(){
        return this.currentColor;
    }

    public boolean isGreenLight(){
        return this.currentColor == 1;
    }

    public int getDistanceFromStart(){
        return this.distanceFromStart;
    }

}
