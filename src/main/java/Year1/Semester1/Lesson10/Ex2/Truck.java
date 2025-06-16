package Year1.Semester1.Lesson10.Ex2;

public class Truck extends Vehicle{
    private String trailerType;

    public Truck(String color, int speed, int year, String trailerType){
        super(color, speed, year);
        this.trailerType = trailerType;
    }

    @Override
    public void goToBase() {
        System.out.println("Truck back to base.");
    }
}
