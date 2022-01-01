package CreationalPatterns;

enum AnimalType{
	DOG,CAT,TIGER,LION;
}

interface Animal{
	public void eat();
}

class Dog implements Animal{
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
}

class Cat implements Animal{
	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}
}

class Tiger implements Animal{
	@Override
	public void eat() {
		System.out.println("Tiger is eating");
	}
}

class Lion implements Animal{
	@Override
	public void eat() {
		System.out.println("Lion is eating");
	}
}

//Creates and returns an object of a specified class
class AnimalFactory{
	public static Animal getAnimal(AnimalType type) {
		if(type ==AnimalType.CAT)
			return new Cat();
		else if(type ==AnimalType.DOG)
			return new Dog();
		else if(type ==AnimalType.TIGER)
			return new Tiger();
		else if(type ==AnimalType.LION)
			return new Lion();
		return null;
	}
}


public class Factory {
	public static void main(String args[]) {
		Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
		animal.eat();
	}
}
