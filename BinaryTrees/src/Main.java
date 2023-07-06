import java.util.Scanner;

public class Main {
	public static void main(String args[]) { 
//	Scanner scanner = new Scanner(System.in);
//	BinaryTree bt = new BinaryTree();
//	bt.insert(scanner);
//	bt.display();
//	}
		
	BinarySearchTree bst = new BinarySearchTree();
	int nums[]= {5,2,6,8,4,12};
	for(int i=0;i<nums.length;i++) {
		bst.insert(nums[i]);
	 }
	bst.inOrder();
//	bst.display();
//	System.out.println(bst.balanced());
	}
}
