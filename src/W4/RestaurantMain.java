import java.util.*;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        Scanner scan = new Scanner(System.in);
        menu.tambahMenuMakanan("Bala-bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 10);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();

        System.out.println("Enter the id of the food item you want to order:");
        byte id_makanan = scan.nextByte();
        System.out.println("Enter the number of items you want to order:");
        int jumlah_pesanan = scan.nextInt();
        menu.ordering(id_makanan, jumlah_pesanan);
        System.out.println("stock now is:");
        menu.tampilMenuMakanan();

    }
}