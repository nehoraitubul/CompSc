package Semester1.Lesson11.SummaryExe;

public class Episode {
    private String name;
    private int episodeLength;

    public Episode(String name ,int episodeLength){
        this.name = name;
        this.episodeLength = episodeLength;
    }

    public String toString(){
        return name + " " + episodeLength + " minutes.";
    }

    public boolean isLong(){
        return this.episodeLength > 30;
    }

    public String getShortName(){
        String temp = this.name;
        if (temp.length() > 13){
            temp = temp.substring(0, 10) + "...";
        }
        return temp;
    }

    public int getEpisodeLength(){
        return this.episodeLength;
    }
}
