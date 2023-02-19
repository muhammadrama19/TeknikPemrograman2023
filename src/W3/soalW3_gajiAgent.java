import java.util.*;
public class soalW3_gajiAgent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();
        int gaji = 500000;
        int itemPrice = 50000;
        int bonus;
        int denda;

        if (sales < 15) {
            denda = (int) (((15-sales)*0.15)*itemPrice);
            gaji -= denda;
        } else if (sales >= 15 && sales < 40) {
            bonus = (int) (sales * itemPrice * 0.1);
            gaji += bonus;
        } else if (sales >= 40 && sales <= 80) {
            bonus = (int) (sales * itemPrice * 0.25);
            gaji += bonus;
        } else {
            bonus = (int) (sales * itemPrice * 0.35);
            gaji += bonus;
        }

        System.out.println(gaji);
    }
    
}
