package Semester1.ExamPrep2.HospitalExe;

public abstract class CrewMember {
    private String firstName;
    private String lastName;
    private int yearsSeniority;

    public CrewMember(String firstName, String lastName, int yearsSeniority){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsSeniority = yearsSeniority;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getYearsSeniority() {
        return yearsSeniority;
    }
}
