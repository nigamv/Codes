package designPatterns.factoryDesignPattern;

import java.util.Scanner;

public class CreateEnemyShip {

	public static void main (String [] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter type of enemy ship to be created U F B");
		
		
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip enemy = null;
		
		String type = "";
		if(in.hasNextLine()){
			type = in.nextLine();
			enemy = shipFactory.createEnemyShip(type);
		}
		if (enemy != null){
			enemy.displayEnemyShip();
			enemy.followHeroShip();
			enemy.shootTheShip();
		}
		else {
			System.out.println("Please enter one of the displayed characters");
		}
	}
}
