package learningJava;

import java.util.Scanner;

public class MinInOneYear {

	public static void main(String[] args) {

		//Write a program that calculates and prints the number of minuites in a year
		
		Double min;
		Double year;
		
		
		Scanner value = new Scanner(System.in);
		
		System.out.println("Insert the number of years and hit Enter: ");
		
		year = value.nextDouble();
		
		min = (year*365)*24*60;
		
		
		System.out.println("The number of minuites in the year is equal to: "+min);
		
	}

}
