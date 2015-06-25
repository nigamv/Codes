package designPatterns.strategyDesignPattern;
/* Dog class extends Animal class and builds upon it to typically define 
 * what a dog object should be like. 
 */
public class Dog extends Animal{

	public Dog(){
		super();
		// setting the sound of dog
		setSound("bark");
		
		// setting the ability of the dog whether it can fly or not  
		flyingType = new CantFly();
	}
	
	public void digHole(){
		System.out.println("Dig a hole");
	}
	
	
}
