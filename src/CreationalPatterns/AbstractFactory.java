package CreationalPatterns;

interface Car{
	public void assemble();
}

class ElectricToyota implements Car{
	@Override
	public void assemble() {
		System.out.println("Assebled Electric Toyota");
		
	}
}

class ElectricFord implements Car{
	@Override
	public void assemble() {
		System.out.println("Assebled Electric Ford");
		
	}
}

class PetrolToyota implements Car{
	@Override
	public void assemble() {
		System.out.println("Assebled Petrol Toyota");
		
	}
}

class PetrolFord implements Car{
	@Override
	public void assemble() {
		System.out.println("Assebled Petrol Ford");
		
	}
}

interface AbstractCarFactory{
	public Car getCar(String type);
}

class ElectricCarFactory implements AbstractCarFactory{
	@Override
	public Car getCar(String type) {
		
		if(type.equals("FORD"))
			return new ElectricFord();
		else if(type.equals("TOYOTA"))
			return new ElectricToyota();
		return null;
	}
}

class PetrolCarFactory implements AbstractCarFactory{
	@Override
	public Car getCar(String type) {
		
		if(type.equals("FORD"))
			return new PetrolFord();
		else if(type.equals("TOYOTA"))
			return new PetrolToyota();
		return null;
	}
}

class FactoryProducer{
	public static AbstractCarFactory getFactory(String factoryType) {
		if(factoryType.equals("ELECTRIC"))
			return new ElectricCarFactory();
		else if(factoryType.equals("PETROL"))
			return new PetrolCarFactory();
		return null;
	}
}

public class AbstractFactory {
	public static void main(String args[]) {
		AbstractCarFactory electricCarFactory = FactoryProducer.getFactory("ELECTRIC");
		Car electricFord = electricCarFactory.getCar("FORD");
		electricFord.assemble();
	}
}
