package S9.EXER1;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Account account;

    System.out.printf("Enter account number: ");
    int number = sc.nextInt();
    System.out.printf("Enter account holder: ");
    sc.nextLine(); // para que seja consumida a quebra de linha que ficou pendente no sc.nextInt();
    String holder = sc.nextLine();

    System.out.printf("Is there na initial deposit (y/n)? ");
    char deposit = sc.next().charAt(0); // Argumento importante para confirmação de S/N sc.next() || .charAt(0); ||

    if (deposit == 'y') {
      System.out.print("Enter initial deposit value: ");
      double amount = sc.nextDouble();
      account = new Account(number, holder, amount);
    } else {
      account = new Account(number, holder);
    }

    System.out.println();
    System.out.println("Account data:");
    System.out.println(account);
    System.out.println();

    System.out.printf("Enter a deposit value: ");
    double amount = sc.nextDouble();
    account.deposit(amount);
    System.out.println("Updated account data: ");
    System.out.println(account);
    System.out.println();

    System.out.printf("Enter a withdraw value: ");
    amount = sc.nextDouble();
    account.withdraw(amount);
    System.out.println("Updated account data:");
    System.out.println(account);
    System.out.println();

    sc.close();
  }

}
