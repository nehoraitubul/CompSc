package Year1.Semester1.Lesson10.Ex2;

public class Ship extends Vehicle {
    private int crewNum;

    public Ship(String color, int speed, int year, int crewNum){
        super(color, speed, year);
        this.crewNum = crewNum;
    }

    @Override
    public void goToBase() {
        System.out.println("Ship back to base.");
    }
}
