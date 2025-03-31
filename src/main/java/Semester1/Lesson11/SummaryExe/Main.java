package Semester1.Lesson11.SummaryExe;

public class Main {
    public static void main(String[] args) {
        Episode episode = new Episode("Nehorai tubul the sdfdsf", 45);
        System.out.println(episode.getShortName());

        TvShow tvShow = new TvShow("Sdf","dsfdd", 3);
        tvShow.addEpisode(episode);
        System.out.println(tvShow.getLongestEpisode());
    }
}
