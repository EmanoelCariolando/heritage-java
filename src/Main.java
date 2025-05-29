import entities.Product;
import entities.ImportedProducct;
import entities.UsedProduct;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data:%n", i + 1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char choice = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (choice == 'c') {
                productList.add(new Product(name, price));
            }
            else if (choice == 'i') {
                System.out.print("Customs fee: ");
                double cunstomsFee = sc.nextDouble();
                productList.add(new ImportedProducct(name, price, cunstomsFee));
            }
            else if (choice == 'u'){
                Date manufactureDate = new Date();
                productList.add(new UsedProduct(name, price, manufactureDate));
            }

        }
        for (Product p : productList) {
            System.out.println(p.priceTag());
        }

        sc.close();

 }
}