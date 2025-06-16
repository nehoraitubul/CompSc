package Year1.Semester1.Lesson9.Ex2;

public class HotelMain {
    public static String mostProfitableHotels(Hotel[] hotels){
        int maxIncome = 0;
        Hotel mostProfitableHotel = hotels[0];

        for (int i = 0; i < hotels.length; i++) {
            int currIncome = hotels[i].income();
            if (currIncome > maxIncome){
                mostProfitableHotel = hotels[i];
            }
        }
        return mostProfitableHotel.getName();
    }

    public static void main(String[] args) {
        Room[] hotel1Rooms = {
                new Room(101, 1, true),
                new Room(102, 2, true),
                new Room(103, 3, false),
                new Room(104, 2, true)
        };

        Room[] hotel2Rooms = {
                new Room(201, 1, true),
                new Room(202, 3, false),
                new Room(203, 2, true),
                new Room(204, 1, true)
        };

        Room[] hotel3Rooms = {
                new Room(301, 3, true),
                new Room(302, 2, false),
                new Room(303, 1, true),
                new Room(304, 2, true)
        };

        // Create Hotels
        Hotel hotel1 = new Hotel("Sunrise Inn", hotel1Rooms);
        Hotel hotel2 = new Hotel("Oceanview Hotel", hotel2Rooms);
        Hotel hotel3 = new Hotel("Mountain Lodge", hotel3Rooms);

        // Array of Hotels
        Hotel[] hotels = {hotel1, hotel2, hotel3};

        // Test mostProfitableHotels
        System.out.println("Most Profitable Hotel: " + mostProfitableHotels(hotels));
    }
}
