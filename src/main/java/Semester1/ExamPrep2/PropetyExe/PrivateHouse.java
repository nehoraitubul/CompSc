package Semester1.ExamPrep2.PropetyExe;

public class PrivateHouse extends Propety {
    private boolean withRehitim;

    public PrivateHouse(int size, int year, Seller seller, boolean withRehitim) {
        super(size, year, seller);
        this.withRehitim = withRehitim;
    }
}
