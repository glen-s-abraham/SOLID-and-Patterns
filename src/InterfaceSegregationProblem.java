////Fat Interface
//interface Tree{
//	//Binary tree methods
//	public void insert();
//	public void delete();
//	public void traverse();
//	//Balanced tree methods
//	public void leftRotation();
//	public void rightRotation();
//	
//}
//
//class BinarySearchTree implements Tree{
//
//	@Override
//	public void insert() {
//		System.out.println("Inserting new item");
//		
//	}
//
//	@Override
//	public void delete() {
//		System.out.println("Deleting an item");
//		
//	}
//
//	@Override
//	public void traverse() {
//		System.out.println("Inorder Traversal");
//		
//	}
//	
//	//Unused implementations
//	@Override
//	public void leftRotation() {
//		// No left rotation in bst
//		
//	}
//
//	@Override
//	public void rightRotation() {
//		//No right rotation in bst
//		
//	}
//	
//}
//
//class BalancedTree implements Tree{
//
//	@Override
//	public void insert() {
//		System.out.println("Inserting new item");
//		
//	}
//
//	@Override
//	public void delete() {
//		System.out.println("Deleting an item");
//		
//	}
//
//	@Override
//	public void traverse() {
//		System.out.println("Inorder Traversal");
//		
//	}
//	
//	//Unused implementations
//	@Override
//	public void leftRotation() {
//		System.out.println("Left rotation");
//		
//	}
//
//	@Override
//	public void rightRotation() {
//		System.out.println("Right rotation");
//		
//	}
//	
//}
//
//public class InterfaceSegregationProblem {
//	public static void main(String args[]) {
//		Tree tree = new BinarySearchTree();
//		tree.insert();
//		tree.delete();
//		tree.traverse();
//		
//		tree = new BalancedTree();
//		tree.insert();
//		tree.delete();
//		tree.traverse();
//		tree.leftRotation();
//		tree.rightRotation();
//	}
//}
