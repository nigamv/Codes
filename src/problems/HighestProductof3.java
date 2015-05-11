package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class HighestProductof3 {

	public static void main (String [] args)
	{
		int [] array = new int [10];
		Random generator = new Random ();
		
		for (int i=0; i<10; i++)
			array[i]= generator.nextInt(201) - 100;
		
		System.out.println("input array");
		for (int i=0; i<10;i++)
			System.out.print(array[i]+ " ");
		System.out.println("----------");
		
		int highest_product_of3 =array[0]*array[1]*array[2];
		int highest_product_of2 =array[0]*array[1];
		int lowest_product_of2= array[0]*array[1];
		int highest = Math.max(array[0], array[1]);
		int lowest = Math.min(array[0], array[1]);
		int current =0;
		
		for (int i=2;i<array.length;i++)
		{
			current = array[i];
			highest_product_of3 = Math.max(Math.max(highest_product_of3, 
											current*highest_product_of2),
											current*lowest_product_of2);
			highest_product_of2 = Math.max(Math.max(highest_product_of2, 
											current*highest),
											current*lowest);
			lowest_product_of2 = Math.min(Math.min(lowest_product_of2,
											current*highest), current*lowest);
			highest = Math.max(highest, current);
			lowest = Math.min(lowest, current);
			
		}
		
		System.out.println("Highest product is "+ highest_product_of3);
	}
}
