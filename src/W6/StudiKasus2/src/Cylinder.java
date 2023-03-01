
public class Cylinder extends Shape {
    private double Rad;
    private double Height;
    
    public Cylinder(double radius, double height) {
        super("Cyclinder");
        Rad=radius;
        Height=height;
    }

    public double area(){
        return Math.PI*Rad*Rad*Height;
    }

    public String toString()
    {
        String result = "Cylinder with radius: " + Rad + " Height: " + Height + "\n";
        return result;
    }
}
