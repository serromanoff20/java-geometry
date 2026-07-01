package three.dimensional.shapes;

public class Sphere {

    final double Pi = 3.14;

    private final double radiusSphere;

    public Sphere(double radius) {
        this.radiusSphere = radius;
    }

    public void calculateArea() {
        double s = 4 * Pi * Math.pow(this.radiusSphere, 2);

        System.out.printf("Area of Sphere: %.2f\n", s);
    }

    public void calculateAllLength() {
        double l = 2 * Pi * radiusSphere;

        System.out.printf("Length of the equator of Sphere: %.2f\n", l);
    }
}
