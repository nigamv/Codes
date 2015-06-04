package designPatterns.strategyDesignPattern;

/* Class Animal is designed to be the core class for demonstrating various design
 * patterns and their usefulness. It consists of common characteristics amongst
 * animals like name, weight,height,sound which are defined here as the private 
 * members of the class.
 * 
 *  The get and set methods defined for each member is used to provide
 *  encapsulation and to access these core characteristics through a method 
 *  interface
 */
public class Animal {

	private String name;
	private int weight;
	private double height;
	private String sound;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if (weight>0)
			this.weight = weight;
		else
			System.out.println("Weight should be greater than zero");
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
}
