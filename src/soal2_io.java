import java.util.*;
public class soal2_io{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[][] arr = new String[3][2]; //2d array agar memudahkan dalam store array, sehingga saat loop mudah dijangkau
        for (int i = 0; i < 3; i++) {
          arr[i] = sc.nextLine().split(" "); //split untuk menghilangkan spasi yang memisahkan string dan integer

        }
        sc.close();
    
        System.out.println("================================");
        for (String[] line : arr) {
          String str = line[0];
          int num = Integer.parseInt(line[1]); 
          //parseint berfungsi untuk mengekstarak sebuah angka dari sebuah array of string
          //dalam kasus ini angka tsb angka awalnya sebuah string setelah parseint akan jadi integer (melalui pengekstrakan)
          System.out.printf("%-15s%03d\n", str, num);
        }
        System.out.println("================================");
      }
    }

