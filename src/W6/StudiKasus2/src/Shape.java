public abstract class Shape {
    protected String shapeName;
    
    public Shape(String shape) {
        shapeName=shape;
    }

    public double area(){
        return 0;
    }

    public String toString()
    {
        String result = "Shape name: " + shapeName + "\n";
        return result;
    }
}
