package designPatterns;

import designPatterns.abstractClass.Giraffe;

/* Experiment class for showing out various features in inheritance and design 
 * patterns.
 */
public class WorkWithAnimals {

	public static void main(String [] args){
		/* The code snippet below demonstrates creation of an object of 
		 * subclass, and use of methods of parent class directly through these
		 * methods. It elaborates how methods of a parent class can be called 
		 * directly through an object of child class. 
		 */
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		fido.digHole();
		fido.setWeight(-1);
		
		
		System.out.println("Dog name before change name method call:" 
								+ fido.getName());
		changeObjectName(fido);
		
		System.out.println("Dog name after change name method call :"
								+ fido.getName());
		
		/* The code snippet below shows a different way of declaring objects 
		 * of the subclass and there usage.The objects declared below are of Animal
		 * class but are of type either dog or cat subclass. These objects can be 
		 * used to directly call the methods defined in Animal class but not the 
		 * methods defined in the subclasses. 
		 */
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println(" Sound of doggy is :" +doggy.getSound());
		System.out.println(" Sound of kitty is :" +kitty.getSound());
		
		/* The line of code shows below how u need to cast if you want to call a 
		 * method defined in one of the subclasses.
		 */
		((Dog)doggy).digHole();
		
		/* The code snippet below Giraffe is a class than extends from an abstract
		 * class creature.Shows how to extend an abstract class and its 
		 * implementation 
		 */
		
		Giraffe giraffe = new Giraffe();
		giraffe.setName("Frank");
		System.out.println("Name of giraffe is : "+ giraffe.getName());
	}
	
	public static void changeObjectName(Dog fido){
		fido.setName("Marcus");
	}
}
