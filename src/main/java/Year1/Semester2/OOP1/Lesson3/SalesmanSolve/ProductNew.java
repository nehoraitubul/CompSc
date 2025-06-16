package Year1.Semester2.OOP1.Lesson3.SalesmanSolve;

import com.github.javafaker.Faker;

public class ProductNew {
    private String description;
    private int price;
    private int stock;

    public ProductNew(){
        Faker faker = new Faker();
        this.description = faker.food().fruit();
        this.price = faker.number().numberBetween(10, 50);
        this.stock = faker.number().numberBetween(3, 10);
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

}
