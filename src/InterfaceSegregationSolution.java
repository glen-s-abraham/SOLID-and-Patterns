interface Tree{
	//Binary tree methods
	public void insert();
	public void delete();
	public void traverse();
	
	
}

interface RotationTree extends Tree{
	//Balanced tree methods
	public void leftRotation();
	public void rightRotation();
}

class BinarySearchTree implements Tree{

	@Override
	public void insert() {
		System.out.println("Inserting new item");
		
	}

	@Override
	public void delete() {
		System.out.println("Deleting an item");
		
	}

	@Override
	public void traverse() {
		System.out.println("Inorder Traversal");
		
	}
	
	
	
}

class BalancedTree implements RotationTree{

	@Override
	public void insert() {
		System.out.println("Inserting new item");
		
	}

	@Override
	public void delete() {
		System.out.println("Deleting an item");
		
	}

	@Override
	public void traverse() {
		System.out.println("Inorder Traversal");
		
	}
	
	//Unused implementations
	@Override
	public void leftRotation() {
		System.out.println("Left rotation");
		
	}

	@Override
	public void rightRotation() {
		System.out.println("Right rotation");
		
	}
	
}

public class InterfaceSegregationSolution {
	public static void main(String args[]) {
		Tree tree = new BinarySearchTree();
		tree.insert();
		tree.delete();
		tree.traverse();
		
		RotationTree rTree = new BalancedTree();
		rTree.insert();
		rTree.delete();
		rTree.traverse();
		rTree.leftRotation();
		rTree.rightRotation();
	}
}
