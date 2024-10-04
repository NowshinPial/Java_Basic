package javaBasics;

public class LogicalOpperator {

	public static void main(String[] args) {

		//There are 3 types of Logical operator in Java, And, Or, Equal to
		// Or = ||
		// And = &&
		// Equal to = ==
		
		int age1 = 18;
		int age2 = 24;
		int age3 = 55;
		
	//Or operator example	
	if (age1 <= 18 || age2 <= 18 || age3 <= 18) {
		System.out.println("This person is NOT ready to vote");
	}
	
	else {
		System.out.println("This person can vote");
	}
	
	//And operator example	
		if (age1 >= 21 && age2 >= 21 || age3 >= 21) {
			System.out.println("This person can go to the Bar");
		}
		
		else {
			System.out.println("This person can NOT go to Bar");
		}
		
	//Equal to operator example	
				if (age1 == 18 && age2 == 18 || age3 == 18) {
					System.out.println("This person is 18");
				}
				
				else {
					System.out.println("This person is NOT 18");
				}

	
	//Example of not equal to
	
	if (age1 != age2) {
		System.out.println("This users are not the same age");
	}
	else {
		System.out.println("This users are of the same age");
	}
}
}
