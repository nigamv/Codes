package designPatterns.strategyDesignPattern;
/*
 * Interface which contains the flying ability of different animals
 */
public interface Flys {

	public String flys();
}

/*
 *  Class implementation for animals which can fly
 */
class ItFlys implements Flys{

	@Override
	public String flys() {
		// TODO Auto-generated method stub
		return "Flying High";
	}
	
}

/*
 * Class implementation for animals which can not fly
 */
class CantFly implements Flys {

	@Override
	public String flys() {
		// TODO Auto-generated method stub
		
		return "Can't Fly";
	}
	
}