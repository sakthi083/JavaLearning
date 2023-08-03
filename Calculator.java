package javachallenge;

public class Calculator {

	public static void main(String[] args) {
		//		1.Create a class called Calculator
		//	    2.Create 3 methods
		//	        - addThreeNumbers(3 int arguments) and return the value
		//	        - subtwoNumbers(1 int arguments,1 float argument) and return the value
		//	        - divide twoNumbers(2 int arguments)
		//	    3.Create a main method and create an object for the class and access all the method
		//	    4.Finall,print them in the console

		Calculator obj = new Calculator();
		System.out.println(obj.add(2, 3, 5));
		System.out.println(obj.subtract(5, 3));
		System.out.println(obj.divide(10, 2));
		
	}

	public int add(int a, int b, int c) {
		int result = a+b+c;
		return result;

	}

	public int subtract(int a, int b) {
		int result = a-b;
		return result;

	}
	
	public int divide(int a, int b) {
		int result = a/b;
		return result;

	}
}
