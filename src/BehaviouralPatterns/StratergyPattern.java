package BehaviouralPatterns;

/*
 * enable selecting an algorithm at runtime
 * define a family of algorithms,put each of them into a sperate class
 * and make their objects interchangable.
 * The actual runtime code should not be locked into the code.
 * The type of a variable should be abstract.
 * we should seperate behaviours from implementation.
 * Favour composition over inheritence
*/

//abstraction
interface Stratergy{
	public int execute(int num1,int num2);
}

class Addition implements Stratergy{
	@Override
	public int execute(int num1, int num2) {
		return num1+num2;
		
	}
}

class Subtraction implements Stratergy{
	@Override
	public int execute(int num1, int num2) {
		return num1-num2;
		
	}
}

class Multiplication implements Stratergy{
	@Override
	public int execute(int num1, int num2) {
		return num1*num2;
		
	}
}

class Division implements Stratergy{
	@Override
	public int execute(int num1, int num2) {
		return num1/num2;
		
	}
}


//Implementation selection logic
//Abstract layer between high and low level modules
class OperationManager{
	
	//Use composition so the behaviour can be changed at runtime
	private Stratergy stratergy;
	public void setStratergy(Stratergy stratergy) {
		this.stratergy = stratergy;
	}
	public void execute(int num1,int num2) {
		System.out.println(this.stratergy.execute(num1, num2));
	}
	
}

public class StratergyPattern {
	public static void main(String[] args) {
		OperationManager manager = new OperationManager();
		manager.setStratergy(new Addition());
		manager.execute(20, 20);
	}
}
