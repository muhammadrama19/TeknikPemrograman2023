abstract class ActionFigure {
    String name;
    String gender;
    String description;

    // Constructor
    public ActionFigure(String name, String gender, String description) {
        this.name = name;
        this.gender = gender;
        this.description = description;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Description: " + description);
    }

}