
import Entities.Company;
import Entities.Indie;
import Entities.Taxpayer;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         List<Taxpayer> completList = new ArrayList<>();

         System.out.print("Enter the taxpayer's name: ");
         int n = sc.nextInt();

         for(int i = 0; i < n; i++){
             System.out.println("Enter taxpayer #" + (i + 1) + " data: ");
             System.out.print("Individual or company (i/c)? ");
             char op = sc.next().charAt(0);
             sc.nextLine();
             System.out.print("Name: ");
             String name = sc.nextLine();
             System.out.print("Annual income: ");
             double income = sc.nextDouble();

             if(op == 'i'){
                 System.out.print("Enter health expenditures: ");
                 double healthExp = sc.nextDouble();
                 completList.add(new Indie(income, name, healthExp));
             }
             else if (op == 'c') {
                 System.out.print("Number of employers: ");
                 int employers = sc.nextInt();
                 completList.add(new Company(income, name, employers));
             }
         }

         double sum = 0.0;
         for(Taxpayer t : completList){
             System.out.printf("%s - $ %.2f%n", t.getName(), t.tax());
             sum += t.tax();
         }

         System.out.println();
         System.out.printf("Total: $ %.2f%n", sum);


 }
}