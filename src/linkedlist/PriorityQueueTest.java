package linkedlist;

public class PriorityQueueTest {

	public static void main(String [] args){
		PriorityQueue queue = new PriorityQueue();
		int data =0;
		for (int i=0; i< 10; i++){
			data = (int)(Math.random()*10);
			Node n = new Node(data);
			queue.enQueue(n);
			System.out.print("Enqueued queue at "+i+" iteration is :");
			queue.display();
			
		}
		for (int i=0; i< 10; i++){
			data = (int)(Math.random()*10);
			Node n = new Node(data);
			System.out.println("Element to be deleted:"+ n.data);
			queue.delete(n);
			queue.display();
		}
		
		
	}
}
