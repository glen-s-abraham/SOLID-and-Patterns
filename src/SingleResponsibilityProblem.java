import java.util.Scanner;

public class SingleResponsibilityProblem {

	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first number");
		String firstNumber =keyboard.nextLine();
		
		System.out.println("Enter second number");
		String secondNumber =keyboard.nextLine();
		
		keyboard.close();
		
		int firstInteger=0;
		int secondInteger=0;
		
		if(firstNumber == null) {
			System.out.println("First number not valid");
			return;
		}
		try {
			firstInteger = Integer.parseInt(firstNumber);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		if(secondNumber == null) {
			System.out.println("Second number not valid");
			return;
		}
		try {
			secondInteger = Integer.parseInt(secondNumber);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		int result = firstInteger+secondInteger;
		System.out.println("The result is: "+result);
		
	}
}
