package com.example.geometric.shapes;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.ArrayList;
import java.util.Arrays;

@Mojo(name = "triangle")
public class Triangle extends AbstractMojo {

    @Parameter(property = "a", defaultValue = "0")
    private double sideA;

    @Parameter(property = "b", defaultValue = "0")
    private double sideB;

    @Parameter(property = "c", defaultValue = "0")
    private double sideC;

    private double semiperimeter = 0;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        calculatePerimeter();

        calculateArea();
    }

    private void calculatePerimeter() throws MojoExecutionException, MojoFailureException {
        double perimeter = sideA + sideB + sideC;

        semiperimeter = perimeter/2;

        System.out.printf("Perimeter of Triangle: %f\n", perimeter);
    }

    private void calculateArea() throws MojoExecutionException, MojoFailureException {

        if (checkRuleInequalitiesTriangle()) {
            double s = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));

            System.out.printf("Area of Triangle: %f\n", s);
        } else  {

            throw new MojoFailureException("Triangle Rule Inequalities test failed");
        }

    }

    private boolean checkRuleInequalitiesTriangle() {
        double[] smallestSides = calculateSmallestSides();

        return (smallestSides[0] + smallestSides[1]) > smallestSides[2];
    }

    private double[] calculateSmallestSides() {
        double[] sides = {sideA, sideB, sideC};
        Arrays.sort(sides);

        return new double[]{sides[0], sides[1], sides[2]};
    }
}
