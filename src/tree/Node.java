package tree;

class Node {
	public int data;
	public Node left;
	public Node right;
	public Node parent;
	
	Node (int data)
	{
		this.data =data;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
//    public void insert (Node n, Node root)
//    {
//    	if (insertonLeftNode(n, root))
//    		return;
//    	insertonRightNode(n, root);
//    }
//    private boolean insertonRightNode(Node n, Node root)
//    {
//    	if (root.right == null)
//    	{
//    		root.right= n;
//    		return true;
//    	}
//    	
//    	return false;
//    }
//    private boolean insertonLeftNode(Node n, Node root)
//    {
//    	if (root.left == null)
//    	{
//    		root.left= n;
//    		return true;
//    	}
//    	
//    	return false;
//    }
//    public static void main (String [] args)
//    {
//    	Node root = new Node(5);
//    	for (int i=10; i< 5;i++)
//    	{
//    		Node n= new Node(i+5);
//    		root.insert(n, root);
//    		if (root.left!=null && root.right!=null)
//    		{
//    			if (root.left.left == null)
//    				root = root.left;
//    			else 
//    				root=root.right;
//    			
//    		}
//    	}
//    }
}
