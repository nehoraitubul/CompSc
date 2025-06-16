package Year1.Semester1.ExamPrep2.PropetyExe;

public class Warehouse extends Propety{
    private boolean heavyWeight;
    private int vents;

    public Warehouse(int year, Seller seller, int size, boolean heavyWeight, int vents) {
        super(size, year, seller);
        this.heavyWeight = heavyWeight;
        this.vents = vents;
    }
}
