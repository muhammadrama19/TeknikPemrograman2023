import java.util.*;

public class soalW3_berhitung{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String operator = sc.next();
        int B = sc.nextInt();
        int hasil = 0;

        switch (operator) {
            case "-":
                hasil = A - B;
                break;
            case "+":
                hasil = A + B;
                break;
            case "*":
                hasil = A * B;
                break;
            case "/":
                hasil = A / B;
                break;
            case "%":
                hasil = A % B;
                break;

        }

        System.out.println(hasil);

        sc.close();
    }

}