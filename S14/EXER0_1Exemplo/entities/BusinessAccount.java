package EXER0_1Exemplo.entities;


public class BusinessAccount extends Account {

  private Double loanLimit;

  public BusinessAccount() {
    super();
  }

  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance);

    this.loanLimit = loanLimit;
  }

  public Double getLoanLimit() {
    return loanLimit;
  }

  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  public void loan(double amount) {
    if (amount <= loanLimit) {
      balance += amount - 10.0;
    }
  }

  // suponha que, na classe BusinessAccount, a regra para saque seja realizar o
  // saque normalmente da superclasse, e descontar mais 2.0.

  @Override
  public void withdraw(double amount) {
    super.withdraw(amount);
    balance -= 2.0;
  }

}
