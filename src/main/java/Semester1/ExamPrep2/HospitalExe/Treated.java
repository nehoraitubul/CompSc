package Semester1.ExamPrep2.HospitalExe;

import java.util.Random;

public class Treated {
    private int idNumber;
    private boolean isUrgent;
    private int treatmentType;

    public Treated(int idNumber){
        Random random = new Random();
        this.idNumber = idNumber;
        this.isUrgent = random.nextBoolean();
        this.treatmentType = random.nextInt(1,4);
    }

    public int getTreatmentType() {
        return treatmentType;
    }

    public boolean getIsUrgent(){
        return isUrgent;
    }
}
