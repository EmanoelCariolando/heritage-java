import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();


        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            System.out.printf("Employee #%d data: ", i + 1);
            System.out.print("Outsourced (y/n)? ");
            char quest = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (quest != 'y') {
                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            } else {
                System.out.print("Addiditional Charge: ");
                double additional = sc.nextDouble();
                Employee secondEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additional);
                employeeList.add(secondEmployee);
            }

        }

        System.out.println("PAYMENTS: ");

        for (Employee emp : employeeList) {
          System.out.printf("%s - $ %.2f \n",emp.getName(), emp.payament());
        }

        sc.close();

 }
}