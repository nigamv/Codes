package linkedlist;
/*
 * This class provides a linked list implementation of the Queue
 */
public class Queue {

	private Node front;
	private Node rear;
	
	/*
	 * The function dynamically adds a node to the Queue
	 * @ param	n	the new node to be added
	 * 
	 */
	public void enQueue(Node n){
		if (isEmpty()){
			front = n;
			rear= n;
		}
		else{
			rear.next=n;
			rear=n;
		}
	}
	/*
	 * The function checks if a queue is empty and returns a boolean value
	 * 
	 * @return 		true or false depending upon whether the queue is empty
	 */
	public boolean isEmpty(){
		if (front == null && rear == null)
			return true;
		return false;
	}
	
	/*
	 * The function removes an element from the queue
	 */
	public void deQueue(){
		if(isEmpty())
			return ;
		if (front==rear){
			front = null;
			rear = null;
		}
		else
			front=front.next;
		
	}
	/*
	 * The function displays all the elements of a queue
	 */
	public void display (){
		Node temp = front;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
}
