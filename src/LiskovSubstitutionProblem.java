//class Vehicle{
//	protected String type;
//	protected int age;
//	public Vehicle(String type, int age) {
//		this.type = type;
//		this.age = age;
//	}
//	
//	protected void speedUp() {
//		System.out.println("Vehicle is speeding up");
//	}
//	
//	protected void slowDown() {
//		System.out.println("Vehicle is slowing up");
//	}
//	
//	protected void fuel() {
//		System.out.println("Vehicle fuel method");
//	}
//}
//
//class PetrolCar extends Vehicle{
//
//	public PetrolCar(String type, int age) {
//		super(type, age);
//	}
//	
//	@Override
//	protected void speedUp() {
//		System.out.println("Car is speeding up");
//	}
//	
//	@Override
//	protected void slowDown() {
//		System.out.println("Car is slowing up");
//	}
//	
//	@Override
//	protected void fuel() {
//		System.out.println("Car fuel method");
//	}
//	
//}
//
//
//class ElectricCar extends Vehicle{
//
//	public ElectricCar(String type, int age) {
//		super(type, age);
//	}
//	
//	@Override
//	protected void speedUp() {
//		System.out.println("Electric Car is speeding up");
//	}
//	
//	@Override
//	protected void slowDown() {
//		System.out.println("Electric Car is slowing up");
//	}
//	
//	@Override
//	protected void fuel() {
//		throw new Error("Electric car cannot be fueled");
//	}
//	
//}
//
//public class LiskovSubstitutionProblem {
//	public static void main(String args[]) {
//		Vehicle v = new Vehicle("Ford",6);
//		v.speedUp();
//		v.slowDown();
//		v.fuel();
//		
//		v = new PetrolCar("Ford",6);
//		v.speedUp();
//		v.slowDown();
//		v.fuel();
//		
//		v= new ElectricCar("Tesla", 6);
//		v.speedUp();
//		v.slowDown();
//		//breaks the liskow substitution principle of a supercalss
//		//being substituted by a subclass without breaking the code
//		v.fuel(); 
//	}
//}
