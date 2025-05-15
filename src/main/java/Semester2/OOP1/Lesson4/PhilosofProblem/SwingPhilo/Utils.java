package Semester2.OOP1.Lesson4.PhilosofProblem.SwingPhilo;

public class Utils {

    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

