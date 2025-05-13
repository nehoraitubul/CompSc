package Semester2.OOP1.Lesson4.PhilosofProblem;

public class Main {

    public static void main(String[] args) {
        Fork fork1 = new Fork(1);
        Fork fork2 = new Fork(2);
        Philosof philosof1 = new Philosof("John Lock", fork1, fork2);
        Philosof philosof2 = new Philosof("Plato", fork2, fork1);
        new Thread(() -> {
            while (true) {
                System.out.println(philosof1);
                System.out.println(philosof2);
                Utils.sleep(1000);
            }
        }).start();
    }
}
