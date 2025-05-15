package Semester2.OOP1.Lesson3.SalesmanSolve;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ProductNew> products = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            products.add(new ProductNew());
        }
        List<Salesman> salesmen = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            salesmen.add(new Salesman());
        }
        Store store = new Store("Neho's Store", salesmen, products);
        System.out.println(store);

        new Thread(() -> {
            store.startWeek();
        }).start();

        new Thread(() -> {
            try {
                System.out.println("מבצע סימולציית מכירות וקניות, המתן...");
                Thread.sleep(5000);
                for (Salesman salesman : salesmen){
                    System.out.println(salesman);
                    System.out.println("\n\n\n");

                }
                List<Salesman> sortedSalesmen = salesmen.stream().
                        sorted(Comparator.comparingInt(Salesman::getTotalSalary).reversed())
                        .toList();

                System.out.println("The salesman with the highes salary this week: " + sortedSalesmen.getFirst().getFullName() +
                        "with total salarty of: " + sortedSalesmen.getFirst().getTotalSalary());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

}
