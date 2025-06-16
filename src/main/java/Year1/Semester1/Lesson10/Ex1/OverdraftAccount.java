package Year1.Semester1.Lesson10.Ex1;

public class OverdraftAccount extends BankAccount {
    private int accountFrameWork;

    public OverdraftAccount(String firstName, String lastName, int balance, int accountFrameWork){
        super(firstName, lastName, balance);
        this.accountFrameWork = accountFrameWork;
    }

    @Override
    public boolean withdraw(int sum) {
        if (((this.getBalance() - sum) * -1) > this.accountFrameWork){
            return false;
        }
        Transaction[] history = this.getHistory();
        Transaction[] temp = new Transaction[history.length+1];
        for (int i = 0; i < history.length; i++) {
            temp[i] = history[i];
        }
        int balance = this.getBalance();
        temp[history.length] = new Transaction(balance, balance - sum, 1);
        this.setBalance(this.getBalance()-sum);
        this.setHistory(temp);
        return true;
    }
}
