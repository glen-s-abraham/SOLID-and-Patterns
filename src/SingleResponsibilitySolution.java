import java.util.Scanner;

class Pair{
	private String first;
	private String second;
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	
}


class InputProcessor{
	public static Pair process() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first number");
		String firstNumber =keyboard.nextLine();
			
		System.out.println("Enter second number");
		String secondNumber =keyboard.nextLine();
		
		keyboard.close();
		
		Pair pair = new Pair();
		pair.setFirst(firstNumber);
		pair.setSecond(secondNumber);
		
		return pair;
	}
}

class Validation{
	public static boolean isValid(Pair pair) {
		
		try {
			int firstInteger = Integer.parseInt(pair.getFirst());
		} catch (NumberFormatException e) {
			return false;
		}
		
		try {
			int secondInteger = Integer.parseInt(pair.getSecond());
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}


class Operation{
	public static int execute(int num1, int num2) {
		return num1+num2;
	}
}


public class SingleResponsibilitySolution {
	public static void main(String args[]) {
		Pair pair = InputProcessor.process();
		if(!Validation.isValid(pair)) {
			System.out.println("Invalid inputs");
			return;
		}
		int firstInteger = Integer.parseInt(pair.getFirst());
		int secondInteger = Integer.parseInt(pair.getSecond());
		int result = Operation.execute(firstInteger, secondInteger);
		System.out.println("Result after addition:"+ result);
	
	}
}
