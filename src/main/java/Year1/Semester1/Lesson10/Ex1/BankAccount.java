package Year1.Semester1.Lesson10.Ex1;

public class BankAccount {
    private String ownerFirstName;
    private String ownerLastName;
    private int balance;
    private Transaction[] history;

    public BankAccount (String ownerFirstName, String ownerLastName, int balance){
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.balance = balance;
        this.history = new Transaction[0];
    }

    public String getOwnerFullName(){
        return this.ownerFirstName + " " + this.ownerLastName;
    }

    public String toString(){
        String allTransactions = "";
        for (int i = 0; i < this.history.length; i++) {
            allTransactions += i + ". " + this.history[i].toString() + ".\n";
        }
        return getOwnerFullName() + ", balance: " + this.balance + "." + "\n" + allTransactions;
    }

    public void deposit(int sum){
        Transaction[] temp = new Transaction[this.history.length+1];
        for (int i = 0; i < this.history.length; i++) {
            temp[i] = this.history[i];
        }
        temp[this.history.length] = new Transaction(this.balance, this.balance + sum, 2);
        this.balance += sum;
        this.history = temp;
    }

    public boolean withdraw(int sum){
        if (this.balance - sum >= 0){
            Transaction[] temp = new Transaction[this.history.length+1];
            for (int i = 0; i < this.history.length; i++) {
                temp[i] = this.history[i];
            }
            temp[this.history.length] = new Transaction(this.balance, this.balance - sum, 1);
            this.balance -= sum;
            this.history = temp;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }

    public Transaction[] getHistory(){
        return this.history;
    }

    protected void setBalance(int num){
        this.balance = num;
    }

    protected void setHistory(Transaction[] newHistory){
        this.history = newHistory;
    }
}
