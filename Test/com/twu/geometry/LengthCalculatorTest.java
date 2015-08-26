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



}