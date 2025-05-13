package Semester2.OOP1.Lesson2.LightSimolator;

import java.util.Random;

public class Car {
    private int speed;
    private int totalTimeToFinish;
    private double meterPassed;
    private boolean isMoving;

    public Car(){
        Random rnd = new Random();
        this.speed = rnd.nextInt(50,81);
    }

    public void drive(){
        try {
            meterPassed += this.speed;
            Thread.sleep(1000);

            totalTimeToFinish++;
            this.isMoving = true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public double getMeterPassed() {
        return meterPassed;
    }

    public String toString(){
        int currSpeed = this.speed;
        if (!isMoving){
            currSpeed = 0;
        }
        return "The speed of the car is:" + currSpeed + ", meters passed: " + this.meterPassed;
    }

    public void setIsMoving(boolean moving){
        this.isMoving = moving;
    }

}
