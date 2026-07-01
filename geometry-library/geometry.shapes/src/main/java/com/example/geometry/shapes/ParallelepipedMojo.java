package com.example.geometry.shapes;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import three.dimensional.shapes.Parallelepiped;

@Mojo(name = "parallelepiped")
public class ParallelepipedMojo extends AbstractMojo {

    @Parameter(property = "l", defaultValue = "0")
    private double length;

    @Parameter(property = "w", defaultValue = "0")
    private double width;

    @Parameter(property = "h", defaultValue = "0")
    private double height;

    @Override
    public void execute() {
        Parallelepiped parallelepiped = new Parallelepiped(length, width, height);

        parallelepiped.calculateArea();

        parallelepiped.calculateAllLength();
    }
}
