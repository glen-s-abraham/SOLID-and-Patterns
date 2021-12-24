//Implement all the concrete functions
//make the changeable function abstract and override them in child classes

abstract class  Vehicle{
	protected String type;
	protected int age;
	public Vehicle(String type, int age) {
		this.type = type;
		this.age = age;
	}
	
	protected void speedUp() {
		System.out.println("Vehicle is speeding up");
	}
	
	protected void slowDown() {
		System.out.println("Vehicle is slowing up");
	}
	
	protected abstract void fuel();
}

class PetrolCar extends Vehicle{

	public PetrolCar(String type, int age) {
		super(type, age);
	}
	
	@Override
	protected void speedUp() {
		System.out.println("Car is speeding up");
	}
	
	@Override
	protected void slowDown() {
		System.out.println("Car is slowing up");
	}
	
	@Override
	protected void fuel() {
		System.out.println("Car fuel method");
	}
	
}


class ElectricCar extends Vehicle{

	public ElectricCar(String type, int age) {
		super(type, age);
	}
	
	@Override
	protected void speedUp() {
		System.out.println("Electric Car is speeding up");
	}
	
	@Override
	protected void slowDown() {
		System.out.println("Electric Car is slowing up");
	}
	
	@Override
	protected void fuel() {
		System.out.println("Electric car is being charged");
	}
	
}

public class LiskovSubstitutionSolution {
	public static void main(String args[]) {
		
		
		Vehicle v = new PetrolCar("Ford",6);
		v.speedUp();
		v.slowDown();
		v.fuel();
		
		v= new ElectricCar("Tesla", 6);
		v.speedUp();
		v.slowDown();
		v.fuel(); 
	}
}


