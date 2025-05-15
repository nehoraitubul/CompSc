package Semester2.OOP1.Lesson3.SalesmanSolve;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Salesman {
    private String firstName;
    private String lastName;
    private int basicSalary;
    private int bonus;
    private int totalSold;
    private int totalBonusProductSold;
    private Map<Integer, ArrayList<ProductNew>> soldItems;

    public Salesman(){
        Faker faker = new Faker();
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.basicSalary = faker.number().numberBetween(2500, 6000);

        List<Integer> days = List.of(1, 2, 3, 4, 5, 6, 7);
        this.soldItems = days
                .stream()
                .collect(Collectors.toMap(day -> day, day ->  new ArrayList<>()
                ));
    }

    public void sell(int day, boolean isBonus, ProductNew product){
        List<ProductNew> products = this.soldItems.get(day);
        products.add(product);

        if (isBonus){
            bonus += product.getPrice();
            this.totalBonusProductSold++;
        }

        this.totalSold++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Salesman: ").append(firstName).append(" ").append(lastName).append("\n");
        sb.append("Basic Salary: ").append(basicSalary).append(" ₪").append("\n");
        sb.append("Bonus Earned: ").append(bonus).append(" ₪").append("\n");
        sb.append("Total Salary: ").append(basicSalary + bonus).append(" ₪").append("\n");
        sb.append("Total Products Sold: ").append(totalSold).append("\n");
        sb.append("Total Bonus Products Sold: ").append(totalBonusProductSold).append("\n");
        sb.append("Sales by Day:\n");

        for (int day = 1; day <= 7; day++) {
            int count = soldItems.get(day).size();
            sb.append("  Day ").append(day).append(": ").append(count).append(" products sold\n");
        }

        return sb.toString();
    }

    public int getTotalSalary(){
        return this.basicSalary + this.bonus;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

}
