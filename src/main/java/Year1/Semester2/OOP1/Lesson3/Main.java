package Year1.Semester2.OOP1.Lesson3;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            blabla();
        }).start();

        new Thread(() -> {
            blabla();
        }).start();
    }


    public synchronized static void blabla(){

    }

}
