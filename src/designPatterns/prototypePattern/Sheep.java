package designPatterns.prototypePattern;

public class Sheep implements Animal{

	public Sheep (){
		System.out.println("Make sheep");
	}
	
	public Animal makeCopy() {
		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return sheepObject;
	}

}
