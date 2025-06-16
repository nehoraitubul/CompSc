package Year1.Semester1.Lesson11.SummaryExe;

public class LiveShow extends Show{
    private int startingHour;
    private int startingMinute;
    private int estimateEndingHour;
    private int EstimateEndingMinute;
    private int endingHour;
    private int endingMinute;

    public LiveShow(String name, String type, int minimumAge, int startingHour, int endingTime){
        super(name, type, minimumAge);
        this.startingHour = startingHour;
        this.startingMinute = endingTime;
    }
}