package edu.ucsb.cs56.S12.ramonrovirosa.choicePoints;

/** Calculator for BAC
 @author Shervin Shaikh and Ramon Rovirosa
 @version 05/11/2012 for choice points

 @author Raghav Raju and Nick Poon
 @version W15 for lab07

*/

public final class Calc{


    /**
       Constructor 
    */
    private Calc(){}



    /** 
	Calculates the Blood Alcohol Content from the parameters given through the constructor
	@param isMale whether or not the user is male
	@param hours # of hours the user has been drinking
	@param weight the user's weight
	@param isKilograms whether or not the user specified their weight in kilograms
	@param beer number of beers drank
	@param wine glasses of wine drank
	@param hardLiquor number of hard liquor shots taken
	@return BAC Blood Alcohol Concentration for the specific inputted values
    */
    public static double BAC(boolean isMale, int hours, int weight, boolean isKilograms, int beer, int wine, int hardLiquor){
	//assigns the proper gender distribution ratio according to the gender
	double genderDistRatio = isMale ? .73 : .66;
	
	//finds the number of liquid ounces of alcohol consumed by the person
	double liquidOunces = (beer*.6)+(wine*.6)+(hardLiquor*.5);
	
	//calculates the Blood Alcohol Concentration with the given values
	double bac = 0.0;
	if(isKilograms) { bac = (liquidOunces*5.14)/((weight*2.2046)*genderDistRatio)-(hours*.015); }
	else { bac = (liquidOunces*5.14)/(weight*genderDistRatio)-(hours*.015); } 
	if(bac > 0){ return bac;}
	else if(bac > 1){ return 1.0;}
	return 0.0;
    }
}