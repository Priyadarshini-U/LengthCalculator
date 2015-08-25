package com.twu.geometry;

import com.twu.geometry.Coordinate;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 25/08/15.
 */
public class LengthCalculatorTest {

    @Test
    public void testcase1(){
        Double actual= LengthCalculator.getLineLength(new Coordinate(1, 1), new Coordinate(1, 1));
        Double expected=new Double(0);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testcase2(){
        Double actual= LengthCalculator.getLineLength(new Coordinate(0, 0), new Coordinate(1, 1));
        Double expected=new Double(Math.sqrt(2));
        Assert.assertEquals(expected,actual);
    }

}