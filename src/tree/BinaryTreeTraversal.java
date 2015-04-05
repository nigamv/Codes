package tree;

import java.util.ArrayList;

public class BinaryTreeTraversal {
	private BinaryTree b1;
	
	public BinaryTree getBinaryTree()
	{
		return this.b1;
	}
	public void setBinaryTree(BinaryTree b1)
	{
		this.b1=b1;
	}
	
	public void preOrderTraversal()
	{
		Node start = b1.getRoot();
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		preOrderTraversal(start, visitedNodes);
	}
	
	private void preOrderTraversal(Node root, ArrayList<Node> visitedNodes)
	{
		if (root == null)
			return;
		visitedNodes.add(root);
		System.out.println(root.data);
		if (root.left!=null && !visitedNodes.contains(root.left))
			preOrderTraversal(root.left,visitedNodes);
		if (root.right!=null && !visitedNodes.contains(root.right))
			preOrderTraversal(root.right,visitedNodes);
			
	}
	
	public void inOrderTraversal()
	{
		Node start = b1.getRoot();
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		inOrderTraversal(start, visitedNodes);
	}
	
	private void inOrderTraversal(Node root, ArrayList<Node> visitedNodes)
	{
		if (root == null)
			return;
		
		if (root.left == null && root.right == null && !visitedNodes.contains(root))
		{
			System.out.println(root.data);
			visitedNodes.add(root);
			
		}
		if (root.left !=null && !visitedNodes.contains(root.left))
			inOrderTraversal(root.left,visitedNodes);
		if (!visitedNodes.contains(root))
		{
			System.out.println(root.data);
			visitedNodes.add(root);
		}
		if (root.right!=null && !visitedNodes.contains(root.right))
			inOrderTraversal(root.right,visitedNodes);
	}
	
	public void postOrderTraversal()
	{
		Node start = b1.getRoot();
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		postOrderTraversal(start,visitedNodes);
	}
	
	private void postOrderTraversal(Node root, ArrayList<Node> visitedNodes)
	{
		if (root == null)
			return;
		
		if (root.left == null && root.right == null && !visitedNodes.contains(root))
		{
			System.out.println(root.data);
			visitedNodes.add(root);
			
		}
		if (root.left !=null && !visitedNodes.contains(root.left))
			postOrderTraversal(root.left,visitedNodes);
		
		if (root.right!=null && !visitedNodes.contains(root.right))
			postOrderTraversal(root.right,visitedNodes);
		if (!visitedNodes.contains(root))
		{
			System.out.println(root.data);
			visitedNodes.add(root);
		}
	}
	
	public int depthBetweenTwoElements( int x, int y)
	{
		
		if (x==y)
			return 0;
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		int firstCount = findDepth(b1.getRoot(),x,1,visitedNodes);
		if (firstCount == 0)
			return 0;
		visitedNodes.clear();
		int secondCount = findDepth(b1.getRoot(),y,1,visitedNodes);
		if (secondCount ==0)
			return 0;
		return Math.abs(secondCount - firstCount)+1;
		
	}
	
	private int findDepth(Node root, int data,int count, ArrayList<Node> visitedNodes)
	{
		if (root == null )
			return 0;
		if (root.data == data)
			return count;
		if (!visitedNodes.contains(root))
			visitedNodes.add(root);
		if (root.left != null && !visitedNodes.contains(root.left))
			return findDepth(root.left,data,++count,visitedNodes);
		if (root.right != null && !visitedNodes.contains(root.right))
			return findDepth(root.right,data,++count,visitedNodes);
		
		return findDepth(root.parent,data,--count,visitedNodes);
	}
}
