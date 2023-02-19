import java.util.*;
public class soalW3_io_1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        s = s.trim(); // hapus spasi
        
        /*hapus semua karakter aneh */
        String [] hasil = s.split("[^a-zA-Z]+");
        
        /*ouput*/
        System.out.println(hasil.length);
        for (String word : hasil) {
            System.out.println(word);
        }

        
    }
}
