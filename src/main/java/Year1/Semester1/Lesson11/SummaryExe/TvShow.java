package Year1.Semester1.Lesson11.SummaryExe;

public class TvShow extends Show{
    private Episode[] episodes;

    public TvShow(String name, String type, int minimumAge){
        super(name, type, minimumAge);
        this.episodes = new Episode[0];
    }

    public String toString(){
        return getName() + " (" + this.episodes.length + " episodes).";
    }

    public void addEpisode(Episode toAdd){
        Episode[] temp = new Episode[this.episodes.length+1];
        for (int i = 0; i < this.episodes.length; i++) {
            temp[i] = this.episodes[i];
        }
        temp[temp.length - 1] = toAdd;
        this.episodes = temp;
    }

    public boolean isLong(){
        int num = 0;
        for (int i = 0; i < this.episodes.length; i++) {
            if (this.episodes[i].isLong()){
                num ++;
            }
        }
        if (this.episodes.length / 2 < num){
            return true;
        }
        return false;
    }

    public int calculateLength(){
        int sumTime = 0;
        for (int i = 0; i < this.episodes.length; i++) {
            sumTime =+ this.episodes[i].getEpisodeLength();
        }
        return sumTime;
    }

    public Episode getLongestEpisode(){
        if (this.episodes.length == 0){
            return null;
        }
        Episode longest = this.episodes[0];
        for (int i = 0; i < this.episodes.length; i++) {
            if (this.episodes[i].getEpisodeLength() > longest.getEpisodeLength()){
                longest = this.episodes[i];
            }
        }
        return longest;
    }

    public boolean forKids(){
        return super.forKids();
    }

    @Override
    public void addScore(int score) {
        super.addScore(score);
    }

    @Override
    public double calculateAverageScore() {
        return super.calculateAverageScore();
    }
}
