package edu.ucsb.cs56.S12.ramonrovirosa.choicePoints;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
   The test class CalculatorTest, to test the Calculator class

   @author Shervin Shaikh and Ramon Rovirosa
*/

public class CalculatorTest
{
    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculateBAC1()
    {
	assertEquals(0.087, Calc.BAC(true, 3, 160,3,2,0),.001);
    }

    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculateBAC2()
    {
	assertEquals(.276, Calc.BAC(false,12,140,0,12,2), .001);
    }


    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculateBAC3()
    {
	assertEquals(0.101, Calc.BAC(false,3,160,3,2,0), .001);
    }

    /**
       test CalculateBAC
       @see Calculator#CalculateBAC
    */
    @Test public void testCalculateBACHigherLimit()
    {
	assertEquals(.9719, Calc.BAC(true,15,200,20,20,20), .001);
    }

    @Test public void testCalculateBACLowerLimit()
    {
	assertEquals(0.0, Calc.BAC(false,3,140,0,1,0), .001);
    }
}
