package tree;

/*
 * This class is used as a test case class for performing various
 * test case scenarios. 
 */
public class BinaryTreeTest {
	public static void main (String [] args)
	{
		Node root = new Node (10);
		Node result = null;
		BinaryTree tree = new BinaryTree();
		tree.add(10);
		tree.add(5);
		tree.add(15);
		tree.add(7);
		tree.add(4);
		tree.add(13);
		tree.add(16);
		
		System.out.println("Perform a breadth first search");
		tree.breadthFirstSearch(16, root);
		
		System.out.println("Perform a depth first search");
		result = tree.depthFirstSearchNode(7);
		if (result != null)
		{
			System.out.println("Element found");
			System.out.println(result.data);
		}
		else
			System.out.println("Element not found");
		
		System.out.println("Perform an iterative deepening search");
		result = tree.iterativeDeepeningSearch(16,1);
		if (result != null)
		{
			System.out.println("Element found");
			System.out.println(result.data);
		}
		else
			System.out.println("Element not found");
		
		BinaryTreeTraversal bt1 = new BinaryTreeTraversal();
		bt1.setBinaryTree(tree);
		
		System.out.println("Pre Order Traversal");
		bt1.preOrderTraversal();
		System.out.println(" ");
		
		System.out.println("In Order Traversal:");
		bt1.inOrderTraversal();
		System.out.println(" ");
		
		System.out.println("Post Order Traversal");
		bt1.postOrderTraversal();
		System.out.println(" ");
		
		System.out.println("Depth between two elements:");
		int count = bt1.depthBetweenTwoElements(16,10);
		if (count == 0)
			System.out.println("Both elements not present in tree");
		else
			System.out.println("Depth is:"+count);
	}
}
