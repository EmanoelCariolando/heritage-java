package Entities;

public class Indie extends Taxpayer {
   double healthExp;

    public Indie(double income, String name, double healthExp) {
        super(income, name);
        this.healthExp = healthExp;
    }

    public double getHealthExp() {
        return healthExp;
    }

    public void setHealthExp(double healthExp) {
        this.healthExp = healthExp;
    }

    @Override
    public double tax() {
        if(income < 20000.00){
           return income * 0.15;
        }
        else if(healthExp > 0 && income > 20000.00) {
            return (income * 0.25) - (healthExp * 0.50);
        }
        else {
            return income * 0.25;
        }
    }
}
