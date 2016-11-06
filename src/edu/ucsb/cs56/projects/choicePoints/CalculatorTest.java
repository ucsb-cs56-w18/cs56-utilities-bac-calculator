package edu.ucsb.cs56.projects.utilities.choicePoints;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**  The test class CalculatorTest, to test the Calculator class
     @author Dominic Kirby and Hernan Duran
     @version CS56 F16
*/

public class CalculatorTest
{
    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculateBAC1()
    {
	assertEquals(0.087, Calc.BAC(true, 3, 160,false,3,2,0),.001);
    }
    
    @Test public void testCalculateBAC2()
    {
	assertEquals(.276, Calc.BAC(false,12,140,false,0,12,2), .001);
    }
    
    @Test public void testCalculateBAC3()
    {
	assertEquals(0.101, Calc.BAC(false,3,160,false,3,2,0), .001);
    }
    
    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculateBACHigherLimit()
    {
	assertEquals(.9719, Calc.BAC(true,15,200,false,20,20,20), .001);
    }

    @Test public void testCalculateBACLowerLimit()
    {
	assertEquals(0.0, Calc.BAC(false,3,140,false,0,1,0), .001);
    }
    
    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculatetBACKilograms1()
    {
	assertEquals(0.096, Calc.BAC(true,4,80,true,2,2,3), .001);
    }
    
    
    @Test public void testCalculatetBACKilograms2()
    {
	assertEquals(0.192, Calc.BAC(false,2,70,true,0,4,4), .001);
    }
    
    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculatetBACZeroCase1()
    {
	assertEquals(0.0, Calc.BAC(false,0,0,true,0,0,0), .001);
    }
    
    @Test public void testCalculatetBACZeroCase2()
    {
	assertEquals(0.0, Calc.BAC(true,0,0,true,0,0,0), .001);
    }
    
    @Test public void testCalculatetBACZeroCase3()
    {
	assertEquals(0.0, Calc.BAC(false,0,0,false,0,0,0), .001);
    }
    
    @Test public void testCalculatetBACZeroCase4()
    {
	assertEquals(0.0, Calc.BAC(true,0,0,false,0,0,0), .001);
    }
    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculatetBACZeroDrinks1()
    {
	assertEquals(0.0, Calc.BAC(true,123,234,true,0,0,0), .001);
    }
    
    @Test public void testCalculatetBACZeroDrinks2()
    {
	assertEquals(0.0, Calc.BAC(true,123,234,true,0,0,0), .001);
    }    
}
