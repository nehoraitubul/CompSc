package Semester1.Lesson11.JavaPrepExam.Exe4;

public class Song {
    private String name;
    private String performerName;
    private int length;

    public Song(String performerName, int length, String name){
        this.performerName = performerName;
        this.length = length;
        this.name = name;
    }

    public String toString(){
        return this.name + "/" + this.performerName + ": " + this.length;
    }

    public String getName(){
        return this.name;
    }

    public String getPerformerName(){
        return this.performerName;
    }

    public int getLength(){
        return this.length;
    }
}
