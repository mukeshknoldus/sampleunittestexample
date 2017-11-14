package com.knoldus;

/**
 * Created by knoldus on 13/11/17.
 */
import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Tested;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class MathTest {
    // @Tested annotation is used to define which class is to bbe tested
    @Tested
    private Math math;
    
    //@Mocked annotaion is used to tell which class is to be mocked here to test a class individually.
    @Mocked
    DataProvider dataProvider;
    
    // Behavour based testing using JMockit Expectations
    @Test
    public void mathTestPublicMethod(){
        // new Expectations is used to tell what should be the behaviour of
        new Expectations(){
            //DataProvider dataProvider;
            {
                /*int abc =*/ dataProvider.retieveData();
                //System.out.println(abc);
                returns(5);
        }
       
        };
        int val = math.add();
        //System.out.println(val);
        
        assertEquals("this should be 5+5=10",10,val);
       // assertEquals("this should be ",10,val2);
    }
    
    @Test
    public void mathTestPrivateMethod(){
       new Expectations(){
            //DataProvider dataProvider;
            {
                /*int abc =*/ dataProvider.retieveData();
                returns(5);
            }};
        int val2 = Deencapsulation.invoke(math,"multi");
        assertEquals("this should be 5*5=25",25,val2);
    }
    
    //assertEquals("this should be 5+5=10",10,val2);
}
