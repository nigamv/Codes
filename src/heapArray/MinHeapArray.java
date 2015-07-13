package heapArray;

public class MinHeapArray {

	private int [] heapArray;
	int head =1;
	
	public MinHeapArray(){
		if (head==1){
			heapArray = new int [20];
		}
	}
	
	public void addElement(int data){
		if (head >= heapArray.length){
			heapArray = expandArray(heapArray);
			System.out.println("array expanded");
		}
		heapArray[head]= data;
		int child = head;
		int parent = head/2;
		while (parent>0){
			if (heapArray[parent] > heapArray[child]){
				int temp = heapArray[parent];
				heapArray[parent]= heapArray[child];
				heapArray[child]= temp;
			}
			child = child/2;
			parent = parent/2;
		}
		head++;
	}
	public void display(){
		int i=1;
		while(i < head){
			System.out.print(heapArray[i]+" ");
			i++;
		}
		System.out.println(" ");
	}
	private int [] expandArray(int [] arrayToExpand){
		int [] newArray = new int[arrayToExpand.length*2];
		for (int i=0; i< arrayToExpand.length; i++){
			newArray[i]= arrayToExpand[i];
		}
		return newArray;
	}
	
	public boolean checkheapMaintained(){
		
		
		int i=0;
		while(i< head/2){
			if ((heapArray[i]> heapArray[2*i]) || (heapArray[i] > heapArray[2*i+1])){
				return false;
			}
			i++;
		}
		return true;
	}
}
