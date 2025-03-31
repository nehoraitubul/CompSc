package Semester1.Lesson11.SummaryExe;

public abstract class Show {
    private String name;
    private String type;
    private int[] ratings;
    private int minimumAge;

    public Show(String name, String type, int minimumAge){
        this.name = name;
        this.type = type;
        this.ratings = new int[0];
        this.minimumAge = minimumAge;
    }

    public boolean forKids(){
        return this.getMinimumAge() <= 3;
    }

    public void addScore(int score){
        if (score >= 1 & score <= 5){
            int[] currRatings = this.getRatings();
            int[] temp = new int[currRatings.length + 1];
            for (int i = 0; i < currRatings.length; i++) {
                temp[i] = currRatings[i];
            }
            temp[temp.length - 1] = score;
            this.setRatings(temp);
        }
    }

    public double calculateAverageScore(){
        double sum = 0;
        int[] temp = this.getRatings();
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        return (double) sum / temp.length;
    }

    public String getName(){
        return this.name;
    }

    public int getMinimumAge(){
        return this.minimumAge;
    }

    public int[] getRatings(){
        return this.ratings;
    }

    public void setRatings(int[] ratings){
        this.ratings = ratings;
    }
}
