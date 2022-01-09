package StructuralPatterns;
/*
 * there are several incompatrible classes and interfaces in s/e
 * because of legacy code and frequently changing api
 * The adapter pattern allows objects with incompatible interfaces 
 * to collaborate and  work together it's often used to make existing classes 
 * work with other classes without modifying their code.
 */
interface Vehicle{
	public void accelerate();
}

class Car implements Vehicle{
	@Override
	public void accelerate() {
		System.out.println("Car is accelerating...");
	};
}

class Bus implements Vehicle{
	@Override
	public void accelerate() {
		System.out.println("Bus is accelerating...");
	};
}
class Bicycle{
	public void go() {
		System.out.println("Using Bicycle...");

	}
}

class BicycleAdapter implements Vehicle{
	public Bicycle bicycle;
	public BicycleAdapter(Bicycle bicycle) {
		this.bicycle=bicycle;
	}
	public void accelerate() {
		this.bicycle.go();
	};
}

public class AdapterPattern {
	public static void main(String[] args) {
		Vehicle bus = new Bus();
		Vehicle car = new Car();
		Vehicle bicycle = new BicycleAdapter(new Bicycle());
		bus.accelerate();
		car.accelerate();
		bicycle.accelerate();
	}

	
	
}
