package Year1.Semester2.OOP1.Lesson4.PhilosofProblem.SwingPhilo;

import java.util.Random;

public class Philosof {
    public static final int THINKING = 1;
    public static final int WAITING_FOR_FORK_1 = 2;
    public static final int WAITING_FOR_FORK_2 = 3;
    public static final int EATING = 4;
    private Waiter waiter;

    private String name;
    private int status;
    private int eatingCount;

    private Fork fork1;
    private Fork fork2;

    public Philosof(String name, Fork fork1, Fork fork2, Waiter waiter){
        this.name = name;
        this.status = THINKING;
        this.eatingCount = 0;
        this.fork1 = fork1;
        this.fork2 = fork2;
        this.waiter = waiter;

        this.start();
    }

    public String toString(){
        String statusText = "";
        switch (this.status){
            case THINKING -> statusText = "Thinking";
            case WAITING_FOR_FORK_1 -> statusText = "Waiting for fork 1";
            case WAITING_FOR_FORK_2 -> statusText = "Waiting for fork 1";
            case EATING -> statusText = "Eating";
        }
        return "Philosof " + this.name + " is currently " + statusText + " (total times he ate: " +
                this.eatingCount + ").";
    }



    private void start () {
        new Thread(() -> {
            Random random = new Random();
            while (true) {
                Utils.sleep(random.nextInt(5000));
                while (!waiter.requestPermission(this)){
                    Utils.sleep(100);
                }
                this.status = WAITING_FOR_FORK_1;
                while (this.fork1.getHeldBy() != null) {
                    Utils.sleep(100);
                }
                this.fork1.setHeldBy(this);
                Utils.sleep(random.nextInt(1000));
                this.status = WAITING_FOR_FORK_2;
                while (this.fork2.getHeldBy() != null) {
                    Utils.sleep(100);
                }
                this.fork2.setHeldBy(this);
                this.status = EATING;
                Utils.sleep(random.nextInt(1000));
                this.fork1.setHeldBy(null);
                this.fork2.setHeldBy(null);
                waiter.doneEating(this);
                this.eatingCount++;
                this.status = THINKING;

            }
        }).start();
    }

    public String getName(){
        return this.name;
    }

    public int getEatingCount(){
        return this.eatingCount;
    }
}
