package linkedlist;
/* This program takes in two numbers in the format of a single linked list and returns their sum.
 * First number of the linked list represents the unit character. For eg: number 56 is represented as 6 5
 * in the linked list. Result or sum is also shown in the same format. 
 */
public class AddTwoNumbers {

	private static LinkedList addTwoNumbers(Node l1, Node l2){
		
		// Checking for the condition if empty list is passed
		if (l1== null && l2== null)
			return null;
		
		// Initializing an empty linked list for storing the result
		LinkedList result = new LinkedList();
		
		// Initializing variables to store data values of two nodes and the carried over value
		int digit1=0;
		int digit2=0;
		int carry=0;
		
		/* Traverse through each element of both linked lists and store their sum in another linked list*/
		while (l1!= null || l2!=null){
			
			// Generate a new Node each time for storing data
			Node newNode = new Node(0);
			
			// Check if the current node is not null and store its data value
			if(l1!= null){
				digit1= l1.getData();
				l1 = l1.next;
			}
			
			// Check if the current node is not null and store its data value
			if (l2!=null){
				digit2= l2.getData();
				l2 = l2.next;
			}
			
			// Set the data value for the new node
			newNode.setData((digit1+digit2+carry)%10);
			
			// Calculate the value to be carried over
			carry = (digit1+digit2+carry)/10;
			
			// Adding the result node in the result linked list
			result.addNode(newNode);
			
			// re-initialize the digits 
			digit1=0;
			digit2=0;
		}
		return result;
		
	}
	public static void main(String [] args){
		
		/* Randomly generate and display first number */
		LinkedList l1 = generateLinkedList(3);
		System.out.print("First number is :");
		l1.display();
		System.out.println("");
		
		/* Randomly generate and dipslay second number */
		LinkedList l2= generateLinkedList(4);
		System.out.print("Second number is :");
		l2.display();
		System.out.println("");
		
		/* Adding two numbers and displaying the result */
		LinkedList result = addTwoNumbers(l1.getRoot(),l2.getRoot());
		System.out.println("Sum of the two numbers is : "+"\n");
		result.display();
	}
	
	/* Generate a random linked list */
	private static LinkedList generateLinkedList(int limit){
		LinkedList l = new LinkedList();
		for (int i=1; i< limit; i++){
			Node n = new Node((int)(Math.random()*10));
			l.addNode(n);
		}
		return l;
	}
	
}
