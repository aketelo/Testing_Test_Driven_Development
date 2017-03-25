package com.cput.ac.za.tp2Assignment2;
/**
 * Created by Phelokazi on 2017-03-20.
 */
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class testIntegers {

    @org.junit.Test
    public void testInt(){
        integers newInt = new integers(1);
        assertEquals(1, newInt.getNumber());
    }
    @org.junit.Test
    public void testCase2() {
        integers item = new integers(2);
        assertEquals(2, item.getNumber());
    }

}
