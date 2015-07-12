package designPatterns.observerDesignPattern;

public class GrabStocks {
	
	public static void main(String [] args){
		
		StockExchange exchange = new StockExchange();
		StockObserver observer1= new StockObserver(exchange);
		
		exchange.setIBMPrice(197.99);
		exchange.setappPrice(677.99);
		exchange.setgoogPrice(699.99);
		
		StockObserver observer2= new StockObserver(exchange);
		
		exchange.setIBMPrice(197.99);
		exchange.setappPrice(677.99);
		exchange.setgoogPrice(699.99);
		
		exchange.deregister(observer1);
		
		exchange.setIBMPrice(197.99);
		exchange.setappPrice(677.99);
		exchange.setgoogPrice(699.99);
		
		
	}

}
