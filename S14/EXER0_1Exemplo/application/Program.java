package S14.EXER0_1Exemplo.application;

import S14.EXER0_1Exemplo.entities.Account;
import S14.EXER0_1Exemplo.entities.BusinessAccount;
import S14.EXER0_1Exemplo.entities.SavingsAccount;

public class Program {
  public static void main(String[] args) {

    Account acc = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    // UPCASTING = pegar um objeto de 'BusinessAccount' e atribuilo para uma
    // variavel do tipo 'Account'

    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    // DOWNCASTING = converter um objeto da 'super classe' p/ 'sub classe'
    /*
     * acc2.loan(amount); é do tipo Account por isso não consigo realizar a operação
     * loan
     */

    BusinessAccount acc4 = (BusinessAccount) acc2; // para que isso seja possivel é necessário fazer um cast
    acc4.loan(100.0); // fazendo o DownCasting para o tipo DOWNCASTING é possivel fazer a operação

    /*
     * BusinessAccount acc5 = (BusinessAccount) acc3; ao fazer o DOWNCASTING nota-se
     * que a acc3 é do tipo SavingsAccount, de imediato o programa não reclama, mas
     * ao compilar recebera um erro, uma vez que SavingsAccount =! BusinessAccount.
     * Para evitar esse erro pode-se fazer um teste utilizando a palavra
     * *instanceof*
     */

    if (acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount) acc3;
      acc5.loan(200.0);
      System.out.println("Loan!");
    }
    if (acc3 instanceof SavingsAccount) {
      SavingsAccount acc5 = (SavingsAccount) acc3;
      acc5.updateBalance();
      System.out.println("Update!");
    }

  }

}
