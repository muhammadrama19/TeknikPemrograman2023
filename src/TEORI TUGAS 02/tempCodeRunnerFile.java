import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        DVD[] dvds = new DVD[100];
        int dvdCount = 0;

        while (true) {
            System.out.println("1. View DVD collection");
            System.out.println("2. Add new Film DVD");
            System.out.println("3. Add new Music DVD");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("DVD Collection:");
                    for (int i = 0; i < dvdCount; i++) {
                        dvds[i].display();
                    }
                    break;
                case 2:
                    System.out.print("Enter Judul: ");
                    String judul = input.next();
                    System.out.print("Enter Pemeran (separated by comma and space): ");
                    String pemeran = input.nextLine();
                    System.out.print("Enter Sutradara: ");
                    String sutradara = input.next();
                    System.out.print("Enter Publisher: ");
                    String publisher = input.next();
                    System.out.print("Enter Kategori (SU/D/R/A): ");
                    String kategori = input.next();
                    System.out.print("Enter Stock: ");
                    int stock = input.nextInt();
                    FilmDVD filmDVD = new FilmDVD(judul, pemeran, sutradara, publisher, kategori, stock);
                    dvds[dvdCount] = filmDVD;
                    dvdCount++;
                    System.out.println("Film DVD added successfully.");
                    break;
                case 3:
                    System.out.print("Enter Judul: ");
                    judul = input.next();
                    System.out.print("Enter Penyanyi: ");
                    String penyanyi = input.next();
                    System.out.print("Enter Produser: ");
                    String produser = input.next();
                    System.out.print("Enter Top Hits (separated by comma): ");
                    String topHits = input.nextLine();
                    System.out.print("Enter Publisher: ");
                    publisher = input.next();
                    System.out.print("Enter Kategori (C/J/P/R/O): ");
                    kategori = input.next();
                    System.out.print("Enter Stock: ");
                    stock = input.nextInt();
                    MusicDVD musicDVD = new MusicDVD(judul, penyanyi, produser, publisher, topHits, kategori, stock);
                    dvds[dvdCount] = musicDVD;
                    dvdCount++;
                    System.out.println("Music DVD added successfully.");
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
