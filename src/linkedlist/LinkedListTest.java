package linkedlist;

public class LinkedListTest {
	public static void main(String [] args)
	{
		Node root = new Node(10);
		LinkedList l1= new LinkedList();
		l1.setRoot(root);
		for (int i=0; i<10 ; i++)
		{
			Node n= new Node((int)(Math.random()*10+1));
			l1.addNode(n);
		}
		l1.display();
		Node result = l1.search(4);
		if (result != null)
			System.out.println("element found");
		else
			System.out.println("element not found");
	}

}
