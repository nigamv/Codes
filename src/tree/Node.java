package tree;

class Node {
	public int data;
	public Node left;
	public Node right;
	public Node parent;
	 
	/* Constructor to initialize various parameters */
	Node (int data)
	{
		this.data =data;
		this.left = null;
		this.right = null;
		this.parent = null;
	}

}