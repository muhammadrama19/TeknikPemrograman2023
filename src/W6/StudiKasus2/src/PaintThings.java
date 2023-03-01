import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Rectangle deck = new Rectangle(10.5, 80.1);
        Sphere bigBall = new Sphere(12.5);
        Cylinder tank= new Cylinder(10, 12); 

        double deckAmt=paint.amount(deck), ballAmt = paint.amount(bigBall), tankAmt=paint.amount(tank);

        DecimalFormat frmt = new DecimalFormat("0.#");

        System.out.println("\nNumber of gallons of paint needed...");;
        System.out.println("Deck "+frmt.format(deckAmt));
        System.out.println("Big  ball "+frmt.format(ballAmt));
        System.out.println("Tank "+ frmt.format(tankAmt));
        
    }
}
