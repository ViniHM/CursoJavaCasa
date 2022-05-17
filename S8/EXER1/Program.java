package S8.EXER1;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Rectangle rectangle = new Rectangle();

    System.out.println("Enter rectangle width and height: ");
    rectangle.width = sc.nextDouble();
    rectangle.height = sc.nextDouble();
    System.out.printf("AREA = " + rectangle.area());
    System.out.println();
    System.out.printf("AREA = " + rectangle.perimeter());
    System.out.println();
    System.out.printf("AREA = " + rectangle.diagonal());

    sc.close();

  }

}
