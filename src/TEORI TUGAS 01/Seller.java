public class Seller {
  Customer customer = new Customer();

  public void sell(Customer customer) {
      System.out.println("Penjual menjual " + customer.getInterest() + " seharga 10 Milyar");
  }
}