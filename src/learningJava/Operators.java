package learningJava;

public class Operators {
	
	public static void main(String[] args) {
		
/*Assuming that x is 4.5 and y is 2. Write the values of the following expressions:
 * a. x/y
 * b. y/x
 * c. x%y
 * 
 */
		
		double x =4.5;
		int y = 2;
		
		
		double division = x/y;
		double division2 = y/x;
		double percentage = x%y;
		
		System.out.println("The value of division is: "+ division);
		System.out.println("The value of division2 is: "+ division2);
		System.out.println("The value of percentage is "+ percentage);
		
//Assume that a refers to "wizard" and b refers to the word "java" =. Write the values of the following expression. 
		
		String a = "wizard";
		String b = "java";
		
		int lengthX = a.length();
		int lengthY = b.length();
		
		int sum = lengthX + lengthY;
		
		System.out.println ("The number of characters in the word wizard is: \n" + lengthX + "\nThe number of characters in the word java is:\n" + lengthY);
		
		
	
	}

}
