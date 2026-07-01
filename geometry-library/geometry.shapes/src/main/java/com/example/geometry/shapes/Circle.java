package com.example.geometry.shapes;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import three.dimensional.shapes.Sphere;

import java.lang.Math;

@Mojo(name = "circle")
public class Circle extends AbstractMojo {

    final double Pi = 3.14;

    @Parameter(property = "r", defaultValue = "0")
    private double radius;

    @Override
    public void execute() {
        calculateArea();

        calculatePerimeter();
    }

    private void calculateArea() {
        double s = Pi * Math.pow(radius, 2);

        System.out.printf("Area of Circle: %.2f\n", s);
    }

    private void calculatePerimeter() {
        double p = 2 * Pi * radius;

        System.out.printf("Perimeter of Circle: %.2f\n", p);
    }
}
