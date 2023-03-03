public class afXMEN extends ActionFigureWestern {
    private String MutationPower;
    public afXMEN(String name, String gender, String description, String MutationPower) {
        super(name, gender, description);
        this.MutationPower=MutationPower;
    }

    @Override
    public double calculatePrice() {
        return 60.00;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mutation Power: " + MutationPower);
        System.out.println("Price: $" + calculatePrice());
    }

}