package Semester1.ExamPrep2.HospitalExe;

public class FamilyDoctor extends CrewMember {
    private int avgTreatsInDay;

    public FamilyDoctor(String firstName, String lastName, int yearsSeniority, int avgTreatsInDay){
        super(firstName, lastName, yearsSeniority);
        this.avgTreatsInDay = avgTreatsInDay;
    }
}
