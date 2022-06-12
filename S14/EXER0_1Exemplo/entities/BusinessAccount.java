package S14.EXER0_1Exemplo.entities;

public class BusinessAccount extends Account {

  private Double loanLimit;

  public BusinessAccount() {
    super();
  }

  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance); // assim se chama o construtor da super classe, não se fazendo necessário
                                    // repetir
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
      balance += amount - 10.0; // só foi possivel acessar o atributo "balance" devido a implementação do metodo
                                // "protected" na classe "Account" | modificador de acesso protected*
    }

  }

}
