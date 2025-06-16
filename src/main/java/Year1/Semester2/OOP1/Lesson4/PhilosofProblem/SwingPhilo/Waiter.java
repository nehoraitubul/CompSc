package Year1.Semester2.OOP1.Lesson4.PhilosofProblem.SwingPhilo;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private final List<Philosof> allowedList = new ArrayList<>();
    private final int MAX_EATING = 4;

    public synchronized boolean requestPermission(Philosof philosof){
        if (allowedList.size() < MAX_EATING){
            allowedList.add(philosof);
            return true;
        }
        return false;
    }

    public synchronized void doneEating(Philosof philosof){
        allowedList.remove(philosof);
    }

}
