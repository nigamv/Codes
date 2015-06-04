package designPatterns.strategyDesignPattern;
/* Dog class extends Animal class and builds upon it to typically define 
 * what a dog object should be like. 
 */
public class Dog extends Animal{

	public Dog(){
		super();
		setSound("bark");
	}
	
	public void digHole(){
		System.out.println("Dig a hole");
	}
	
	
}
