package com.cput.ac.za.tp2Assignment2;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
/**
 * Created by Phelokazi on 2017-03-21.
 */
public class testArrayContent {

    @Test
    public void testArrayMethod() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<list.size(); i++) Assert.assertNull(list.indexOf(i));
    }

}
