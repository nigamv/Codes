package problems;
/*
 * This class provides a solution to the problem of finding highest product of 3
 * numbers in a given array
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class HighestProductof3 {

	public static void main (String [] args)
	{
		int [] array = new int [10];
		Random generator = new Random ();
		
		// generating an array of random numbers 
		for (int i=0; i<10; i++)
			array[i]= generator.nextInt(201) - 100;
		
		System.out.println("input array");
		for (int i=0; i<10;i++)
			System.out.print(array[i]+ " ");
		System.out.println("----------");
		
		// initializing highest product of 3 numbers
		int highest_product_of3 =array[0]*array[1]*array[2];
		
		// initializing highest product of 2 numbers
		int highest_product_of2 =array[0]*array[1];
		
		// initializing lowest product of 2 numbers
		int lowest_product_of2= array[0]*array[1];
		
		// highest number
		int highest = Math.max(array[0], array[1]);
		
		// lowest number 
		int lowest = Math.min(array[0], array[1]);
		
		int current =0;
		
		for (int i=2;i<array.length;i++)
		{
			current = array[i];
			
			// recalculating highest product of 3
			highest_product_of3 = Math.max(Math.max(highest_product_of3, 
											current*highest_product_of2),
											current*lowest_product_of2);
			
			// recalculating highest product of 2 
			highest_product_of2 = Math.max(Math.max(highest_product_of2, 
											current*highest),
											current*lowest);
			
			// recalculating lowest product of 2
			lowest_product_of2 = Math.min(Math.min(lowest_product_of2,
											current*highest), current*lowest);
			
			// recalculating highest number
			highest = Math.max(highest, current);
			
			// recalculating lowest number
			lowest = Math.min(lowest, current);
			
		}
		
		System.out.println("Highest product is "+ highest_product_of3);
	}
}
