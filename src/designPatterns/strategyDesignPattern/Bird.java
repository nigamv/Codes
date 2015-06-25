package designPatterns.strategyDesignPattern;

public class Bird extends Animal{
	
	Bird(){
	//	super();
		// setting the sound of bird;
		setSound("Screech");
		// setting the ability of bird to fly
		flyingType = new ItFlys();
	}

}
