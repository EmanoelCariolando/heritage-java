package Entities;

public abstract class Taxpayer {

    String name;
    double income;

    public Taxpayer(double income, String name) {
        this.income = income;
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double tax();
}