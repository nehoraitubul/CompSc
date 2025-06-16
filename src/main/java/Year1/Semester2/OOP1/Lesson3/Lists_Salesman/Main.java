package Year1.Semester2.OOP1.Lesson3.Lists_Salesman;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Faker faker = new Faker();
        Random rnd = new Random();

        ArrayList<Salesman> salesmen = new ArrayList<>();
        ArrayList<Product> productList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            int salary = rnd.nextInt(10000, 20000);

//            Salesman salesman = new Salesman(firstName, lastName, salary,);
        }
    }
}
