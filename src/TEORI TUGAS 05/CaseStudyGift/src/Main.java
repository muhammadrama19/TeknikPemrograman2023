import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String nameNieces, nameUncles, present;
        int day, month, opt;
        boolean control = true;

        Family family = new Family();

        //!add dummy data
        family.addNiece("Wanda", 18, 2);
        family.addNiece("Nat", 12, 1);
        family.addNiece("Carol", 1, 8);

        family.addUncle("Steve");
        family.addUncle("Tony");
        family.addUncle("Bruce");

        while (control) {
            System.out.println("Welcome to Present Family Management System!");
            System.out.println("\nCurrent Data:");
            System.out.println("List of Niece(date/month):");
            family.listNiece();
            System.out.println("\nList of Uncle:");
            family.listUncle();

            System.out.print("\nPick your action:\n");
            System.out.print("1.Add Present\n2.Add Uncle\n3.Add Nieces\n4.Look present by Uncle\n5.Look present by Niece\n6.Delete Niece's Present (All)\n7. Exit\nOption: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Input uncle name: ");
                    nameUncles = sc.next();
                    System.out.print("\nInput niece name: ");
                    nameNieces = sc.next();
                    System.out.print("\nInput Present : ");
                    present = sc.next();
                    if (Family.findUncle(nameUncles) != null && Family.findNiece(nameNieces) != null) {
                        if (Family.findUncle(nameUncles).addPresent(Family.findNiece(nameNieces), present) == true) {
                            Family.findNiece(nameNieces).receiveYet(Family.findUncle(nameUncles), present);
                            System.out.println("\nSuccesfully added " + present + " to "+nameNieces+"\n");
                        } else {
                            System.out.println("Present already given before or give it to another nieces, be nice uncle!");
                        }
                    } else {
                        System.out.println("\nUncle or Niece doesnt exist!");
                    }
                    break;
                case 2:
                    System.out.print("Input Uncle name: ");
                    nameUncles = sc.next();
                    if (family.addUncle(nameUncles) == true) {
                        System.out.println("\nSuccesfully added " + nameUncles + ". Welcome to family!\n");
                    } else {
                        System.out.println("\nDuplicate value alert! name : " + nameUncles + " already exist!\n");
                    }
                    break;
                case 3:
                    System.out.print("Input Niece name : ");
                    nameNieces = sc.next();
                    System.out.print("\nInput date of birth : ");
                    day = sc.nextInt();
                    System.out.print("\nInput month of birth : ");
                    month = sc.nextInt();
                    if (family.addNiece(nameNieces, day, month) == true) {
                        System.out.println("Niece" + nameNieces + " added succesfully, welcome to family!\n");
                    } else {
                        System.out.println("\nDuplicate value alert! name : " + nameNieces + " alscy exist!\n");
                    }
                    break;
                case 4:
                    System.out.print("Input uncle name: ");
                    nameUncles = sc.next();
                    System.out.println("\nHere's the present: ");
                    if (Family.findUncle(nameUncles) != null) {
                        Family.findUncle(nameUncles).listPresents();
                    } else {
                        System.out.println("\nUncle with name "+nameUncles+ " is not exist!");
                    }
                    break;
                case 5:
                    System.out.print("\nInput niece name: ");
                    nameNieces = sc.next();
                    System.out.println("\nHere's the present: ");
                    if (Family.findNiece(nameNieces) != null) {
                        Family.findNiece(nameNieces).listPresents();
                    } else {
                        System.out.println("\nNieces with name "+nameNieces+" is not exist!");
                    }
                    break;

                case 6:
                    System.out.print("\nEnter niece's name that you want to delete the present:");
                    nameNieces = sc.next();
                    if (Family.findNiece(nameNieces) != null) {
                        Family.findNiece(nameNieces).clearPresents();
                        final String temp_name = nameNieces;
                        Family.getUncles().forEach((uncle) -> {
                            uncle.removePresent(Family.findNiece(temp_name));
                        });
                    } else {
                        System.out.println("\nError Nieces with name "+nameNieces+" is not exist");
                    }
                    break;

                case 7:
                    control = false;
                    break;
            }
        }
        sc.close();
    }
}
