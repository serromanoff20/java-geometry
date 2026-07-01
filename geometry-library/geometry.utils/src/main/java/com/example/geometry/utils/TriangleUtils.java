package com.example.geometry.utils;

import java.util.Arrays;

public class TriangleUtils {

    public static boolean checkRuleInequalitiesTriangle(double a, double b, double c) {
        double[] smallestSides = calculateSmallestSides(a, b, c);

        return (smallestSides[0] + smallestSides[1]) > smallestSides[2];
    }

    private static double[] calculateSmallestSides(double a, double b, double c) {
        double[] sides = {a, b, c};
        Arrays.sort(sides);

        return new double[]{sides[0], sides[1], sides[2]};
    }

}
