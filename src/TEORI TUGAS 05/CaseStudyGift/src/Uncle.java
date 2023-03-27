import java.util.*;

class Uncle implements Comparable<Uncle> {

    private String name;
    private Map<Niece, String> presents;

    //!Constructor
    protected Uncle(String name) {
        this.name = name;
        this.presents = new LinkedHashMap<>();
    }

    
    public String getName() {
        return name;
    }


    public boolean addPresent(Niece niece, String present) {
        if (presents.containsKey(niece) || presents.containsValue(present)) {
            return false;
        }
        presents.put(niece, present);
        return true;
    }

    public void listPresents() {
        for (Niece niece : Family.getNieces()) {
            if (presents.containsKey(niece)) {
                System.out.println(niece.getName() + " get present " + presents.get(niece));
            } else {
                System.out.println(niece.getName() + "  Not given present yet");
            }
        }
    }


    public boolean removePresent(Niece niece) {
        if (presents.containsKey(niece)) {
            presents.remove(niece);
            return true;
        }
        return false;
    }


    @Override
    public int compareTo(Uncle o) {
        return name.compareTo(o.name);
    }
}

