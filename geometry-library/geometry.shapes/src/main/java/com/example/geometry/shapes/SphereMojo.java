package com.example.geometry.shapes;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import three.dimensional.shapes.Sphere;

@Mojo(name = "sphere")
public class SphereMojo extends AbstractMojo {

    @Parameter(property = "3d", defaultValue = "false")
    private boolean treeD;

    @Override
    public void execute() {
        Sphere.calculateArea();

        Sphere.calculatePerimeter();
    }
}
