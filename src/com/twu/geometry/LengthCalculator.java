package com.twu.geometry;
public class LengthCalculator {

    public static double getLineLength(Coordinate coordinate, Coordinate coordinate1) {
        Double length=Math.sqrt(Math.pow(coordinate.getX()-coordinate1.getX(),2.0)+Math.pow(coordinate.getY() - coordinate1.getY(), 2.0));
        return length;
    }
}
