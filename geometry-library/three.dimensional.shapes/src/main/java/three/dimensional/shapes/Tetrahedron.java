package three.dimensional.shapes;

/**
 * Класс высчитывает площадь и периметр только правильного тетраэдера
 */
public class Tetrahedron {

    private final int numberTriangularSide = 6;

    private final double baseSideFace;

    public Tetrahedron(double sideA) {
        baseSideFace = sideA;
    }

    public void calculateArea() {
        double s = Math.pow(baseSideFace, 2) * Math.sqrt(3);

        System.out.printf("Area of Tetrahedron: %.2f\n", s);
    }

    public void calculatePerimeter() {
        double perimeter = numberTriangularSide * baseSideFace;

        System.out.printf("Perimeter of Tetrahedron: %.2f\n", perimeter);
    }

}
