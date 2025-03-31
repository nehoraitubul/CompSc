package Semester1.Lesson10.Ex2;

public abstract class Vehicle {
    private String color;
    private int speed;
    private int year;

    public Vehicle(String color, int speed, int year){
        this.color = color;
        this.speed = speed;
        this.year = year;
    }

    public  void accelerate(int num){
        this.speed += num;
    }

    public  void slowDown(int num){
        this.speed -= num;
    }

    public abstract void goToBase();
}
