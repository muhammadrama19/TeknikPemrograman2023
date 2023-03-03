public class afAOT extends ActionFigureJapan {
    private boolean titanKiller;
    public afAOT(String name, String gender, String description, boolean titanKiller) {
        super(name, gender, description);
        this.titanKiller=titanKiller;

    }

    @Override
    public double calculatePrice() {
        return 90.00;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Titan Killer: " + titanKiller);
        System.out.println("Price: $" + calculatePrice());
    }


}