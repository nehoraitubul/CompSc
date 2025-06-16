package Year1.Semester2.OOP1.Lesson4.PhilosofProblem.NoSwing;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        Fork fork1 = new Fork(1);
        Fork fork2 = new Fork(2);
        Fork fork3 = new Fork(3);
        Fork fork4 = new Fork(4);
        Fork fork5 = new Fork(5);
        Philosof philosof1 = new Philosof("John Lock",  fork1, fork2, waiter);
        Philosof philosof2 = new Philosof("Plato",      fork2, fork3, waiter);
        Philosof philosof3 = new Philosof("Aristotle",  fork3, fork4, waiter);
        Philosof philosof4 = new Philosof("Descartes",  fork4, fork5, waiter);
        Philosof philosof5 = new Philosof("Kant",       fork5, fork1, waiter);
        new Thread(() -> {
            while (true) {
                System.out.println("philosof1 ate: " + philosof1.getEatingCount() + "\n" +
                                "philosof2 ate: " + philosof2.getEatingCount() + "\n" +
                                "philosof3 ate: " + philosof3.getEatingCount() + "\n" +
                                "philosof4 ate: " + philosof4.getEatingCount() + "\n" +
                                "philosof5 ate: " + philosof5.getEatingCount() + "\n");
                Utils.sleep(5000);
            }
        }).start();
    }
}
