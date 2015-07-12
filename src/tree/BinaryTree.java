package tree;

/* This class shows implementation of bradth first search, depth first search 
 * and iterative deepening search implemented successfully on a binary search 
 * tree. 
 */
import java.util.ArrayList;

public class BinaryTree {
	
	private Node root;
	
	
	
	/*
	 * Function used to getting root node
	 * 
	 * @return		the root node
	 */
	public Node getRoot()
	{
		return this.root;
	}
	
	/*
	 * Function used for adding a node into a binary search tree
	 * 
	 * @param 	data	data value which is to be added as a node
	 */
	public void add (int data)
	{
		// Create a new node with the value as given data value
		Node n = new Node(data);
		
		// If root node is null then initialize the root node with this value and return
		if (root == null)
		{
			root = n;
			return;
		}
		
		// Initializing start with the root node
		Node start = root;
		
		// Calling the add function for the rooot node
		add(n,start);
	}
	
	/*
	 * Function adds a node to the exisiting binary search tree
	 * 
	 * @param	n		Node to be added
	 * @param	start	root node of the tree
	 */
	private void add(Node n, Node start)
	{
		// If data value to be added is less than the data value of 
		// current node then move left
		if (n.data < start.data)
		{
			// If left node of current node is null then add node here
			if (start.left == null)
			{
				n.parent = start;
				start.left =n;
			}
			// else move further down the left
			else
				add(n,start.left);
				
		}
			
		// If data value to be added is greater then the current node value
		// then move right
		else if (n.data >= start.data)
		{
			// If right node is null then add node here
			if (start.right == null)
			{
				n.parent = start;
				start.right =n;
			}
			
			// else move further down the right side
			else
				add(n,start.right);
				
		}
	}
	
	/*
	 * Function implements breadthFirst search on a binary search tree
	 * and returns true if element is found and false if element is not 
	 * found
	 * 
	 * @param 	data	value of the element to be searched
	 * @param	root	root node of the tree
	 * 
	 * @return			true/false value returned depending upon if element is found
	 */
	public boolean breadthFirstSearch(int data)
	{
		// A list keeping track of nodes to visit at each depth
		ArrayList<Node> nodesToVisit = new ArrayList<Node>();
		
		// A list keeping track of visited nodes
	//	ArrayList<Node> nodesVisited = new ArrayList<Node>();
		
		// Add an unvisited node at current depth to the list
		nodesToVisit.add(root);
		
		// Initialize the index
		// int index =0;
		
		while (!nodesToVisit.isEmpty())
		{
			// get the current node to be visited
			Node current = nodesToVisit.get(0);
			nodesToVisit.remove(0);
			// check if the current node is the given node
			if (verify(data,current))
			{
				System.out.println("Search completed");
				return true;
			}
			
			// add node to the visited node list 
		//	nodesVisited.add(current);
			
			// increment the index  
		//	index++;
			
			// add the left node of the current node to nodesToVisit list if not already added
			if (current.left!=null)
				nodesToVisit.add(current.left);
			
			// add the right node of the current node to nodesToVisit list if not already added
			if (current.right!=null)
				nodesToVisit.add(current.right);
		
		}
		
		return false;
		
	}
	
	/*
	 * verify if the data value to be searched for is the same as the data value of the root 
	 * 
	 * @param	data	data vale to be searched
	 * @param	root	root node of the tree 
	 */
	private boolean verify(int data, Node root)
	{
		System.out.println("Data to search is"+data);
		System.out.println("Node data is"+root.data);
		if (root.data == data){
			System.out.println("Data found");
			return true;
		}
			
		
		return false;
	}
	
	/*
	 * Function traverses through the entire tree and prints each
	 * element present in the tree 
	 */
	public void traverse(int data, Node root)
	{
		// print value of the current node
		System.out.println(root.data);
		
		// check if the value of current node is same as being searched value
		if (root.data == data)
			System.out.println("element found");
		
		// traverse left if left node of current is not null
		if (root.left != null)
			traverse(data,root.left);
		
		// traverse right if right node of current is not null
		if (root.right!=null)
			traverse(data,root.right);
		
		
	}
	
