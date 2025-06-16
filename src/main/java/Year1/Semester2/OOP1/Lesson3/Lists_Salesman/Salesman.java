package Year1.Semester2.OOP1.Lesson3.Lists_Salesman;

import java.util.ArrayList;
import java.util.HashMap;

public class Salesman {
    private String firstName;
    private String lastName;
    private int basicWeeklySalary;
    private HashMap<Integer, ArrayList<Product>> soldProductsPerDay;

    public Salesman(String firstName, String lastName, int basicWeeklySalary, HashMap<Integer, ArrayList<Product>> soldProductsPerDay){
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicWeeklySalary = basicWeeklySalary;
        this.soldProductsPerDay = soldProductsPerDay;
    }

}
