import java.util.*;

public class Family {

    private static SortedSet<Niece> nieces = new TreeSet<>();
    private static SortedSet<Uncle> uncles = new TreeSet<>();

    public static Set<Uncle> getUncles() {
        return uncles;
    }

    public static Set<Niece> getNieces() {
        return nieces;
    }

    public boolean addNiece(java.lang.String name, int day, int month) {
        Niece temp = new Niece(name, day, month);
        if (nieces.contains(temp)) {
            return false;
        }
        nieces.add(temp);
        return true;
    }

    public boolean addUncle(java.lang.String name) {
        Uncle temp = new Uncle(name);
        if (uncles.contains(temp)) {
            return false;
        }
        uncles.add(temp);
        return true;
    }

    public static Niece findNiece(java.lang.String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null;
    }

    public static Uncle findUncle(java.lang.String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return uncle;
            }
        }
        return null;
    }

    public void listUncle() {
        int id = 1;
        for (Uncle uncle : uncles) {
            System.out.println(id + " " + uncle.getName());
            id++;
        }
    }

    public void listNiece() {
        List<Niece> sortedNieces = new ArrayList<>(nieces);
        sortedNieces.sort(Comparator.comparing(Niece::getMonth).thenComparing(Niece::getDay));

        int id = 1;
        for (Niece niece : sortedNieces) {
            System.out.println(id + " " + niece.getName() + " birthday: " + niece.getDay() + "/" + niece.getMonth());
            id++;
        }
    }

}
