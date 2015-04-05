package linkedlist;

public class LinkedList {
	private Node root;
	
	public Node getRoot()
	{
		return this.root;
	}
	
	public void setRoot(Node root)
	{
		this.root =root;
	}
	
	public void addNode(Node n)
	{
		Node start =root;
		while (start.next!=null)
			start = start.next;
		start.next =n;
	}
	
	public void display()
	{
		Node start = root;
		System.out.println(start.data);
		while(start.next!=null)
		{
			start = start.next;
			System.out.println(start.data);
		}
	}
	public Node search (int data)
	{
		Node start =root;
		while (start.next!=null)
		{
			start=start.next;
			if(start.data == data)
				return start;
		}
		return null;
	}
}
