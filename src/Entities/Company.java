package Entities;

public class Company extends Taxpayer {
  int employes;

    public Company(double income, String name, int employes) {
        super(income, name);
        this.employes = employes;
    }

    public int getEmployes() {
        return employes;
    }

    public void setEmployes(int employes) {
        this.employes = employes;
    }

    @Override
    public double tax() {
        if(employes > 10) {
            return income * 0.14;
        }
        else{
            return income * 0.16;
        }
    }
}
