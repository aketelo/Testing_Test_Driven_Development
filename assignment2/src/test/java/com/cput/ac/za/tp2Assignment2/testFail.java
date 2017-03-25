package com.cput.ac.za.tp2Assignment2;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Phelokazi on 2017-03-21.
 */
public class testFail {

    @Test
    public void failingTest() throws Exception{
        Assert.assertTrue(!true);
        Assert.assertFalse(10>5);
    }
}
