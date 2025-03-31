package Semester1.ExamPrep2.CandidateExe;

public class AvailablePositions {
    private String description;
    private int count;
    private Candidate[] candidates;

    public boolean inviteForInterviews(){
        if (candidates.length > 20){
            int seniors = 0;
            int male = 0;
            int female = 0;
            for (int i = 0; i < candidates.length; i++) {
                if (candidates[i].getIsMale()){
                    male++;
                } else {
                    female++;
                }

               if (candidates[i].isSenior()){
                   seniors++;
               }
            }
            if (male - female < 5 && female - male < 5 && seniors >= 4){
                return true;
            }
        }
        return false;
    }

    public Candidate[] createSpecialInterviewsList(){
        int male = 0;
        int female = 0;
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getIsMale()){
                male++;
            } else {
                female++;
            }
        }
        if (male < female){
            female = male;
        } else {
            male = female;
        }
        Candidate[] answer = new Candidate[male + female];
        int index = 0;
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getIsMale()){
                if (male != 0){
                    answer[index] = candidates[i];
                    male--;
                } else {
                    if (female != 0){
                        answer[index] = candidates[i];
                        female--;
                    }
                }
            }
        }
        return answer;
    }
}
