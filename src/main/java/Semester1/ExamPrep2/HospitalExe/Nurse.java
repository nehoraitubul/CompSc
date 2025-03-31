package Semester1.ExamPrep2.HospitalExe;

public class Nurse extends CrewMember {
    private boolean isMainNurse;

    public Nurse(String firstName, String lastName, int yearsSeniority, boolean isMainNurse){
        super(firstName, lastName, yearsSeniority);
        this.isMainNurse = isMainNurse;
    }
}
