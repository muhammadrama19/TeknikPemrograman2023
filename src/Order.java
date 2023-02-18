import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Order {
    private String product_name;
    private int quantity;

    public Order(String product_name, int quantity) {
        this.product_name = product_name;
        this.quantity = quantity;
    }

    public String getProductName() {
        return product_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPay(Product product) {
        return quantity * product.getPrice();
    }

    public static void main(String[] args) {
        // Create the product menu
        int totalPay = 0;
        List<Product> productMenu = new ArrayList<>();
        productMenu.add(new Product("Nasi Uduk", 20000, 10));
        productMenu.add(new Product("Seblak", 15000, 15));
        productMenu.add(new Product("Cimin", 25000, 5));
        productMenu.add(new Product("Cireng", 30000, 7));
        productMenu.add(new Product("Tahu Walik", 18000, 12));
        productMenu.add(new Product("Bakso Urat", 20000, 8));
        productMenu.add(new Product("Ayam Betutu", 15000, 20));
        productMenu.add(new Product("Soto Madura", 25000, 7));
        productMenu.add(new Product("Mie Bakso", 18000, 15));
        productMenu.add(new Product("Pecel", 20000, 10));

        Scanner scanner = new Scanner(System.in);

        List<Order> orderList = new ArrayList<>();
        
        while (true) {
            System.out.println("=============================================");
            System.out.println("| ID | Product Name      | Price  | Stock   |");
            System.out.println("|-------------------------------------------|");
            for (int i = 0; i < productMenu.size(); i++) {
                Product product = productMenu.get(i);
                System.out.printf("| %-2d | %-16s | %6d | %6d  |\n", i + 1, product.getProductName(), product.getPrice(), product.getStock());
            }
            System.out.println("=============================================");

            System.out.print("Input menu ID: ");
            int menuId = scanner.nextInt();

            //cek kondisi validasi id
            if (menuId < 1 || menuId > productMenu.size()) {
                System.out.println("Invalid menu, ID salah.");
                continue;
            }

            //validasi stok
            Product selectedProduct = productMenu.get(menuId - 1);
            if (selectedProduct.getStock() == 0) {
                System.out.println("Maaf menu yang anda inginkan tidak ada stoknya.");
                continue;
            }

            //validasi quantity
            System.out.print("Input quantity: ");
            int quantity = scanner.nextInt();
            if (quantity < 1 || quantity > selectedProduct.getStock()) {
                System.out.println("Invalid quantity, coba lagi.");
                continue;
            }

            selectedProduct.setStock(selectedProduct.getStock() - quantity);

            Order order = new Order(selectedProduct.getProductName(), quantity);
            orderList.add(order);
            totalPay += order.getTotalPay(selectedProduct);

            System.out.println("Ordered menu: " + order.getProductName() + " x " + order.getQuantity());
            System.out.println("Total Pay: " + totalPay);

            //konfirmasi user
            System.out.print("Tambah lagi? (Y/N): ");

            //validasi konfirmasi
            String addMore = scanner.next();
            if (!addMore.equalsIgnoreCase("Y")) {
                break;
            }

            //end of 
            System.out.println("===== Ordered Menu =====");
            for (Order o : orderList) {
                System.out.println(o.getProductName() + " x " + o.getQuantity());
            }
            System.out.println("Total Pay: " + totalPay);
        }

    }
}
