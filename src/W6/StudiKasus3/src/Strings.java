import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many Strings do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine();
        intList = new String[size];

        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextLine();
        }
        Sorting.insertionSort(intList);
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.println(intList[i] + " ");
        }
        System.out.println();
    }
}
