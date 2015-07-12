package designPatterns.factoryDesignPattern;

public class EnemyShipFactory {

	
	public EnemyShip createEnemyShip(String type){
		if (type.equalsIgnoreCase("U")){
			return new UFOEnemyShip();
		}
		else if (type.equalsIgnoreCase("R")){
			return new RocketEnemyShip();
		}
		else if (type.equalsIgnoreCase("B")){
			return new BIGUFOEnemyShip();
		}
		else 
			return null;
	}
}
