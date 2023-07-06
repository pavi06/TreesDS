import java.util.Scanner;

public class BinaryTree {
	//empty constructor
	public BinaryTree() {
		
	}
	//node declaration
	public static class Node{
		int value;
		Node left;
		Node right;
		//constructor of node class
		public Node(int val) {
			this.value=val;
		}
	}
	//creating a pointer node root
	private Node root;
	
	//insert function with scanner object
	public void insert(Scanner scanner) {
		System.out.println("Enter the node value: ");
		int val=scanner.nextInt();
		root=new Node(val);
		child(scanner,root);
	}
	//adding children to the root node
	private void child(Scanner scanner, Node node) {
		//left child
		System.out.println("Do you want to add child to the left of node : "+node.value+"? true/false");
		boolean left=scanner.nextBoolean();
		if(left) {
			System.out.println("Enter the node value: ");
			int val=scanner.nextInt();
			node.left=new Node(val);
			child(scanner,node.left);
		}
		//right child
		System.out.println("Do you want to add child to the right of node : "+node.value+"? true/false");
		boolean right=scanner.nextBoolean();
		if(right) {
			System.out.println("Enter the node value: ");
			int val=scanner.nextInt();
			node.right=new Node(val);
			child(scanner,node.right);
		}		
	}
	//display method
	public void display() {
		display(root,0);
	}
	private void display(Node node, int l) {
		if(node==null){
			return;
		}
		display(node.right,l+1);
		if(l!=0) {
			for(int i=0;i<l-1;i++) {
				System.out.print("|\t\t");
			}
			System.out.println("|----------->"+node.value);
		}else {
			System.out.println(node.value);
		}
		display(node.left,l+1);
	}
	
}
