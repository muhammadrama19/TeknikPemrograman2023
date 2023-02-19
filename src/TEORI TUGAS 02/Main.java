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
                    System.out.print("Enter film title: ");
                    String filmTitle = input.next();
                    input.nextLine();
                    System.out.print("Enter film cast (comma-separated): ");
                    String filmCast = input.nextLine();
                    System.out.print("Enter film director: ");
                    String filmDirector = input.nextLine();
                    System.out.print("Enter film publisher: ");
                    String filmPublisher = input.nextLine();
                    System.out.print("Enter film category (SU/D/R/A): ");
                    String filmCategory = input.nextLine().toUpperCase();
                    System.out.print("Enter film stock: ");
                    int filmStock = input.nextInt();

                    dvds[dvdCount] = new FilmDVD(filmTitle, filmCast, filmDirector, filmPublisher, filmCategory, filmStock);
                    dvdCount++;
                    System.out.println("Film DVD added to collection.");
                    break;
                case 3:
                    System.out.print("Enter music title: ");
                    String musicTitle = input.next();
                    input.nextLine();
                    System.out.print("Enter singer name: ");
                    String singerName = input.nextLine();
                    System.out.print("Enter music producer: ");
                    String musicProducer = input.nextLine();
                    System.out.print("Enter top hits (comma-separated): ");
                    String topHits = input.nextLine();
                    System.out.print("Enter music publisher: ");
                    String musicPublisher = input.nextLine();
                    System.out.print("Enter music category (C/J/P/R/O): ");
                    String musicCategory = input.nextLine().toUpperCase();
                    System.out.print("Enter music stock: ");
                    int musicStock = input.nextInt();

                    dvds[dvdCount] = new MusicDVD(musicTitle, singerName, musicProducer, musicPublisher, topHits, musicCategory, musicStock);
                    dvdCount++;
                    System.out.println("Music DVD added to collection.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
} 