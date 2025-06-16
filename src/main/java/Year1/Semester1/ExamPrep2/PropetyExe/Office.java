package Year1.Semester1.ExamPrep2.PropetyExe;

public class Office extends Propety{
    private boolean sittingRoom;
    private boolean secureEntrance;

    public Office(int size, int year, Seller seller, boolean sittingRoom, boolean secureEntrance) {
        super(size, year, seller);
        this.sittingRoom = sittingRoom;
        this.secureEntrance = secureEntrance;
    }
}
