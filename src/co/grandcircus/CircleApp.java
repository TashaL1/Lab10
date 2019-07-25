package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Circle Tester");
		String cont = "y";
		do {
			//System.out.println();
			double userInput;
			userInput = Validator.getDouble(scan, "Enter radius: ");
			Circle c = new Circle(1);
			c.setRadius(userInput);
			System.out.println(c.getRadius());
			System.out.println(c.getFormattedCircumference());
			System.out.println(c.getFormattedArea());
			//System.out.println("Continue? (y/n): ");
		
			cont = Validator.getString(scan, "Continue? (y/n)");
			
		} while (cont.equalsIgnoreCase("y"));
		System.out.println("Goodbye.");
		
		
		scan.close();
	}
	
}
 