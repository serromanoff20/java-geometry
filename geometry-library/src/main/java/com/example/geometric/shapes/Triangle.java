package com.example.geometric.shapes;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

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
        double s = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));

        System.out.printf("Area of Triangle: %f\n", s);
    }
}
