package Semester1.Lesson11.JavaPrepExam.Exe4;

public class Playlist {
    private String name;
    private Song[] songs;

    public boolean exists(String name, String performerName){
        for (int i = 0; i < this.songs.length; i++) {
            if (this.songs[i].getName() == name && this.songs[i].getPerformerName() == performerName){
                return true;
            }
        }
        return false;
    }

    public Song[] getSongs(){
        return this.songs;
    }
}
