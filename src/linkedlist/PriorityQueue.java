package linkedlist;

public class PriorityQueue {

	// Declaring two node pointers to keep track of front and rear of a 
	// priority queue
	private Node front;
	private Node rear;
	
	/*
	 * Enqueues a new node in the queue depending on its position in ascending order
	 * @param 	n	new node to be entered in the queue
	 */
	public void enQueue(Node n){
		
		if (isEmpty()){
			front =n;
			rear=n;
		}

		else{
			// declare two pointers to traverse through the queue
			Node prev = front;
			Node next= front.next;
			
			// check if the given node is less than the first node
			if (n.data < front.data){
				n.next = front;
				front=n;
				return;
			}
			
			if(n.data>=rear.data){
				rear.next=n;
				rear=n;
				return;
			}
			
			// search for the appropriate position of the node in the system
			
				while(next!=null){
					if(n.data <next.data){
						prev.next=n;
						n.next=next;
						break;
					}
					prev= prev.next;
					next=next.next;
				}
				
			
		}
	}
	/*
	 * Searches for an element in the priority queue and deletes the element
	 */
	public void delete(Node n){
		boolean flag= false;
		
		if (n.data == front.data){
			front = front.next;
			flag=true;
		}
		
		else{
			Node prev= front;
			Node current= front.next;
			while(current!=rear){
				if (n.data == current.data){
					prev.next=current.next;
					flag = true;
					break;
					
				}
				prev=prev.next;
				current=current.next;
				
			}
			
			if(n.data == rear.data && !flag){
				rear=prev;
				flag=true;
			}
		}
		
		if(flag)
			System.out.println("Node deleted");
		else
			System.out.println("Node to be deleted not present in the priority queue");
	}
	
	/*
	 * Function to display a list of elements in the priority queue
	 */
	public void display(){
		
		Node start = front;
		while(start!=null){
			System.out.print(start.data+ " ");
			start=start.next;
		}
		System.out.println("");
	}
	
	/*
	 * Function checks if the queue is empty
	 * 
	 * @return		true or false depending on whether the list is empty
	 */
	public boolean isEmpty(){
		if (front == null && rear == null)
			return true;
		return false;
	}
}
