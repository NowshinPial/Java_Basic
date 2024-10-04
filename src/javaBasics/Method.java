package javaBasics;

public class Method {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 55;
		
		int sum = add(num1, num2);
		
		System.out.println("The total number is: " + sum);
		
	}
	
	private static int add(int firstNum, int secondNum) {
		
		return firstNum + secondNum;
	}

}
