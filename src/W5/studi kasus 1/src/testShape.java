public class testShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1); // prints "A Shape with color of green and filled"

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2); // prints "A Shape with color of red and Not filled"

        shape1.setColor("blue");
        shape1.setFilled(false);
        System.out.println(shape1); // prints "A Shape with color of blue and Not filled"
    }
}
