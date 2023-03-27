import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Niece implements Comparable<Niece> {
    private String name;
    private int day;
    private int month;
    private Map<Uncle, String> presents;

    // Constructor
    protected Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.presents = new HashMap<>();
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int clearPresents() {
        int sz = presents.size();
        presents.clear();
        return sz;
    }

    public void listPresents() {
        for (Uncle uncle : Family.getUncles()) {
            if (presents.containsKey(uncle)) {
                System.out.println(uncle.getName() + " give present: " + presents.get(uncle));
            } else {
                System.out.println(uncle.getName() + " - Not given present yet");
            }
        }
    }

    public boolean receiveYet(Uncle uncle, String present) {
        if (presents.containsKey(uncle)) {
            return false;
        }

        if (presents.containsValue(present)) {
            return false;
        }

        presents.put(uncle, present);
        return true;
    }

    @Override
    public int compareTo(Niece o) {
        return getName().compareTo(o.getName());
    }
}
