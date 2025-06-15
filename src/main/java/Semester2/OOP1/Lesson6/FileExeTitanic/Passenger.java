package Semester2.OOP1.Lesson6.FileExeTitanic;

import java.util.List;
import java.util.stream.Stream;

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

    public String toString() {
        return "Name: " + name + ", ID: " + passengerId +
                ", Age: " + age + ", Sex: " + sex +
                ", Class: " + pClass + ", Fare: " + fare;
    }

    public Object getFieldValue(Types type) {
        switch (type) {
            case PASSENGER_ID: return passengerId;
            case SURVIVED: return survived;
            case P_CLASS: return pClass;
            case NAME: return name;
            case SEX: return sex;
            case AGE: return age;
            case SIB_SP: return sibSp;
            case PARCH: return parch;
            case TICKET: return ticket;
            case FARE: return fare;
            case CABIN: return cabin;
            case EMBARKED: return embarked;
            default: return null;
        }
    }

    public String getFormattedName(){
        String fullName = "";
        String[] words = this.name.split(" ", 3);
        fullName = words[0] + words[2];
        fullName.replace("\"", "");
        fullName.replace(",", " ");
        return fullName;
    }


    public <T> boolean search(Types type, T value) {
        Object fieldValue = getFieldValue(type);
        if (fieldValue == null || value == null) {
            return false;
        }

        if (fieldValue instanceof String && value instanceof String) {
            String fieldStr = (String) fieldValue;
            String searchStr = (String) value;
            return fieldStr.toLowerCase().contains(searchStr.toLowerCase());
        }
        else {
            return fieldValue.equals(value);
        }
    }


}
