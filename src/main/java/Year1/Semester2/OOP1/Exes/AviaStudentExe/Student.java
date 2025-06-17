package Year1.Semester2.OOP1.Exes.AviaStudentExe;

public class Student {
    private String name;
    private int id;
    private Subject subject;
    private int score;

    public Student(){

    }

    public boolean idEquals(int id){
        return this.id == id;
    }

    public Student compareTo(Student other){
        if (this.score > other.score){
            return this;
        }
        return other;
    }
}
