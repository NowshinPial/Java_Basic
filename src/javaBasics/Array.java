package javaBasics;

public class Array {

	public static void main(String[] args) {

		//Array is just using one variable to store multiple values
		//Array always starts from 0
		
		//Array can be written in 2 different ways
		
		String[] cars = new String[4] ;
		
		cars[0]="Toyota";
		cars[1]="Honad";
		cars[2]="Cheverlet";
		
		//Simpler way to write arrays would be
		
		String[] colors= {"red", "blue", "green", "pink"};
		
		//this is a for loop that will print out all the colors one after one staring from first
		for (int i=0; i<colors.length; i++) {
			System.out.println(colors[i]);
		}
		
		//this is a for loop that will print out all the cars starting from last
		for (int i=cars.length - 1; i <= 0; i--) {
			System.out.println(cars[i]);
		}
		
		//this is a simpler version of for loop that will print out all the values in cars starting from first
		
		for (String car : cars) {
			System.out.println(car);
		}
	}

}
