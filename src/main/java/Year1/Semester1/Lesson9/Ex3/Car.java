package Year1.Semester1.Lesson9.Ex3;

public class Car {
    private int fuel;
    private int fuelCapacity;
    private float litersPerKm;

    public Car(int fuel, int fuelCapacity, float litersPerKm){
        this.fuel = fuel;
        this.fuelCapacity = fuelCapacity;
        this.litersPerKm = litersPerKm;
    }

    public float percent(){
        return  (float) fuel/fuelCapacity * 100;
    }

    public boolean urgentGasStation(){
        if (percent() < 10 || this.fuel < 20){
            return true;
        }
        return false;
    }

    public boolean drive(int km){
        int neededFuel = (int) (this.litersPerKm * km);
        if (this.fuel < neededFuel){
            return false;
        }
        this.fuel -= neededFuel;
        return true;
    }

    public int getFuel(){
        return this.fuel;
    }

    public float getLitersPerKm(){
        return litersPerKm;
    }
}
