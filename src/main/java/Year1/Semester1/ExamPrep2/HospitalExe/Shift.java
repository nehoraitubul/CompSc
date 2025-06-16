package Year1.Semester1.ExamPrep2.HospitalExe;

public class Shift {
    private CrewMember[] crewMembers;
    private Treated[] treateds;

    public Shift(){
        this.crewMembers = new CrewMember[0];
        this.treateds = new Treated[0];
    }

    public String mostYearsCrewMemberSeniority(){
        if (this.crewMembers.length == 0){
            return " ";
        }
        String name = this.crewMembers[0].getFullName();
        int years = 0;
        for (int i = 0; i < this.crewMembers.length; i++) {
            if (this.crewMembers[i].getYearsSeniority() > years){
                years = this.crewMembers[i].getYearsSeniority();
                name = this.crewMembers[i].getFullName();
            }
        }
        return name;
    }

    public Treated[] onlyUrgent(int type){
        Treated[] urgents = new Treated[0];
        if (treateds.length == 0){
            return urgents;
        }
        for (int i = 0; i < treateds.length; i++) {
            if (treateds[i].getIsUrgent() && treateds[i].getTreatmentType() == type){
                Treated[] temp = new Treated[urgents.length + 1];
                for (int j = 0; j < urgents.length; j++) {
                    temp[j] = urgents[i];
                }
                temp[temp.length - 1] = treateds[i];
                urgents = temp;
            }
        }
        return urgents;
    }
}
