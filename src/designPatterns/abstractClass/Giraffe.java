package designPatterns.abstractClass;

public class Giraffe extends Creature {

	private String name;
	@Override
	public void setName(String newName) {
		// TODO Auto-generated method stub
		
		this.name = newName;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setWeight(double newWeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getWeight() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
