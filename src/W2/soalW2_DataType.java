import java.util.*;
import java.math.*;

public class soalW2_DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BigInteger[] nums = new BigInteger[T];
        for (int i = 0; i < T; i++) {
            nums[i] = sc.nextBigInteger();
        }
        for (int i = 0; i < T; i++) {
            BigInteger n = nums[i];
            if (n.compareTo(BigInteger.valueOf(-128)) >= 0 && n.compareTo(BigInteger.valueOf(127)) <= 0) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (n.compareTo(BigInteger.valueOf(-32768)) >= 0 && n.compareTo(BigInteger.valueOf(32767)) <= 0) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            } else if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* long");
            } else {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
