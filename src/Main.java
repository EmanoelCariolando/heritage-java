import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account acc = new Account(123, "Manel", 1000.0);
        Account baac = new BusinessAccount(123, "Manel", 450.0, 500.0);

        // UPCASTING

        Account acc1 = baac;
        Account acc2 = new BusinessAccount(143, "Lulu", 500.0, 600.0);
        Account acc3 = new SavingAccount(122,"Mcacao", 1000.0, 0.05);

        // DOWNCASTING

        BusinessAccount baac1 = (BusinessAccount) acc2;
        baac1.loan(100.0);

        // BusinessAccount acc5 = (BussinessAccount)acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Loaned 100$ to " + acc5.getHolder());
        }

        if (acc3 instanceof SavingAccount){
            SavingAccount acc6 = (SavingAccount) acc3;
            acc6.uptadeBalance();
            System.out.println("Updated balance for " + acc6.getHolder());
        }

    }
}