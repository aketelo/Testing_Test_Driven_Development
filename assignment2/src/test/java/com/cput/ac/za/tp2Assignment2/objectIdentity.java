package com.cput.ac.za.tp2Assignment2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by Phelokazi on 2017-03-21.
 */
public class objectIdentity {

    private lecturer prof;
    private student informatics;
    private student business;

    @Before
    public void setUp() throws Exception{
        prof = new lecturer("John","Information Technology");
        informatics = new student("Anele","Informatics");
        business = new student("Joi","Business");
    }

    @Test
    public void testObjectIdentity() throws Exception{
        Assert.assertSame(informatics,informatics);
        Assert.assertNotSame(business,prof);
    }
}
