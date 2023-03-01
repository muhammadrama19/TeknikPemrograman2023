import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Salesperson[] salesStaff;
        int count = 0;
        
        System.out.println("Entry person :");
        count = scan.nextInt();
        scan.nextLine();
        salesStaff = new Salesperson[count];
        
        System.out.println();
        for (int i = 0; i < count; i++) {
            String fullName;
            int sales;
            System.out.println("Masukan nama dan belakang karyawan ke " + (i + 1) + ": ");
            fullName = scan.nextLine();
            System.out.println("Masukan sales depan karyawan ke " + (i + 1) + ": ");
            sales = scan.nextInt();
            scan.nextLine();
        
            String[] nameParts = fullName.split(" ");
            String firstName = nameParts[0];
            String lastName = nameParts[1];
        
            salesStaff[i] = new Salesperson(firstName, lastName, sales);
            System.out.println();
        }

        Sorting.insertionSort(salesStaff);
        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }
    }
}
