package Year1.Semester1.Lesson9.Ex3;

public class CarMain {
    public static int maxKmToAllCars(Car[] cars){
        int maxKm = 0;
        for (int i = 0; i < cars.length; i++) {
            maxKm += (int) (cars[i].getFuel() / cars[i].getLitersPerKm());
        }
        return maxKm;
    }

    public static void main(String[] args) {
        Car car1 = new Car(20, 30, 1f);
        Car car2 = new Car(10, 30, 0.5f);
        Car car3 = new Car(10, 30, 0.5f);
        Car car4 = new Car(10, 30, 0.5f);
        Car[] cars = {car1, car2, car3, car4};

        System.out.println(maxKmToAllCars(cars));

        System.out.println(car1.percent());
        System.out.println(car1.urgentGasStation());
        System.out.println(car1.drive(22));
    }
}
