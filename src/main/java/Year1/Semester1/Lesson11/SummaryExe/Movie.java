package Year1.Semester1.Lesson11.SummaryExe;

public class Movie extends Show{
    private int movieLength;

    public Movie(String name, String type, int minimumAge, int movieLength){
        super(name, type, minimumAge);
        this.movieLength = movieLength;
    }

    public boolean isValidLength(){
        return this.movieLength >= 80 && this.movieLength <= 180;
    }

    @Override
    public boolean forKids() {
        return super.forKids();
    }

    public String toString(){
        String forKids = "is";
        if (forKids()) forKids = "isnt";
        return this.getName() + " ," + this.movieLength + forKids + " for kids.";
    }

    @Override
    public void addScore(int score) {
        super.addScore(score);
    }

    @Override
    public double calculateAverageScore() {
        if (!this.isValidLength()){
            return -1;
        }
        return super.calculateAverageScore();
    }

    public boolean isLong(){
        if (forKids()){
            return this.movieLength > 100;
        }
        return this.movieLength > 150;
    }
}
