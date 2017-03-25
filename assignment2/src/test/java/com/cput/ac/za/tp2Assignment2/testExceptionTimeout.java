package com.cput.ac.za.tp2Assignment2;
import org.junit.Test;
/**
 * Created by Phelokazi on 2017-03-21.
 */
public class testExceptionTimeout {
    @Test(timeout = 11)
    public void testTimeout() throws Exception{
        while(true){
            System.out.close();
        }
    }
}