	/*
	 * Function performs a depth first search to search for the 
	 * current value of the node
	 * 
	 * @param	data	value to be searched for in the tree
	 */
	public Node depthFirstSearchNode(int data)
	{
		// A list to keep track of visitedNode of the list
		ArrayList<Node> visitedNode = new ArrayList<Node>();
		
		// search for the data in the current node
		Node result = findNode(data,root,visitedNode);
		
		return result;
	}
	
	/*
	 * Function searches for the given value using depthFirstSearch and 
	 * returns the found node
	 * 
	 * @param	data			value to be searched for
	 * @param	root			root node of the tree
	 * @param	visitedNodes	list of visited nodes 
	 */
	private Node findNode(int data, Node root,ArrayList<Node> visitedNodes)
	{
		// add node to the visitedNodes list
		visitedNodes.add(root);
		
		System.out.println("Nodes visited:"+ root.data);
		
		// return root if match found
		if (root.data == data)
			return root;
		
		// if left node of current is not null and not visited then move to the left node
		if (root.left != null && !visitedNodes.contains(root.left))
			return findNode(data,root.left,visitedNodes);
		
		// if right node of current is not null and not visited then move to the right node
		if (root.right!=null && !visitedNodes.contains(root.right))
			return findNode(data,root.right,visitedNodes);
		
		// move back to the parent node
		if (root.parent != null)
			return findNode(data,root.parent,visitedNodes);
		else 
			return null;
		
	}
	
	/*
	 * Function performs depth first search till the specified depth 
	 * and return the node if searched for 
	 * 
	 * @param	data			value to be searched for
	 * @param	root			root node of the binary search tree
	 * @param	visitedNodes	list of visitedNodes
	 * @param	depth			depth till depthFirstSearch is performed
	 * @param	count			keep the count of the depth performed
	 * 
	 * @return					returns node if found
	 */
	private Node findNode(int data, Node root,ArrayList<Node> visitedNodes,int depth,int count)
	{
		// add root in the visitedNodes list if not added
		if (!visitedNodes.contains(root))
				visitedNodes.add(root);
		
		System.out.println("Nodes visited:"+ root.data);
		System.out.println("searching at depth:"+ count);
		
		// if data value of current node is same as data to be searched for return root
		if (root.data == data)
			return root;
		
		// if left node of current node is not null and unvisited then move left
		if (root.left != null && !visitedNodes.contains(root.left)&& count<=depth)
			return findNode(data,root.left,visitedNodes,depth,++count);
		
		// check if the parent is not null, primarily for moving back from the root node
		if (root.parent!=null)
			{
			// if right node of current node is not null and unvisited then move right
			if (root.parent.right!=null && !visitedNodes.contains(root.parent.right))
				return findNode(data,root.parent.right,visitedNodes,depth,count);
			}
		else
		{
			// if right node of current node is not null and unvisited then move right
			if (root.right!=null && !visitedNodes.contains(root.right))
				return findNode(data,root.right,visitedNodes,depth,count);
		}
		
		// if parent is not null then move to parent 
		if (root.parent != null)
			return findNode(data,root.parent,visitedNodes,depth,--count);
		else 
			return null;
		
	}
	 
	/*
	 * Function performs iterative deepening search for the node 
	 * with searching for incremental depths 
	 * 
	 * @param 	data	value to be searched for
	 * @param	depth	depth till the value to be searched for
	 */
	public Node iterativeDeepeningSearch(int data, int depth)
	 {
		 
		 int i=0;
		 Node result = null;
		 
		 // List to keep track of the visitedNodes
		 ArrayList<Node> visitedNode = new ArrayList<Node>();
		 
		 
		 while (i<depth)
		 {
			 System.out.println("Searching for max.depth:"+depth);
			 
			 // search for the node value 
			 result =  findNode(data,root,visitedNode,i,0);
			 if (result!=null)
				 break;
			 visitedNode.clear();
			 i++;
		 }
		 return result;
	 }
	
}
