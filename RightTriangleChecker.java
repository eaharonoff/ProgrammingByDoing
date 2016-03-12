import java.util.Scanner;
public class RightTriangleChecker{

public static void sideChecker(double sideLength){
		Scanner keyboard = new Scanner (System.in);
		while (sideLength<0){
			System.out.println("The side cannot be negative!");
			System.out.println("Try again...");
			System.out.println("Side:");
			sideLength = keyboard.nextDouble();
		}

	}
	public static void main(String[]args){
		Scanner keyboard = new Scanner (System.in);
		double side1, side2, side3;

		System.out.println("Enter three integers: ");
		System.out.println("Side 1: ");
		side1 = keyboard.nextDouble();
		sideChecker(side1);
		System.out.println("Side 2: ");
		side2 = keyboard.nextDouble();

		while (side2<side1){
			System.out.println(side2 + "is smaller than " + side1 + ". Try again.");
			System.out.println("Side 2: ");
			side2 = keyboard.nextDouble();
		}
		
		System.out.println("Side 3: ");
		side3 = keyboard.nextDouble();
		while (side3<side2){
			System.out.println(side3 + "is smaller than " + side2 + ". Try again.");
			System.out.println("Side 3: ");
			side3 = keyboard.nextDouble();
		}

		System.out.println("Your three sides are "+side1+ " " +side2+" "+side3);

		double squareSide1 = Math.pow(side1,2);
		double squareSide2 = Math.pow(side2,2);
		double squareSide3 = Math.pow(side3,2);

		
		if (squareSide1 + squareSide2 == squareSide3){
			System.out.println("These sides do make a right triangle. Yippy-skippy!");
		}
		else {
			System.out.println("NO! These sides do not make a right triangle!");
		}
	}
}