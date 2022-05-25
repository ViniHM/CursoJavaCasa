package S13.EXER0_1Exemplo;

import java.util.Date;

public class Program {
  public static void main(String[] args) {

    Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

    System.out.println(order);

    OrderStatus os1 = OrderStatus.DELIVERED;
    OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // para converter String p/ enum (assim o programa
    // reconhece a entrada dada pelo usuario(String) em formato de enum

    System.out.println(os1);
    System.out.println(os2);

  }

}
