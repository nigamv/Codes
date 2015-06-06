package tree;

import java.util.ArrayList;

public class BinaryTreeTraversal {
	private BinaryTree b1;
	
	/* Function to get the value of the binary tree
	 * 
	 * @return 	returns a binary tree object
	 */
	public BinaryTree getBinaryTree()
	{
		return this.b1;
	}
	
	/* Used to set a Binary Tree
	 * 
	 * @param	b1	Binary tree object
	 */
	public void setBinaryTree(BinaryTree b1)
	{
		this.b1=b1;
	}
	
	/* Call the preOrder traversal method */
	public void preOrderTraversal()
	{
		Node start = b1.getRoot();
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		preOrderTraversal(start, visitedNodes);
	}
	
	/* Traverse the tree in pre-order traversal form and display the node values 
	 * 
	 * @param   root     		root of the tree node
	 * @param   visitedNodes	an arrayList to keep track of visited nodes 
	 */
	private void preOrderTraversal(Node root, ArrayList<Node> visitedNodes)
	{
		if (root == null)
			return;
		
		// Add the node to visitedNodes list
		visitedNodes.add(root);
		
		// Print the data of the current Node
		System.out.print(root.data+" ");
		
		// If current node has an unvisited left node then move left
		if (root.left!=null && !visitedNodes.contains(root.left))
			preOrderTraversal(root.left,visitedNodes);
		
		// If current node has unvisited right node then move right
		if (root.right!=null && !visitedNodes.contains(root.right))
			preOrderTraversal(root.right,visitedNodes);
			
	}
	
	/* Calling the in-order traversal function */
	public void inOrderTraversal()
	{
		Node start = b1.getRoot();
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		inOrderTraversal(start, visitedNodes);
	}
	
	/* Traverse the tree in in-order traversal form and display the node values 
	 * 
	 * @param   root     		root of the tree node
	 * @param   visitedNodes	an arrayList to keep track of visited nodes 
	 */
	private void inOrderTraversal(Node root, ArrayList<Node> visitedNodes)
	{
		if (root == null)
			return;
		
        // If current node has an unvisited left node then move to the left node
		if (root.left !=null && !visitedNodes.contains(root.left))
			inOrderTraversal(root.left,visitedNodes);
		
		// If current node is not already visited then print its value
		if (!visitedNodes.contains(root))
		{
			System.out.print(root.data+" ");
			visitedNodes.add(root);
		}
		
		//If current node has an unvisited right node then move right
		if (root.right!=null && !visitedNodes.contains(root.right))
			inOrderTraversal(root.right,visitedNodes);
	}
	
	/* Calling the post-order traversal function */
	public void postOrderTraversal()
	{
		Node start = b1.getRoot();
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		postOrderTraversal(start,visitedNodes);
	}
	
	/* Traverse the tree in post-order traversal form and display the node values 
	 * 
	 * @param   root     		root of the tree node
	 * @param   visitedNodes	an arrayList to keep track of visited nodes 
	 */
	private void postOrderTraversal(Node root, ArrayList<Node> visitedNodes)
	{
		// If root value is null then return from the function
		if (root == null)
			return;
		
		// If current node has an unvisited left node then move to the left node
		if (root.left !=null && !visitedNodes.contains(root.left))
			postOrderTraversal(root.left,visitedNodes);
		
		// If current node has an unvisited right node then move to the right node
		if (root.right!=null && !visitedNodes.contains(root.right))
			postOrderTraversal(root.right,visitedNodes);
		
		// If current node is unvisited then print the value of the current node
		if (!visitedNodes.contains(root))
		{
			System.out.print(root.data+" ");
			visitedNodes.add(root);
		}
	}
	/*
	 * Function finds the depth between two given node values and returns it
	 * 
	 * @param 	x	First node value
	 * @param 	y	Second node value 
	 * 
	 * @return		depth between two nodes
	 */
	public int depthBetweenTwoElements( int x, int y)
	{
		// If both the values are same return zero
		if (x==y)
			return 0;
		
		// Declaring an ArrayList of nodes to keep track of visited nodes
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		
		// Calculating the depth of first node
		int firstCount = findDepth(b1.getRoot(),x,1,visitedNodes);
		
		// If depth is zero i.e. element is not present then return zero
		if (firstCount == 0)
			return 0;
		
		// Clear the visitedNodes list
		visitedNodes.clear();
		
		// Calculate the depth of the second node
		int secondCount = findDepth(b1.getRoot(),y,1,visitedNodes);
		
		// If second node is not found return zero
		if (secondCount ==0)
			return 0;
		
		// return the depth value between two nodes 
		return Math.abs(secondCount - firstCount)+1;
		
	}
	
	/*
	 * Function finds the depth of a given node
	 * 
	 * @param 	root			Root node of the tree
	 * @param 	data			Node value whose depth is to be found 
	 * @param	count			Starting depth from where to start
	 * @param	visitedNodes	A list to keep track of all visited nodes
	 * 
	 * @return		depth between two nodes
	 */
	private int findDepth(Node root, int data,int count, ArrayList<Node> visitedNodes)
	{
		// If root is null then return zero depth
		if (root == null )
			return 0;
		
		// If data value of root matches with given data then return count as depth
		if (root.data == data)
			return count;
		
		// If current node is not in the visited list add node
		if (!visitedNodes.contains(root))
			visitedNodes.add(root);
		
		//If left node of the current node is not visited then visit the left node 
		if (root.left != null && !visitedNodes.contains(root.left))
			return findDepth(root.left,data,++count,visitedNodes);
		
		// If right node of the current node is not visited then visit the right node
		if (root.right != null && !visitedNodes.contains(root.right))
			return findDepth(root.right,data,++count,visitedNodes);
		
		// Both nodes are visited then move back to the parent node
		return findDepth(root.parent,data,--count,visitedNodes);
	}
}
