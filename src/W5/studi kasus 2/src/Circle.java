public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return Math.PI * (radius + radius);
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }
    public String toString() {
        return "A Circle with radius" + radius + " which is subclass of " + super.toString() ;
    }


}
