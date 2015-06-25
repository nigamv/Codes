package threading;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import static java.util.concurrent.TimeUnit.*;

public class Main {
	
	public static void main (String [] args){
		
//		Thread1 thread1 = new Thread1();
//		thread1.start();
//		
//		Runnable thread2 = new Thread2(5);
//		new Thread(thread2).start();
		
		addThreadsToPool();
	}
	
	public static void addThreadsToPool(){
		
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		eventPool.scheduleAtFixedRate(new Thread1(), 0, 2, SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("mail"), 5, 5, SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("calendar"), 10, 10, SECONDS);
		
		System.out.println("Number of threads"+ Thread.activeCount());
		
		Thread [] listOfThreads = new Thread [Thread.activeCount()];
		Thread.enumerate(listOfThreads);
		
		for (Thread i: listOfThreads){
			System.out.println(i.getName());
		}
		
		for (Thread i: listOfThreads){
			System.out.println(i.getPriority());
		}
		
		try{
			Thread.sleep(20000);
		}
		catch(InterruptedException ie){
			System.out.println("Thread interrupted");
		}
		
	}

}
