package Year1.Semester2.OOP1.Lesson3.SalesmanSolve;

import java.util.*;

public class Store {
    private String storeName;
    private List<Salesman> salesmenList;
    private List<ProductNew> productList;
    private Map<Integer, Set<ProductNew>> bonusProducts;

    public Store(String storeName, List<Salesman> salesmenList, List<ProductNew> productList){
        this.storeName = storeName;
        this.salesmenList = salesmenList;
        this.productList = productList;

        this.bonusProducts = new HashMap<>();
        Random rnd = new Random();
        for (int i = 1; i <= 7; i++) {
            Set<ProductNew> randomProducts = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                int rndNum = rnd.nextInt(productList.size());
                randomProducts.add(productList.get(rndNum));
            }
            bonusProducts.put(i, randomProducts);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Bonus Products by Day:\n");

        for (int day : bonusProducts.keySet()) {
            sb.append("Day ").append(day).append(": ");

            Set<ProductNew> products = bonusProducts.get(day);
            for (ProductNew p : products) {
                sb.append(p.getDescription()).append(", ");
            }

            sb.append("\n");
        }

        return sb.toString();
    }

    public void startWeek(){
        Random rnd = new Random();
        for (int i = 1; i <= 7; i++) {
            for (Salesman salesman : this.salesmenList){
                int numberOfSales = rnd.nextInt(30);
                for (int j = 0; j < numberOfSales; j++) {
                    ProductNew product = productList.get(rnd.nextInt(productList.size()));
                    salesman.sell(i, isBonusProductToday(product, i), product);
                }
            }
        }
    }

    private boolean isBonusProductToday(ProductNew product, int day){
        Set<ProductNew> products = this.bonusProducts.get(day);
        return products.contains(product);
    }
}
