package entities;


public class ImportedProducct extends Product {
    private double cunstomsFee;

    public ImportedProducct(String name, double price, double cunstomsFee) {
        super(name, price);
        this.cunstomsFee = cunstomsFee;

    }

    public double getCunstomsFee() {
        return cunstomsFee;
    }

    public void setCunstomsFee(double cunstomsFee) {
        this.cunstomsFee = cunstomsFee;
    }

    public double totalPrice(){
        return this.getPrice() + this.getCunstomsFee();
    }

    @Override
    public String priceTag(){
        return super.getName() + " $ " + totalPrice() + " (Customs fee: $ " + cunstomsFee +") ";
    }

}
