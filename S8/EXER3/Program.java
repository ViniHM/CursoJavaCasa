package S8.EXER3;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Student student = new Student();

    System.out.println("Digite o nome e as notas de cada trimestre: ");
    student.name = sc.nextLine();
    student.n1 = sc.nextDouble();
    student.n2 = sc.nextDouble();
    student.n3 = sc.nextDouble();

    if (student.finalGrade() >= 60.00) {
      System.out.printf("FINAL GRADE = " + student.finalGrade());
      System.out.println();
      System.out.println("PASS");
    } else {
      System.out.printf("FINAL GRADE = " + student.finalGrade());
      System.out.println();
      System.out.println("FAILED");
      System.out.printf("MISSING " + student.missingPoints() + " POINTS");

    }

    sc.close();
  }
}
