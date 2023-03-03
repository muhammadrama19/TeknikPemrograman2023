public class ActionFigureJapan extends ActionFigure implements ActionFigureInterface {
    public ActionFigureJapan(String name, String gender, String description) {
        super(name, gender, description);
    }

    @Override
    public double calculatePrice() {
        return 75.00;
    }

}