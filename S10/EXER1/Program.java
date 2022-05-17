package S10.EXER1;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Rent[] vect = new Rent[10];

    System.out.printf("How many rooms will be rented? ");
    int n = sc.nextInt();
    System.out.println();

    for (int i = 1; i <= n; i++) {

      sc.nextLine();
      System.out.printf("Rent #%d%n", i);
      System.out.printf("Name: ");
      String name = sc.nextLine();
      System.out.printf("Email: ");
      String email = sc.nextLine();
      System.out.printf("Room: ");

      int room = sc.nextInt();
      System.out.println();
      vect[room] = new Rent(name, email);

    }
    System.out.println("Busy rooms:");

    for (int i = 0; i < vect.length; i++) {

      if (vect[i] != null) {
        System.out.println(i + ": " + vect[i]);

      }

    }

    sc.close();
  }

}
