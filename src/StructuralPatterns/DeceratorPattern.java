package StructuralPatterns;
/*
 * We would like to add one or more behaviours dynamically.
 * we can use inheritence to change the behaviour of a given component
 * the main problem with inheritence is that it's static
 * we cannot change the behaviours at runtime
 * with the decorator pattern we can attach additional responsibilities to an object dynamicaly
 * decorators provide a flexible alternative to subclassing and for extending functionality
 */

interface Beverage{
	public int getCost();
	public String getDescription();
}

abstract class BeverageDecorator implements Beverage{
	
	protected Beverage beverage;
	
	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost();
	};
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription();
	};
	
}

class Milk extends BeverageDecorator{
	
	private Beverage beverage;
	public Milk(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}
	
	@Override
	public int getCost() {
		return this.beverage.getCost()+3;
	};
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " Milk ";
	};
	
}

class PlainBeverage implements Beverage{
	
	@Override
	public int getCost() {
		return 5;
	};
	
	@Override
	public String getDescription() {
		return "Plain Beverage";
	};
	
}

class Sugar extends BeverageDecorator{
	
	private Beverage beverage;
	public Sugar(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}
	
	@Override
	public int getCost() {
		return this.beverage.getCost()+1;
	};
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " Sugar ";
	};
	
}

public class DeceratorPattern {
	public static void main(String[] args) {
		Beverage b = new Sugar(new Milk(new PlainBeverage()));
		System.out.println(b.getCost());
		System.out.println(b.getDescription());
	}
}
