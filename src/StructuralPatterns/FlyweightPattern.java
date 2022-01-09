package StructuralPatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * We would like to minimize memory usage by sharing as much data as
 * possible with similar objects.
 * For example in a document every character shares the same features
 * -font metrics etc.
 * we create a flyweight object an every single character refers to it.
 */

interface Shape{
	public void draw();
}

class Rectangle implements Shape{
	private int x;
	private int y;
	private String color;
	public Rectangle(String color) {
		this.color = color;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle with "+color+" x="+x+" y="+y);
		
	}
}

class ShapesFactory{
	private Map<String,Shape> shapes;
	public ShapesFactory() {
		shapes = new HashMap<>();
	}
	public Shape getShape(String color) {
		if(shapes.containsKey(color))
			return shapes.get(color);
		System.out.println(".........Creating new Rectangle........");
		Shape shape = new Rectangle(color);
		shapes.put(color, shape);
		return shape;
		
	}
}

class FlyWeightSimulator{
	private Random random;
	private String[] colors = {"RED","GREEN","BLUE"};
	private ShapesFactory shapesFactory;
	
	public FlyWeightSimulator() {
		random= new Random();
		shapesFactory = new ShapesFactory();
	}
	public void run() {
		for(int i=0;i<30;i++) {
			Rectangle rectangle = (Rectangle)shapesFactory.getShape(getRandomColor());
			rectangle.setX(getRandomCoordinate());
			rectangle.setY(getRandomCoordinate());
			rectangle.draw();
		}
			
	}
	
	private String getRandomColor() {
		
		return colors[random.nextInt(colors.length)];
	}
	private int getRandomCoordinate() {
		return random.nextInt(50);
	}
	
 }

public class FlyweightPattern {
	public static void main(String[] args) {
		FlyWeightSimulator flyWeightSimulator= new FlyWeightSimulator();
		flyWeightSimulator.run();
	}
}
