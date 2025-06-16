package Year1.Semester1.Lesson8.Ex2;

public class Member {
    String firstName;
    String lastName;
    Team team;
    String description;
    int yearInCompany;
    int yearsInTech;

    public boolean isSenior(){
        if (this.yearsInTech >= 5 || this.yearInCompany >= 3){
            return true;
        }
        return false;
    }
}
