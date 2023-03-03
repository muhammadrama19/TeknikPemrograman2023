public class afJujutsu extends ActionFigureJapan {
    private int curseLevel;
    public afJujutsu(String name, String gender, String description, int curseLevel) {
        super(name, gender, description);
        this.curseLevel=curseLevel;
    }

    public double calculatePrice() {
        return 100.00;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Curse Level: " + curseLevel);
        System.out.println("Price: $" + calculatePrice());
    }


}