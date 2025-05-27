package entities;

public class BusinessAccount extends Account {
    private Double loanLimint;

    public BusinessAccount(Integer number, String holder, Double balance,Double loanLimint) {
        super(number, holder, balance);
        this.loanLimint = loanLimint;
    }

    public Double getLoanLimint() {
        return loanLimint;
    }

    public void setLoanLimint(Double loanLimint) {
        this.loanLimint = loanLimint;
    }

    public void loan(Double amount){
       if (amount <= loanLimint){
           deposit(amount);
       }
    }
}
