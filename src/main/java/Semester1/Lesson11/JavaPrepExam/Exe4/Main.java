package Semester1.Lesson11.JavaPrepExam.Exe4;

public class Main {
    public static String longestPlaylist(Playlist[] playlists){
        int longest = 0;
        String longestPlaylistName = playlists[0].getSongs()[0].getName();
        for (int i = 0; i < playlists.length; i++) {
            int currLength = 0;
            Song[] currSongs = playlists[i].getSongs();
            for (int j = 0; j < currSongs.length; j++) {
                currLength += currSongs[i].getLength();
            }
            if (currLength > longest){
                longest = currLength;
                longestPlaylistName = currSongs[i].getName();
            }
        }
        return longestPlaylistName;
    }

    public static void main(String[] args) {
        Song songs1 = new Song("Nehorai", 500, "Tubul");
        Song songs2 = new Song("df", 400, "df");

    }
}
