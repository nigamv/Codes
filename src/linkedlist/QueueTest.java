package linkedlist;

public class QueueTest {
	
	public static void main (String [] args){
		Queue queue = new Queue();
		int data =0;
		for (int i=0; i< 10; i++){
			data = (int)(Math.random()*10);
			Node n = new Node(data);
			queue.enQueue(n);
			System.out.println(" Queue at "+ i+ " iteration ");
			queue.display();
		}
		
		for (int i=0; i<10; i++){
			queue.deQueue();
			System.out.println(" Queue at "+ i+ " iteration ");
			queue.display();
		}
		
	}

}
