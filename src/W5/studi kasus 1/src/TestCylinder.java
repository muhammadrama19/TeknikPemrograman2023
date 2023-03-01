public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder 1:\n" + cylinder1.toString());
        System.out.println("Volume: " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(5.0);
        System.out.println("\nCylinder 2:\n" + cylinder2.toString());
        System.out.println("Volume: " + cylinder2.getVolume());

        Cylinder cylinder3 = new Cylinder(3.0, "red", 8.0, true);
        System.out.println("\nCylinder 3:\n" + cylinder3.toString());
        System.out.println("Volume: " + cylinder3.getVolume());
    }
}
