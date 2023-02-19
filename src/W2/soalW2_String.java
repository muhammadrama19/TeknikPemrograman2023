import java.util.*;
public class soalW2_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();
    
        // Sum the lengths of A and B
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);
    
        // Determine lexicographic order
        int comparisonResult = A.compareTo(B);
        if (comparisonResult > 0) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    
        // Capitalize the first letter in A and B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
      }
}
