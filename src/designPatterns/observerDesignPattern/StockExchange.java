package designPatterns.observerDesignPattern;

import java.util.*;

public class StockExchange implements Subject{

	private ArrayList<Observer> observerList;
	
	private double ibmPrice;
	private double appPrice;
	private double googPrice;
	
	StockExchange(){
		observerList = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		
		observerList.add(o);
	}

	@Override
	public void deregister(Observer o) {
		// TODO Auto-generated method stub
		
		int index = observerList.indexOf(o);
		observerList.remove(index);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for (Observer observer: observerList){
			observer.update(ibmPrice, appPrice, googPrice);
		}
	}
	
	public void setIBMPrice(double newIBMPrice){
		this.ibmPrice = newIBMPrice;
		notifyObserver();
	}

	public void setappPrice(double newappPrice){
		this.appPrice = newappPrice;
		notifyObserver();
	}
	
	public void setgoogPrice(double newgoogPrice){
		this.googPrice = newgoogPrice;
		notifyObserver();
	}
	
}
