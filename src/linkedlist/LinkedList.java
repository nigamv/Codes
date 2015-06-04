package linkedlist;

public class LinkedList {
	private Node root;
	
	public Node getRoot(){
		return this.root;
	}
	
	/* This function is used to add a new node into the list value */
	public void addNode(Node n)
	{
		if(this.root==null){
			this.root=n;
			return;
		}
		Node start = this.root;
		while (start.next!=null)
			start = start.next;
		start.next =n;
	}
	
	/* Display values of all the nodes in a linked list */
	public void display()
	{
		Node start = root;
		System.out.print(start.data + " ");
		while(start.next!=null)
		{
			start = start.next;
			System.out.print(start.data +" ");
		}
	}
	
	/* Search for a particular value in the linked list */
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
