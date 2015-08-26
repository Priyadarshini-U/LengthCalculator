package com.twu.geometry;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class LineTest extends TestCase {

    @Test
    public void shouldReturnZeroForLineWithSameEndPoints(){
        Assert.assertEquals(0, new Line(0, 0, 0, 0).calculateLineLength());
    }

}