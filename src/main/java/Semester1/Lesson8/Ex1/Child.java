package Semester1.Lesson8.Ex1;

public class Child {
    String name;
    boolean boy;
    int year;
    int month;

    public boolean isOlder(Child child){
        if (this.year == child.year && this.month > child.month){
            return false;
        }
        return this.year < child.year;
    }
}
