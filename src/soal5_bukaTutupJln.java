import java.util.*;

public class soal5_bukaTutupJln {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputUser = "" + scanner.nextInt() + scanner.nextInt() + scanner.nextInt() + scanner.nextInt();
        if (Long.parseLong(inputUser) % 5 == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
        scanner.close();

    }
}