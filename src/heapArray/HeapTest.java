package heapArray;



public class HeapTest {
	public static void main (String [] args){
		MinHeapArray minHeap = new MinHeapArray();
		int data =0;
		for (int i=0; i< 40; i++){
			data = (int)(Math.random()*10);
			minHeap.addElement(data);
			System.out.println(" heap at "+ i+ " iteration ");
			minHeap.display();
		}
		if (minHeap.checkheapMaintained()){
			System.out.println(" heap is in order");
		}
		else {
			System.out.println("Heap is not in order");
		}
	}
	
}
