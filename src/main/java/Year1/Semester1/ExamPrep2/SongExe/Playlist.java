package Year1.Semester1.ExamPrep2.SongExe;

public class Playlist {
    private String name;
    private Song[] songs;

    public boolean exist(String name, String performerName){
        if (this.songs.length != 0){
            for (int i = 0; i < this.songs.length; i++) {
                if (this.songs[i].getName().equals(name) && this.songs[i].getPerformerName().equals(performerName)){
                    return true;
                }
            }
        }
        return false;
    }

    public Song[] getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
}
