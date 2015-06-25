package threading;

import java.io.*;

public class Thread2 implements Runnable{

	private int count;
	
	public Thread2(int count){
		this.count = count;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try{
			Thread.sleep(count*1000);
		}
		catch(InterruptedException ie){
			System.out.println("Thread 2 interrupted");
		}
		
		System.out.println("Executing second thread");
	}

}
