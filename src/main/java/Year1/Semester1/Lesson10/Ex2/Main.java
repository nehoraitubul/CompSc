package Year1.Semester1.Lesson10.Ex2;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Bus("Green", 0, 2022, 301);
        Vehicle v2 = new Truck("White", 0, 2021, "Cargo");
        Vehicle v3 = new Ship("Grey", 0, 2020, 57);
        Vehicle[] vehicles = {v1, v2, v3};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].goToBase();
        }


    }
}
