package com.twu.geometry;

import com.twu.geometry.Coordinate;
import org.junit.Assert;
import org.junit.Test;


public class LengthCalculatorTest {

    @Test
    public void shouldReturnLength0ForSameEndPoints() {
        Double actual = LengthCalculator.getLineLength(new Coordinate(1, 1), new Coordinate(1, 1));
        Double expected = new Double(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnActualLengthforEndPoints0N0and1N1() {
        Double actual = LengthCalculator.getLineLength(new Coordinate(0, 0), new Coordinate(1, 1));
        Double expected = new Double(Math.sqrt(2));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnActualLengthforEndPoints_1N_1and2N1() {
        Double actual = LengthCalculator.getLineLength(new Coordinate(-1, -1), new Coordinate(2, 1));
        Double expected = new Double(Math.sqrt(13));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnActualLengthforEndPoints1N1and_2N_1() {
        Double actual = LengthCalculator.getLineLength(new Coordinate(1, 1), new Coordinate(-2, -1));
        Double expected = new Double(Math.sqrt(13));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnActualLengthforEndPoints_1N_1and_2N_1() {
        Double actual = LengthCalculator.getLineLength(new Coordinate(-1, -1), new Coordinate(-2, -1));
        Double expected = new Double(Math.sqrt(1));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnActualLengthforEndPointsWithDecimalValues() {
        Double actual = LengthCalculator.getLineLength(new Coordinate(1.1F, 1F), new Coordinate(-2.3F, -1F));
        Double expected = new Double(Math.sqrt(15.56));
        Assert.assertEquals(expected, actual,0.2);
    }


}