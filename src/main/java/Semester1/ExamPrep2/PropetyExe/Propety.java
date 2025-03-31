package Semester1.ExamPrep2.PropetyExe;

public abstract class Propety {
    private int size;
    private int year;
    private Seller seller;

    public Propety(int size, int year, Seller seller) {
        this.size = size;
        this.year = year;
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }

    public int getSize() {
        return size;
    }
}
