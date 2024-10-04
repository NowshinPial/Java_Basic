package learningJava;

import java.util.Scanner;

public class MathConversion {

	public static void main(String[] args) {
		
		//Write a program that takes as input a number of kilometers and prints the corresponding number of nautical miles.
		// A km represents 1/10000 of the distance between the North Pole and the equator. 
		//There are 90 degrees, containing 60 minuites of arc each, between the North Pole and the equator. 
		//A nautical mile is 1 minuite of an arc
		
		double kilometer;
		double nauticalMile;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the km that you want to convert to nautical mile: ");
		kilometer = reader.nextDouble();
		
		nauticalMile = kilometer*0.54;
		
		System.out.print("Nautical Mile of the km is: ");
		System.out.println(nauticalMile);
	}

}
