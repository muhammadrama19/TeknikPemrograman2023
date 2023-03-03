import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ActionFigure[] actionFigures = new ActionFigure[6];

        // create action figure objects
        ActionFigure af1 = new afAOT("Eren Yeager", "Male", "Main protagonist of Attack on Titan", true);
        ActionFigure af2 = new afAvengers("Iron Man", "Male", "Genius, billionaire, playboy, philanthropist", "Repulsor beams");
        ActionFigure af3 = new afJujutsu("Yuji Itadori", "Male", "Protagonist of Jujutsu Kaisen", 3);
        ActionFigure af4 = new afXMEN("Wolverine", "Male", "Mutant with an accelerated healing factor", "Adamantium claws");
        ActionFigure af5 = new afAvengers("Scarlett Witch", "Female", "Nexus Being powered by Infinity Stone with Limitless Magic Capability", "Chaos Magic, Reality Wrapping");
        ActionFigure af6 = new afJujutsu("Megumi Fushiguro","Male", "Talented Sorcerer with Highly Summoning Technique", 5);

        // add action figure objects to array
        actionFigures[0] = af1;
        actionFigures[1] = af2;
        actionFigures[2] = af3;
        actionFigures[3] = af4;
        actionFigures[4] = af5;
        actionFigures[5] = af6;
        

        // display menu to user
        System.out.println("Selamat datang di Satoru Figure Stores!");
        System.out.println("Ini adalah action figure yang tersedia:");
        for (int i = 0; i < actionFigures.length; i++) {
            System.out.println((i+1) + ". " + actionFigures[i].name);
        }

        // get user input
        int choice = input.nextInt();
        while (choice < 1 || choice > actionFigures.length) {
            System.out.println("Pilihan salah.");
            choice = input.nextInt();
        }

        // buy action figure
        ActionFigure chosenAF = actionFigures[choice-1];
        System.out.println("Kamu membeli action figure : " + chosenAF.name );
        System.out.println("Berikut informasi detail action figure yang kamu beli: \n");

        // display info of purchased action figure
        chosenAF.displayInfo();
    }
}
