package S10.EXER0_2Exemplo;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

Product[] vect = new Product[n];


for (int i=0; i<vect.length; i++) { // vect.length aponta para o tamanho do vetor 
sc.nextLine();                       //vect (nome dado) .length aponta para o tamanho
String name = sc.nextLine();
double price = sc.nextDouble();
vect[i] = new Product(name, price);
}

double sum = 0.0;

for (int i=0; i<vect.length; i++) {
sum += vect[i].getPrice();
}
double avg = sum / vect.length;
System.out.printf("AVERAGE PRICE = %.2f%n", avg);

sc.close();

}
  
}
