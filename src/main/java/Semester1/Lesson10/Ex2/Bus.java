package Semester1.Lesson10.Ex2;

public class Bus extends Vehicle{

    private int routeNumber;

    public Bus(String color, int speed, int year, int routeNumber){
        super(color, speed, year);
        this.routeNumber = routeNumber;
    }

    @Override
    public void goToBase() {
        System.out.println("Bud back to base.");
    }
}
