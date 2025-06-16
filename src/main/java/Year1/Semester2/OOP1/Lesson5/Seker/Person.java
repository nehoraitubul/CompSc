package Year1.Semester2.OOP1.Lesson5.Seker;

import com.github.javafaker.Faker;

public class Person {
    private String fullName;

    public Person(){
        Faker faker = new Faker();
        this.fullName = faker.name().fullName();
    }
}
