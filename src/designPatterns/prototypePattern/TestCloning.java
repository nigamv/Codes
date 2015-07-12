package designPatterns.prototypePattern;

public class TestCloning {

	public static void main (String [] args){
		CloneFactory animalMaker = new CloneFactory();
		
		Sheep sally = new Sheep();
		Sheep dolly = (Sheep) animalMaker.getClone(sally);
		
		System.out.println("Sheep hashcode:"+ 
						System.identityHashCode(System.identityHashCode(sally)));
		
		System.out.println("Sheep hashcode:"+ 
				System.identityHashCode(System.identityHashCode(dolly)));
	}
}
