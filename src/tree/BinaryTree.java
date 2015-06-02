package tree;

/* This class shows implementation of bradth first search, depth first search 
 * and iterative deepening search implemented successfully on a binary search 
 * tree. 
 */
import java.util.ArrayList;

public class BinaryTree {
	
	private Node root;
	
	public void setRoot(Node n)
	{
		this.root =n;
	}
	
	public Node getRoot()
	{
		return this.root;
	}
	public void add (int data)
	{
		Node n = new Node(data);
		if (root == null)
		{
			root = n;
			return;
		}
		// implementing a binary search tree
		// if the data in node to be added is less than the current node at
		// which we are looking we traverse left else we traverse right 
		// till we find a null node .... insert the new node at this index
		Node start = root;
		add(n,start);
	}
	
	private void add(Node n, Node start)
	{
		
		if (n.data <start.data)
		{
			if (start.left == null)
			{
				n.parent = start;
				start.left =n;
			}
			else
				add(n,start.left);
				
		}
			
		else if (n.data >= start.data)
		{
			if (start.right == null)
			{
				n.parent = start;
				start.right =n;
			}
			else
				add(n,start.right);
				
		}
	}
	public boolean breadthFirstSearch(int data,Node root)
	{
		// this function implements breadth first search for a binary tree
		ArrayList<Node> nodesToVisit = new ArrayList<Node>();
		ArrayList<Node> nodesVisited = new ArrayList<Node>();
		nodesToVisit.add(root);
		int index =0;
		while (nodesToVisit.size()!= nodesVisited.size())
		{
			Node current = nodesToVisit.get(index);
			if (verify(data,current))
			{
				System.out.println("Search completed");
				return true;
			}
			nodesVisited.add(current);
			index++;
			if (current.left!=null)
				nodesToVisit.add(current.left);
			if (current.right!=null)
				nodesToVisit.add(current.right);
		
		}
		return false;
		
	}
	
	private boolean verify(int data, Node root)
	{
		System.out.println("Data to search is"+data);
		System.out.println("Node data is"+root.data);
		if (root.data == data)
			return true;
		
		return false;
	}
	
	public void traverse(int data, Node root)
	{
		// this function traverses through the entire tree and prints each 
		//element present in the tree
		System.out.println(root.data);
		if (root.data == data)
			System.out.println("element found");
		
		if (root.left != null)
			traverse(data,root.left);
		
		if (root.right!=null)
			traverse(data,root.right);
		
		
	}
	
	public Node depthFirstSearchNode(int data)
	{
		// this function performs a depth first search on the tree to find 
		//a particular element in the tree
		ArrayList<Node> visitedNode = new ArrayList<Node>();
		Node result = findNode(data,root,visitedNode);
		return result;
	}
	
	private Node findNode(int data, Node root,ArrayList<Node> visitedNodes)
	{
		visitedNodes.add(root);
		System.out.println("Nodes visited:"+ root.data);
		if (root.data == data)
			return root;
		
		if (root.left != null && !visitedNodes.contains(root.left))
			return findNode(data,root.left,visitedNodes);
		
		if (root.right!=null && !visitedNodes.contains(root.right))
			return findNode(data,root.right,visitedNodes);
		
		if (root.parent != null)
			return findNode(data,root.parent,visitedNodes);
		else 
			return null;
		
	}
	
	private Node findNode(int data, Node root,ArrayList<Node> visitedNodes,int depth,int count)
	{
		if (!visitedNodes.contains(root))
				visitedNodes.add(root);
		System.out.println("Nodes visited:"+ root.data);
		System.out.println("searching at depth:"+ count);
		if (root.data == data)
			return root;
		
		if (root.left != null && !visitedNodes.contains(root.left)&& count<=depth)
			return findNode(data,root.left,visitedNodes,depth,++count);
		
		
		if (root.parent!=null)
			{
			if (root.parent.right!=null && !visitedNodes.contains(root.parent.right))
				return findNode(data,root.parent.right,visitedNodes,depth,count);
			}
		else
		{
			if (root.right!=null && !visitedNodes.contains(root.right))
				return findNode(data,root.right,visitedNodes,depth,count);
		}
		
		if (root.parent != null)
			return findNode(data,root.parent,visitedNodes,depth,--count);
		else 
			return null;
		
	}
	 public Node iterativeDeepeningSearch(int data, int depth)
	 {
		 // this function uses iterative deepening depth first search
		 // to find a particular element in the tree
		 int i=0;
		 Node result = null;
		 ArrayList<Node> visitedNode = new ArrayList<Node>();
		 while (i<depth)
		 {
			 System.out.println("Searching for max.depth:"+depth);
			 result =  findNode(data,root,visitedNode,i,0);
			 if (result!=null)
				 break;
			 visitedNode.clear();
			 i++;
		 }
		 return result;
	 }
	
}
