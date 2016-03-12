import java.util.Scanner;
	public class BMI2
	{
		public static void main ( String [] args )
		{	Scanner keyboard = new Scanner (System.in);
				System.out.println("Your height in inches:");
				double height = keyboard.nextDouble();
				System.out.println("Your weight in lbs:");
				double weight = keyboard.nextDouble();
				double bmi = ( weight / (height * height ) ) * 703.0;
				System.out.println ("Your BMI is: " + bmi);

				if (bmi < 15.0)
				{
					System.out.println("BMI category: very severly underweight");
				}

				if (bmi >= 15.0 && bmi <= 16.0)
				{
					System.out.println("BMI category: severly underweight");
				}
				if (bmi >= 16.1 && bmi <= 18.4)
				{
					System.out.println("BMI category: underweight");
				}
				if(bmi >= 18.5 && bmi<=24.9)
				{
					System.out.println("BMI category: normal weight");
				}
				if (bmi >= 25.0 && bmi <= 29.9)
				{
					System.out.println("BMI category: Overweight");
				
				}
				if (bmi >= 30 && bmi <= 34.9)
				{
					System.out.println("BMI category: moderately obese");
				}
				if (bmi >= 35.0 && bmi <= 39.9)
				{
					System.out.println("BMI category: severely obese");
				}
				if (bmi >= 40)
				{
					System.out.println("BMI category: morbidly obese");
				}
				
		}//main
	}//class