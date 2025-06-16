package Year1.Semester1.Lesson10.Ex1;

public class LimitedBank extends BankAccount{
    private int limit;

    public LimitedBank(String firstName, String lastName, int balance, int limit){
        super(firstName, lastName, balance);
        this.limit = limit;
    }

    @Override
    public boolean withdraw(int sum) {
        if (this.limit >= sum){
            return super.withdraw(sum);
        }
        return false;
    }
}
