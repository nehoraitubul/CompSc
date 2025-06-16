package Year1.Semester1.Lesson8.ExClock;

public class Main {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        clock1.seconds = 59;
        clock1.minutes = 59;
        clock1.hours = 6;

        Clock clock2 = new Clock();
        clock2.seconds = 59;
        clock2.minutes = 59;
        clock2.hours = 16;

        clock1.addSeconds(53543);
        clock1.print();
    }

}
