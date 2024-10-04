package learningJava;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		/*Write a program that computes a person's income tax
		 * Here, there is a flat tax rate of 20%
		 * There is a $10,000 standard deduction
		 * There is a $2000 additional deduction for each dependent
		 * Gross income must be entered to the nearest penny
		 * The income tax is expressed as decimal number
		 */
	
		Scanner reader = new Scanner(System.in);
		
		
		//constants
		final double TAX_RATE = 0.20;
		final double STANDARD_DEDUCTION = 10000.00;
		final double DEPENDENT_DEDUCTION=2000.00;
		
		
		int dependents;
		double taxableIncome;
		double income;
		double incomeTax;
		
		//Request input
		System.out.println("Please insert your gross income and hit Enter: ");
		income = reader.nextDouble();
		
		System.out.println("Please enter your number of dependents: ");
		dependents = reader.nextInt();
		
		//Compute the income tax
		taxableIncome = income - STANDARD_DEDUCTION - (DEPENDENT_DEDUCTION * dependents);
		incomeTax = taxableIncome*TAX_RATE;
		
		//Print out the income tax
		System.out.println("Your total incomeTax is: "+incomeTax);
	}

}
