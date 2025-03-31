package Semester1.ExamPrep2.HospitalExe;

public class SpecialistDoctor extends CrewMember{
    private String ExpertiseType;
    private int avgTreatsInDay;

    public SpecialistDoctor(String firstName, String lastName, int yearsSeniority, int avgTreatsInDay, String expertiseType){
        super(firstName, lastName, yearsSeniority);
        this.avgTreatsInDay = avgTreatsInDay;
        this.ExpertiseType = expertiseType;
    }
}
