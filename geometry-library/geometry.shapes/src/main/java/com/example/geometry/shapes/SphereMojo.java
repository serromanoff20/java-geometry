package com.example.geometry.shapes;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import three.dimensional.shapes.Sphere;

@Mojo(name = "sphere")
public class SphereMojo extends AbstractMojo {

    @Parameter(property = "r", defaultValue = "0")
    private double radius;

    @Override
    public void execute() {
        Sphere sphere = new Sphere(radius);

        sphere.calculateArea();

        sphere.calculateAllLength();
    }
}
