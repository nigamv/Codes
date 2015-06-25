package designPatterns.strategyDesignPattern;

public class AnimalPlay {

	public static void main (String [] args){
		
		Dog sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println(" Dog :"+ sparky.getFlyingType());
		System.out.println(" Bird:" + tweety.getFlyingType());
		
		sparky.setFlyingType(new ItFlys());
		
		System.out.println(" Dog:" + sparky.getFlyingType());
		sparky.digHole();
	}
}
