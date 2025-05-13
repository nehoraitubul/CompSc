package Semester2.OOP1.Lesson3.Lists_Salesman;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
