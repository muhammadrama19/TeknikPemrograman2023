public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double Length, double Width){
        super("Rectangle");
        this.length=Length;
       this.width=Width;
    }

    public double area(){
        return width*length;
    }

    public String toString(){
        return super.toString() + " with width "+ width + " with length " + length;
    }
    
}
