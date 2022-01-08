package BehaviouralPatterns;

import java.util.ArrayList;
import java.util.List;

/*
 * We would like to do some specific operations on different entities
 * Photo shop or illustrator
 * we may have several geometric shapes on the canvas
 * what if we want to save all of these geometric shapes into a file
 * We have to consider the shapes one by one and save them accordingly
 * But it's not the best solution as it violates the single responsibility principle
 * these shapes have nothing to do with how they are saved
 * it may violate open/close principle as well
 * what if we want to change the way we save the shapes?we have to change the code that 
 * we have already implemented
 * The visitor design pattern is a way of seperating an algorithm from an
 * object structure on which it operates.
 * We have a visitor class that will do the save operations
 * but again there is a problem we need different save operations for different shapes.
 * 
 * ExportVisistor
 * 	saveRectangle(Rectangle object)
 * 	saveCircle(Circle object)
 * 	saveTriangle(Triangle object)
 * 
 * the double dispatch technique can solve this problem.
 * we delegate the problem to the object because it knows exactly how to save the shape.
 * 
 */

interface ShoppingItem{
	public double accept(ShoppingCartVisitor visitor);
}

class Table implements ShoppingItem{
	
	private String type;
	private double price;
	
	
	
	public Table(String type, double price) {
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
	
}


class Chair implements ShoppingItem{
	
	private String type;
	private double price;
	
	
	
	public Chair(String type, double price) {
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
	
}

interface ShoppingCartVisitor{
	public double visit(Table table);
	public double visit(Chair chair);
}

class ShoppingCart implements ShoppingCartVisitor{

	@Override
	public double visit(Table table) {
		return table.getPrice();
	}

	@Override
	public double visit(Chair chair) {
		return chair.getPrice();
	}
	
}

public class VisitorPattern {
	public static void main(String[] args) {
		List<ShoppingItem> items = new ArrayList<>();
		items.add(new Table("desk",20));
		items.add(new Chair("plastic",30));
		items.add(new Chair("iron",40));
		double sum=0;
		ShoppingCartVisitor shoppiingCart = new ShoppingCart();
		for(ShoppingItem item:items)
			sum+=item.accept(shoppiingCart);
		System.out.println(sum);
			
	}
}
