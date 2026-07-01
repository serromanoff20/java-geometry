package three.dimensional.shapes;

public class Parallelepiped {

    private final double lengthParallelepiped;

    private final double widthParallelepiped;

    private final double heightParallelepiped;

    public Parallelepiped(double length, double  width, double  height) {
        this.lengthParallelepiped = length;
        this.widthParallelepiped = width;
        this.heightParallelepiped = height;
    }

    public void calculateArea() {
        double s = 2 * (
                lengthParallelepiped * widthParallelepiped +
                widthParallelepiped * heightParallelepiped +
                heightParallelepiped * lengthParallelepiped);

        System.out.printf("Area of Parallelepiped: %.2f\n", s);
    }

    public void calculateAllLength() {
        double l = 4 * (lengthParallelepiped + widthParallelepiped + heightParallelepiped);

        System.out.printf("Sum lengths all sides of Parallelepiped: %.2f\n", l);
    }

}
