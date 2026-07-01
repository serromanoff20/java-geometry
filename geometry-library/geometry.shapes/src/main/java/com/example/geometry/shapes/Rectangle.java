package com.example.geometry.shapes;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "rectangle")
public class Rectangle extends AbstractMojo {

    @Parameter(property = "h", defaultValue = "0")
    private double height;

    @Parameter(property = "w", defaultValue = "0")
    private double width;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        calculateArea();

        calculatePerimeter();
    }

    private void calculateArea() {
        double s = height * width;

        System.out.printf("Area of Rectangle: %.2f\n", s);
    }

    private void calculatePerimeter() {
        double p = 2 * (width + height);

        System.out.printf("Perimeter of Rectangle: %.2f\n", p);
    }
}
