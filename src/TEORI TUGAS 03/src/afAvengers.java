public class afAvengers extends ActionFigureWestern {
    private String Power;
    public afAvengers(String name, String gender, String description, String Power) {
        super(name, gender, description);
        this.Power=Power;
    }

    @Override
    public double calculatePrice() {
        return 75.00;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Power: " + Power);
        System.out.println("Price: $" + calculatePrice());
    }


}