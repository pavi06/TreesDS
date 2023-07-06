import java.util.*;

public class BinarySearchTree {
	//empty constructor
	public BinarySearchTree() {
		
	}
	
	//declaring node class
	public static class Node{
		int value;
		Node left;
		Node right;
		int height;
		
		public Node(int val){
			this.value=val;
		}
	}
	//root pointer
	public Node root;
	
	//insert method
	public void insert(int val) {
		root=insert(val,root);
	}
	
	public Node insert(int value,Node node) {
		if(node==null) {
			return new Node(value);
		}
		if(value<node.value){
			node.left=insert(value,node.left);
		}else {
			node.right=insert(value,node.right);
		}
		//assigning height to the node
		node.height=Math.max(height(node.left),height(node.right))+1;
		return node;
		
	}
	//insert method for sorted array
	public void insertSorted(int nums[]) {
		insertSorted(nums,0,nums.length);
	}
	//take middle ele and insert
	private void insertSorted(int[] nums, int start, int end) {
		if(start>end) {
			return;
		}
		int mid=(start+end)/2;
		insert(nums[mid]);
		insertSorted(nums,start,mid);
		insertSorted(nums,mid+1,end);
		
	}
	
	//finding the height of a particular node
	public int height(Node node) {
		if(node==null) {
			return -1;
		}else {
			return node.height;
		}
	}
	//to check the tree is null or not
	public boolean isEmpty() {
		return root==null;
	}
	//checking for the balance of the tree
	public String balanced() {
		return balanced(root)? "Balanced" : "Not Balanced";
	}
	
	private boolean balanced(Node node) {
		if(node==null) {
			return true;
		}
		return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
	}
	//to display the elements
	public void display() {
		display(root,"Root Node: ");
	}

	private void display(Node node, String msg) {
		if(node==null) {
			return;
		}
		System.out.println(msg+node.value);
		display(node.left,"Left Child of "+node.value+": ");
		display(node.right,"Right child of "+ node.value+": ");
	}
	
	//traversals
	//preOrder
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.value);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//postorder
	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node node) {
		if(node==null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.value);
	}
	
	//inorder
	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		inOrder(node.right);
		System.out.println(node.value);
	}
	

}
