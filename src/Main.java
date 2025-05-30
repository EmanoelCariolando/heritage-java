import entities.ImportedProducct;
import entities.Product;
import entities.UsedProduct;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        productList.add(new ImportedProducct("Shoes", 100.0, 20.0));
        productList.add(new UsedProduct("Tv",1000, new Date()));
        productList.add(new ImportedProducct("T-shirt", 200.0, 25.0));
        productList.add(new UsedProduct("Monitor",1000, new Date()));

        double sum = 0.0;
        for (Product p : productList) {
          sum += p.getPrice();
        }
        System.out.println("Total: " + sum);


        sc.close();

 }
}