package linkedlist;

public class DoubleLinkedList {
	
	private Node root;
	
	public void setRoot(Node root)
	{
		this.root = root;
	}
	
	public Node getRoot()
	{
		return this.root;
	}
	
	public void add(int data)
	{
		Node n = new Node((int)(Math.random()*50+1));
		Node start = root;
		while (start.next!=null)
			start = start.next;
		n.prev= start;
		start.next =n;
	}

}
