package Year1.Semester1.ExamPrep2.SongExe;

public class Main {
    public static String longestPlaylist(Playlist[] playlists){
        if (playlists.length == 0){
            return "";
        }
        int longest = 0;
        String name = playlists[0].getName();
        for (int i = 0; i < playlists.length; i++) {
            int currLength = 0;
            Song[] currPlaylistSongs = playlists[i].getSongs();
            for (int j = 0; j < currPlaylistSongs.length; j++) {
                currLength += currPlaylistSongs[j].getLength();
            }
            if (currLength > longest){
                longest = currLength;
                name = playlists[i].getName();
            }
        }
        return name;
    }

    public static void main(String[] args) {

    }
}
