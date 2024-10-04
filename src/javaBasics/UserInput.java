package javaBasics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner askUser = new Scanner(System.in);
		
		String name;
		int age;
		float shoeSize;
		
		
		System.out.println("Hi! What is your name?");
		name = askUser.nextLine();
		
		System.out.println("Hi! "+ name);
		
		System.out.println("What is your age?");
		age = askUser.nextInt();
		
		System.out.println("What is your shoeSize?");
		shoeSize = askUser.nextFloat();
		
		System.out.println("Thank you! "+name+"\nYour age is: "+age+"\nyour shoe size is: "+shoeSize);
		
		
		
		
		
	
		
		
	}

}
