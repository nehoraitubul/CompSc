package Semester1.Lesson10.Ex1;

public class Transaction {
    private int before;
    private int after;
    private int type;

    public Transaction(int before, int after, int type){
        this.before = before;
        this.after = after;
        this.type = type;
    }

    public String toString(){
        String type = "";
        if (this.type == 1){
            type = "Withdraw";
        }
        else if (this.type == 2){
            type = "Deposit";
        } else type = "Commission";

        return "Transaction type: " + type + ", amount before: " + this.before + ", amount after: " + this.after;
    }


}