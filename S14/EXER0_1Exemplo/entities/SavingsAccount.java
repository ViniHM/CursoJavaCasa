package S14.EXER0_1Exemplo.entities;

public class SavingsAccount extends Account {

  private Double interestRate;

  public SavingsAccount() {
    super();
  }

  public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public void updateBalance() {
    balance += balance * interestRate;
  }

  @Override // essa notação mostra ao compilado que existe uma sobreposição e o mesmo vai
            // confirmar.
  public void withdraw(double amount) {
    balance -= amount;
  }

}
