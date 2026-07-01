package com.example.geometry.shapes;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import three.dimensional.shapes.Tetrahedron;

@Mojo(name = "tetrahedron")
public class TetrahedronMojo extends AbstractMojo {

    /**
     * Длина ребра тетрадера
     */
    @Parameter(property = "a", defaultValue = "0.00")
    private double sideA;

    @Override
    public void execute() {
        Tetrahedron tetrahedron = new Tetrahedron(sideA);

        tetrahedron.calculateArea();

        tetrahedron.calculatePerimeter();
    }
}
