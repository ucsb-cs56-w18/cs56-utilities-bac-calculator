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
	assertEquals(0.095, Calc.BAC(true, 3, 160,false,3,.055,2,.12,0,.55)
		     ,.001);
    }
    
    @Test public void testCalculateBAC2()
    {
	assertEquals(.282, Calc.BAC(false,12,140,false,0,0,12,.12,2,.37)
		     , .001);
    }
    
    @Test public void testCalculateBAC3()
    {
	assertEquals(0.045, Calc.BAC(false,3,160,true,3,.069,2,.16,0,.56
				     ), .001);
    }
    
    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculateBACHigherLimit()
    {
	assertEquals(.968, Calc.BAC(true,15,200,false,20,.05,20,.12,20,.33)
		     , .001);
    }

    @Test public void testCalculateBACLowerLimit()
    {
	assertEquals(0.0, Calc.BAC(false,3,140,false,0,0,1,.12,0,0), .001);
    }
    
    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculatetBACKilograms1()
    {
	assertEquals(0.111, Calc.BAC(true,4,80,true,2,.05,2,.15,3,.35)
		     , .001);
    }
    
    
    /*    @Test public void testCalculatetBACKilograms2()
    {
	assertEquals(0.192, Calc.BAC(false,2,70,true,0,4,4)
		     , .001);
		     }*/
    
    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculatetBACZeroCase1()
    {
	assertEquals(0.0, Calc.BAC(false,0,0,true,0,0,0,0,0,0)
		     , .001);
    }
    
    @Test public void testCalculatetBACZeroCase2()
    {
	assertEquals(0.0, Calc.BAC(true,0,0,true,0,.05,0,.15,0,.35)
		     , .001);
    }
    
    @Test public void testCalculatetBACZeroCase3()
    {
	assertEquals(0.0, Calc.BAC(false,0,0,false,0,0,0,0,0,0)
		     , .001);
    }
    
    @Test public void testCalculatetBACZeroCase4()
    {
	assertEquals(0.0, Calc.BAC(true,0,0,false,0,.045,0,.16,0,.54)
		     , .001);
    }
    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculatetBACZeroDrinks1()
    {
	assertEquals(0.0, Calc.BAC(true,123,234,true,0,0,0,0,0,0), .001);
    }
    
    @Test public void testCalculatetBACZeroDrinks2()
    {
	assertEquals(0.0, Calc.BAC(true,123,234,true,0,.05,0,.14,0,.44), .001);
    }    
}
