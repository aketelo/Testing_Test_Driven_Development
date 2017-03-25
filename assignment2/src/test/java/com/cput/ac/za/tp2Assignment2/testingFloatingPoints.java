package com.cput.ac.za.tp2Assignment2;

import org.junit.Assert;
/**
 * Created by Phelokazi on 2017-03-20.
 */
public class testingFloatingPoints {
    floatingPoints newResults = new floatingPoints();

    @org.junit.Test
    public void testFloat(){
        float results = newResults.add(500.0f,15.2f);
                Assert.assertEquals(515.2000122070312,results,0.0f);
    }

}
