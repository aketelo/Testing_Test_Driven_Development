package com.cput.ac.za.tp2Assignment2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by Phelokazi on 2017-03-21.
 */
public class testNullness {
    private student informatics;

    @Before
    public void seUp() throws Exception{
        informatics = new student("Anele","Informatics");
    }

    @Test
    public void testNullness() throws Exception{
        informatics = null;
        Assert.assertNull(informatics);
    }
}
