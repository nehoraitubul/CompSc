package Semester1.Lesson9.Ex2;

public class Room {
    private int number;
    private int type;
    private boolean available;

    public Room(int number, int type, boolean ava){
        this.number = number;
        this.type = type;
        this.available = ava;
    }

    public int floor(){
        int number = this.number;
        for (int i = 0; i < 2; i++) {
            number /= 10;
        }
        return number;
    }

    public int calculatePrice(){
        int finalPrice = 2000;
        int floor = floor();
        if (floor > 10){
            finalPrice += (floor-10)*100;
        }
        int roomNum = this.number % 100;
        if (roomNum >= 0 && roomNum <= 5){
            finalPrice += 200;
        }
        if (this.type == 2){
            finalPrice *= 1.5;
        }
        if (this.type == 3){
            finalPrice *= 2.5;
        }
        return finalPrice;
    }

    public int getType(){
        return this.type;
    }

    public boolean getAvailable(){
        return this.available;
    }


}
