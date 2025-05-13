package Semester2.OOP1.Lesson4.PhilosofProblem;

public class Fork {
    private int number;
    private Philosof heldBy;

    public Fork(int number){
        this.number = number;
        this.heldBy = null;
    }

    public String toString(){
        if (this.heldBy == null){
            return "This fork is not held by anyone!";
        }
        return "Fork " + this.number + " is currently held by " + this.heldBy.getName();
    }

    public void setHeldBy(Philosof philosof){
        this.heldBy = philosof;
    }

    public int getNumber(){
        return this.number;
    }

    public Philosof getHeldBy(){
        return this.heldBy;
    }
}
