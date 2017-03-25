package com.cput.ac.za.tp2Assignment2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by Phelokazi on 2017-03-21.
 */
public class testTruth {
    private student informatics;

    @Before
    public void setUp() throws Exception {
    informatics = new student("Anele","Informatics");

    }
    @Test
    public void truthTest() throws Exception{
        Assert.assertTrue(true);
        Assert.assertTrue(informatics.getName().equalsIgnoreCase(informatics.getName()));
    }
}