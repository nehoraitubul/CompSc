package Year1.Semester1.Lesson10.Ex1;

import java.util.Random;

public class BankSimulation {
    BankAccount[] bankAccounts;
    LimitedBank[] limitedBanks;
    OverdraftAccount[] overdraftAccounts;

    public BankSimulation(int count){
        Random rnd = new Random();
        this.bankAccounts = new BankAccount[count];
        this.limitedBanks = new LimitedBank[count];
        this.overdraftAccounts = new OverdraftAccount[count];

        for (int i = 0; i < count; i++) {
            this.bankAccounts[i] = new BankAccount("a", "a", rnd.nextInt(5000, 10000));
        }

        for (int i = 0; i < count; i++) {
            this.limitedBanks[i] = new LimitedBank("a", "a", rnd.nextInt(5000, 10000), 1500);
        }

        for (int i = 0; i < count; i++) {
            this.overdraftAccounts[i] = new OverdraftAccount("a", "a", rnd.nextInt(5000, 10000), 2000);
        }

    }

    public void simulate(){
        Random rnd = new Random();
        int repeat = rnd.nextInt(100,1000);
        boolean success = true;
        for (int i = 0; i < repeat; i++) {

            for (int j = 0; j < this.bankAccounts.length; j++) {
                this.bankAccounts[j].deposit(rnd.nextInt(100,1000));
                this.bankAccounts[j].deposit(rnd.nextInt(100,1000));
                int requestedWithdraw = rnd.nextInt(1000,2000);
                success = this.bankAccounts[j].withdraw(requestedWithdraw);
                if (!success){
                    System.out.println(bankAccounts[j]);
                    System.out.println("The account type is regular account " + "The failed withdraw transaction is: " + requestedWithdraw);
                    break;
                }
            }
            if (!success) break;

            for (int j = 0; j < this.limitedBanks.length; j++) {
                this.limitedBanks[j].deposit(rnd.nextInt(100,1000));
                this.limitedBanks[j].deposit(rnd.nextInt(100,1000));
                int requestedWithdraw = rnd.nextInt(1000,2000);
                success = this.limitedBanks[j].withdraw(requestedWithdraw);
                if (!success){
                    System.out.println(limitedBanks[j]);
                    System.out.println("The account type is limited account " + "The failed withdraw transaction is: " + requestedWithdraw);
                    break;
                }
            }
            if (!success) break;

            for (int j = 0; j < this.overdraftAccounts.length; j++) {
                this.overdraftAccounts[j].deposit(rnd.nextInt(100,1000));
                this.overdraftAccounts[j].deposit(rnd.nextInt(100,1000));
                int requestedWithdraw = rnd.nextInt(1000,2000);
                success = this.overdraftAccounts[j].withdraw(requestedWithdraw);
                if (!success){
                    System.out.println(overdraftAccounts[j]);
                    System.out.println("The account type is overdraft account " + "The failed withdraw transaction is: " + requestedWithdraw);
                    break;
                }
            }
            if (!success) break;
        }
    }

    public String toString(){
        int sumOfMoney = 0;
        BankAccount lowest = this.bankAccounts[0];
        int lowestAmount =  this.bankAccounts[0].getBalance();
        BankAccount highest = this.bankAccounts[0];
        int highestAmount =  this.bankAccounts[0].getBalance();


        for (int i = 0; i < this.bankAccounts.length; i++) {
            sumOfMoney += this.bankAccounts[i].getBalance();
            if (this.bankAccounts[i].getBalance() > highestAmount){
                highest = bankAccounts[i];
                highestAmount = bankAccounts[i].getBalance();
            }
            if (this.bankAccounts[i].getBalance() < lowestAmount){
                lowest = bankAccounts[i];
                lowestAmount = bankAccounts[i].getBalance();
            }
        }

        for (int i = 0; i < this.limitedBanks.length; i++) {
            sumOfMoney += this.limitedBanks[i].getBalance();
            if (this.limitedBanks[i].getBalance() > highestAmount){
                highest = limitedBanks[i];
                highestAmount = limitedBanks[i].getBalance();
            }
            if (this.limitedBanks[i].getBalance() < lowestAmount){
                lowest = limitedBanks[i];
                lowestAmount = limitedBanks[i].getBalance();
            }
        }

        for (int i = 0; i < this.overdraftAccounts.length; i++) {
            sumOfMoney += this.overdraftAccounts[i].getBalance();
            if (this.overdraftAccounts[i].getBalance() > highestAmount){
                highest = overdraftAccounts[i];
                highestAmount = overdraftAccounts[i].getBalance();
            }
            if (this.overdraftAccounts[i].getBalance() < lowestAmount){
                lowest = overdraftAccounts[i];
                lowestAmount = overdraftAccounts[i].getBalance();
            }
        }

        return "Number of account in bank: " + this.bankAccounts.length * 3 + ".\n" +
                "The amount of money in all accounts is: " + sumOfMoney + "." +".\n" +
                "The account with the lowest amount is: " + lowestAmount + ".\n" +
                "The account with the highest amount is: " + highestAmount + ".\n";
    }
}
