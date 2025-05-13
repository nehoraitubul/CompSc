package Semester2.OOP1.Lesson3.Lists_Salesman;

import java.util.*;

public class Store {
    private String name;
    private ArrayList<Salesman> salesmen;
    private ArrayList<Product> productList;
    private HashMap<Integer, HashSet<Product>> BonusSalePerDay;

    Random rnd = new Random();


    public Store(ArrayList<Salesman> salesmen, ArrayList<Product> productList){
        this.salesmen = salesmen;
        this.productList = productList;

        for (int i = 1; i < 8; i++) {
            int numOfProducts = rnd.nextInt(3);
            HashSet<Product> productsForBonus = new HashSet<>();
            for (int j = 0; i < numOfProducts; i++) {
                int index = rnd.nextInt(productList.size());
                productsForBonus.add(productList.get(index));
            }
            BonusSalePerDay.put(i, productsForBonus);
        }
    }
}
