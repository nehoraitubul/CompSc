package Year1.Semester1.ExamPrep2.SongExe;

public class Song {
    private String name;
    private String performerName;
    private int length;

    public Song(String performerName, int length, String name){
        this.name = name;
        this.performerName = performerName;
        this.length = length;
    }

    public String toString(){
        return this.name + "/" + this.performerName + ": " + this.length;
    }

    public String getName() {
        return name;
    }

    public String getPerformerName() {
        return performerName;
    }

    public int getLength() {
        return length;
    }
}
