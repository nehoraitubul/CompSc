package Year1.Semester1.Lesson10.Ex1;

public class Ex1Main {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount("Nehorai", "Tubul", 0);
//        bankAccount.deposit(100);
//        bankAccount.deposit(75);
//        System.out.println(bankAccount);
//        bankAccount.withdraw(160);
//        System.out.println(bankAccount);
//
//        LimitedBank limitedBank = new LimitedBank("Yair", "Siboni", 0, 100);
//        limitedBank.deposit(500);
//        System.out.println(limitedBank);
//        limitedBank.withdraw(200);
//        System.out.println(limitedBank);
//        limitedBank.withdraw(50);
//        System.out.println(limitedBank);
//
//        OverdraftAccount overdraftAccount = new OverdraftAccount("Amit", "Suissa", 0, 600);
//        overdraftAccount.deposit(100);
//        System.out.println(overdraftAccount);
//        overdraftAccount.deposit(150);
//        System.out.println(overdraftAccount);
//        overdraftAccount.withdraw(400);
//        System.out.println(overdraftAccount);
//        overdraftAccount.withdraw(400);
//        System.out.println(overdraftAccount);
//        overdraftAccount.withdraw(400);
//        System.out.println(overdraftAccount);

        BankSimulation bankSimulation = new BankSimulation(2);
        bankSimulation.simulate();
        System.out.println(bankSimulation);
    }
}
