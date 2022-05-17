package S8.EXER5_ExerFixac;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("What is the dollar price? ");
    double precoDolar = sc.nextDouble();
    System.out.print("How many dollars will be bought? ");
    double quantityDolar = sc.nextDouble();

    double total = CurrencyConverter.AmountTotal(precoDolar, quantityDolar);
    System.out.printf("Amount to be paid in reais = %.2f ", total);

    sc.close();
  }

}
