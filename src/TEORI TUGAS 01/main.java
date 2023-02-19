import java.util.*;

public class main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukan jumlah pelanggan: ");
    int numCustomers = scan.nextInt();

    Customer[] customers = new Customer[numCustomers];
    scan.nextLine();
    for (int i = 0; i < numCustomers; i++) {
      customers[i] = new Customer();
      System.out.print("Masukan menu warteg keinginan pelanggan " + (i + 1) + ": ");
      customers[i].setInterest(scan.nextLine());
    }

    Seller seller = new Seller();
    for (int i = 0; i < numCustomers; i++) {
      seller.sell(customers[i]);
    }
    scan.close();
  }
}