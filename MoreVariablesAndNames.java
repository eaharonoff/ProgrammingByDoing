public class MoreVariablesAndNames
	{
		public static void main ( String [] args )
		{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		double myHeightcm, myWeightkg;

		myName= "Emanuel A. Aharonoff";
		myAge= 24; //woh?
		myHeight= 67; // inches
		myWeight= 147; // lbs.
		myEyes= "Brown";
		myTeeth= "White";//I hope
		myHair= "Black";
		myHeightcm= myHeight * 2.54 ;
		myWeightkg= myWeight * 0.45;

		System.out.println (" Let's talk about " + myName + "." );
		System.out.println (" He's " + myAge + " years old. " );
		System.out.println (" He weighs " + myWeight +" pounds. " );
		System.out.println (" He is " + myHeight +" inches tall. " );
		System.out.println (" He's got " + myEyes + " eyes and " + myHair + " hair. " );
		System.out.println (" His teeth are usually " + myTeeth + " depending on the coffee.");
		System.out.println (" If I add " + myAge + "," + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");
		System.out.println (" My weight would be " + myWeightkg + "kg" + " in Kilograms. " );
		System.out.println (" My height would be  " + myHeightcm + "cm" +" in centimeters. " );
		}
	}