package CreationalPatterns;
//Aim of the prototype pattern is to copy existing object without
//depending on those given classes
//We delegate the obkject creation problem th the object itsel
//called cloning
abstract class Shape{
	protected Integer width;
	protected Integer height;
	
	public Shape(Integer width, Integer height) {
		this.width = width;
		this.height = height;
	}
	
	public abstract void draw();
	public abstract Shape clone();
	
}

class Square extends Shape{

	public Square(Integer width, Integer height) {
		super(width, height);
	}

	@Override
	public void draw() {
		System.out.println("Square with width "+ width +" "+height);
	}
	

	@Override
	public Shape clone() {
		return new Square(width,height);
	}
	
}

class Rectangle extends Shape{

	public Rectangle(Integer width, Integer height) {
		super(width, height);
	}

	@Override
	public void draw() {
		System.out.println("Square with width "+ width +" "+height);
	}
	

	@Override
	public Shape clone() {
		return new Rectangle(width,height);
	}
	
}


public class ProtoTypePattern {
	public static void main(String args[]) {
		Shape square = new Square(20, 20);
		square.draw();
		
		Shape squareClone = square.clone();
		squareClone.draw();
		
	}
}
