public class ActionFigureWestern extends ActionFigure implements ActionFigureInterface {
    public ActionFigureWestern(String name, String gender, String description) {
        super(name, gender, description);
    }

    @Override
    public double calculatePrice() {
        return 50.00;
    }

}