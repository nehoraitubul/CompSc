package Semester1.Lesson9.Ex2;

public class Hotel {
    private String name;
    private Room[] rooms;

    public Hotel(String name, Room[] rooms){
        this.name = name;
        this.rooms = rooms;
    }

    public Room[] availableByBudget(int type, int budget){
        Room[] availableRooms = new Room[0];
        for (int i = 0; i < this.rooms.length; i++) {
            if (this.rooms[i].calculatePrice() <= budget && this.rooms[i].getType() == type){
                Room[] temp = new Room[availableRooms.length + 1];
                for (int j = 0; j < availableRooms.length; j++) {
                    temp[j] = availableRooms[j];
                }
                temp[temp.length - 1] = this.rooms[i];
                availableRooms = temp;
            }
        }
        return availableRooms;
    }

    public int income(){
        int counter = 0;
        for (int i = 0; i < this.rooms.length; i++) {
            if (rooms[i].getAvailable()){
                counter += rooms[i].calculatePrice();
            }
        }
        return counter;
    }

    public String getName(){
        return this.name;
    }
}
