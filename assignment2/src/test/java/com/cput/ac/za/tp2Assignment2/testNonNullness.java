package com.cput.ac.za.tp2Assignment2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by Phelokazi on 2017-03-21.
 */
public class testNonNullness {
    private lecturer lect;

    @Before
    public void setUp() throws Exception{
        lect = new lecturer("John","Business");
    }

    @Test
    public void testNonNullnessObject() throws Exception{
        Assert.assertNotNull(lect);
    }
}
