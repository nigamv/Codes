package designPatterns.observerDesignPattern;

public class StockObserver implements Observer{

	private double ibmPrice;
	private double aapPrice;
	private double googPrice;
	
	private static int observerIdTracker = 0;
	
	private int observerId;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerIdTracker;
		
		System.out.println("Observer added"+ this.observerId);
		
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double appPrice, double googPrice) {
		// TODO Auto-generated method stub
		
		this.ibmPrice = ibmPrice;
		this.aapPrice = appPrice;
		this.googPrice= googPrice;
		
		printThePrices();
	}
	
	public void printThePrices(){
		System.out.println(observerId+"\nIBMPrice:"+this.ibmPrice
				+"\nappPrice:"+this.aapPrice
				+"\nGoogPrice:"+ this.googPrice);
		
	}
	

}
