package A148;

public class SavingsAccount extends Account{
    
    private Double interesRate;

    public SavingsAccount(){

    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interesRate) {
        super(number, holder, balance);
        this.interesRate = interesRate;
    }

    public Double getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(Double interesRate) {
        this.interesRate = interesRate;
    }

    public void updateBalance(){
        balance += balance * interesRate;
    }

    

    
    
}
