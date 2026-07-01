package com.example.geometry.shapes;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import com.example.geometry.utils.TriangleUtils;

@Mojo(name = "triangle")
public class Triangle extends AbstractMojo {

    @Parameter(property = "a", defaultValue = "0.00")
    private double sideA;

    @Parameter(property = "b", defaultValue = "0.00")
    private double sideB;

    @Parameter(property = "c", defaultValue = "0.00")
    private double sideC;

    @Parameter(property = "h", defaultValue = "0.00")
    private double height;

    private double semiperimeter = 0.00;

    @Override
    public void execute() throws MojoFailureException {
        if (sideA != 0.00 && sideB != 0.00 && sideC != 0.00) {
            System.out.println("Calculate by sides");

            calculatePerimeterBySides();

            calculateArea();
        } else if (height != 0.00) {
            System.out.println("Calculate by base side and height");

            double baseSide = defineBaseSide();

            calculatePerimeterByBaseAndHeight(baseSide);

            calculateAreaByBaseAndHeight(baseSide);
        } else {

            throw new MojoFailureException("Not Need Parameters!");
        }

    }

    private void calculatePerimeterBySides() {
        double perimeter = sideA + sideB + sideC;

        semiperimeter = perimeter/2;

        System.out.printf("Perimeter of Triangle: %.2f\n", perimeter);
    }

    private double defineBaseSide() {
        double[] sides = TriangleUtils.calculateSmallestSides(sideA, sideB, sideC);

        return sides[2];
    }

    private void calculatePerimeterByBaseAndHeight(double baseSide) {
        double sideByPythagoreanTheorem = TriangleUtils.calculateSideByPythagoreanTheorem(baseSide, height);

        double perimeter = 2 * sideByPythagoreanTheorem + baseSide;

        System.out.printf("Perimeter of Triangle: %.2f\n", perimeter);
    }

    private void calculateAreaByBaseAndHeight(double baseSide) {
        double s = 0.5 * baseSide * height;

        System.out.printf("Area of Triangle: %.2f\n", s);
    }

    private void calculateArea() throws MojoFailureException {

        if (TriangleUtils.checkRuleInequalitiesTriangle(sideA, sideB, sideC)) {
            double s = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));

            System.out.printf("Area of Triangle: %.2f\n", s);
        } else  {

            throw new MojoFailureException("Triangle Rule Inequalities test failed");
        }

    }
}
