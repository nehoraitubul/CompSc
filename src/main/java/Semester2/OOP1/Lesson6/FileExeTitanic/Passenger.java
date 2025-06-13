package Semester2.OOP1.Lesson6.FileExeTitanic;

import java.util.List;

public class Passenger {
    private Integer passengerId;
    private Integer survived;
    private Integer pClass;
    private String name;
    private String sex;
    private Integer age;
    private Integer sibSp;
    private Integer parch;
    private String ticket;
    private Double fare;
    private String cabin;
    private String embarked;


    public Passenger(Integer survived, Integer passengerId, Integer pClass, String name, String sex, Integer age, Integer sibSp, Integer parch, String ticket, Double fare, String embarked, String cabin) {
        this.survived = survived;
        this.passengerId = passengerId;
        this.pClass = pClass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sibSp = sibSp;
        this.parch = parch;
        this.ticket = ticket;
        this.fare = fare;
        this.embarked = embarked;
        this.cabin = cabin;
    }

    public String getFormattedName(){
        String fullName = "";
        String[] words = this.name.split(" ", 3);
        fullName = words[0] + words[2];
        fullName.replace("\"", "");
        fullName.replace(",", " ");
        return fullName;
    }

    public String searchAsName(String name){
        if (this.name.split(",")[0].equals(name)){
            return this.getFormattedName();
        }
        return null;
    }


}
