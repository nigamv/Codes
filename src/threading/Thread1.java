package threading;

public class Thread1 implements Runnable{
	
	public void run (){
		
		
		
		for (int i=0; i<20;i++){
			
			System.out.println(" Executing 1st thread" + i +"time");
			
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				
				System.out.println("Thread 1 inteerupted");
			}
		}
		
	}

}
