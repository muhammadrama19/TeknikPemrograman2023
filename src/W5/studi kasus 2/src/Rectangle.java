public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea()
    {
        return width*length;
    }

    public double getPerimeter(){
        return (2*width)+(2*length);
    }

    public Rectangle(){
        this.length=1.0;
        this.width=1.0;
    }

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public String toString() { // in Cylinder class
        return "Rectangle width " + width + " length" + length + "which sublass of " + super.toString();
       }

    public static void main(String[] args) {
        
    }


    

    


}
