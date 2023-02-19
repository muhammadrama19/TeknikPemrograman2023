import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DVD[] dvds = new DVD[100];
        int count = 0;

        while (true) {
            System.out.println("\nWelcome to DVD program!");
            System.out.println("created by: Muhammad Rama Nurimani\n");                                                            
            System.out.println("1. Tambah DVD Film");
            System.out.println("2. Tambah DVD Musik");
            System.out.println("3. Lihat DVD");
            System.out.println("4. Exit");
            System.out.println("Masukan pilihanmu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\nMasukan Informasi Film\n");
                    System.out.print("Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Pemeran: ");
                    String pemeran = scanner.nextLine();
                    System.out.print("Sutradara: ");
                    String sutradara = scanner.nextLine();
                    System.out.print("Publisher: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Kategori (SU/D/R/A): ");
                    String kategori = scanner.nextLine().toUpperCase();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); // consume newline character
                    dvds[count] = new FilmDVD(judul, pemeran, sutradara, publisher, kategori, stock);
                    count++;
                    System.out.println("DVD film berhasil ditambahkan.\n");
                    break;

                case 2:
                    System.out.println("\nMasukan Informasi Musik\n");
                    System.out.print("Judul: ");
                    judul = scanner.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi = scanner.nextLine();
                    System.out.print("Produser: ");
                    String produser = scanner.nextLine();
                    System.out.print("Publisher: ");
                    publisher = scanner.nextLine();
                    System.out.print("Top Hits (separated by comma): ");
                    String topHits = scanner.nextLine();
                    System.out.print("Kategori (C/J/P/R/O): ");
                    kategori = scanner.nextLine().toUpperCase();
                    System.out.print("Stock: ");
                    stock = scanner.nextInt();
                    scanner.nextLine(); 
                    dvds[count] = new MusicDVD(judul, penyanyi, produser, publisher, topHits, kategori, stock);
                    count++;
                    System.out.println("DVD Musik berhasil ditambahkan.\n");
                    break;

                case 3:
                    System.out.println("\nMana yang ingin anda lihat:\n1.Film DVD \n2.Music DVD\nMasukan Pilihan Anda: ");
                    byte choiceView = 0;
                    choiceView = scanner.nextByte();
                    switch (choiceView) {
                        case 1:
                            System.out.println("\nFilm DVDs:");
                            for (int i = 0; i < count; i++) {
                                if (dvds[i] instanceof FilmDVD) {
                                    dvds[i].display();
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Music DVDs:");
                            for (int i = 0; i < count; i++) {
                                if (dvds[i] instanceof MusicDVD) {
                                    dvds[i].display();
                                }
                            }
                            break;
                        default:
                        System.out.println("Input salah!");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Input anda salah!.\n");
                    break;
            }
        }
    }
}
