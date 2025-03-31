package Semester1.ExamPrep2.CandidateExe;

public class Candidate {
    private String name;
    private boolean isMale;
    private int experienceYears;
    private String[] technologies;

    public Candidate(String name, boolean isMale, int experienceYears, String[] technologies) {
        this.name = name;
        this.isMale = isMale;
        this.experienceYears = experienceYears;
        this.technologies = technologies;
    }

    public boolean isJunior(){
        return this.experienceYears < 2;
    }

    public boolean isSenior(){
        return this.experienceYears > 5 && this.technologies.length > 10;
    }

    public boolean getIsMale(){
        return this.isMale;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public String[] getTechnologies() {
        return technologies;
    }
}
