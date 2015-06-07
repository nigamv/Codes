
package problems;

import java.util.ArrayList;
import java.util.Collections;

/*
 * The class provides solution to the factorial problem without running out of 
 * memory for any given number. Solution is based on implying basic functions of
 * multiplication using ArrayList as the basic data structure for storing the 
 * number and the factorial result 
 */
public class Factorial {
	
	private static ArrayList<Integer> result = new ArrayList<Integer>();

	
	public static void main(String [] args){

		factorial(101);
		displayNumber(result);
		display_no_in_Power(result);
	}
	
	/*
	 * Function to calculate factorial of any given number
	 * 
	 * @param	number	number of which the factorial is to be calculated
	 */
	public static void factorial (int number){
		// temporary ArrayList to store the value of converted number
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		// ArrayList to store results temporarily in between multiplication process
		ArrayList<Integer> temp_result = new ArrayList<Integer>();
		
		// ArrayList to store the temporarily removed numbers
		ArrayList<Integer> temp_storage = new ArrayList<Integer>();
		
		// variable to keep track of how many elements are to be removed from 
		//temp_result
		int loop_count =-1;
		
		// return if given number is zero
		if (number == 0)
			return;
		
		// initialize result if not yet intialized
		if (result.size()==0)
			result =convert2Array(number);
		
		else {
			// store number converted into array
			temp =convert2Array(number);
			
			// switch between multiplication from single digit or higher number
			switch (temp.size()){
				// when to be multiplied by single digit
				case 1: result = multiply(result,temp.get(0));
						break;
				
				// when to be multiplied by double digit or more		
				default: for (int i= temp.size()-1; i>=0; i--){
							// List to keep track of current multiplications
							ArrayList<Integer> curr = new ArrayList<Integer>();
							
							// multiply and store result
							curr = multiply(result,temp.get(i));
							
							// increment loop count to keep track of digits multiplied
							loop_count ++;
							
							// remove elements not to be added and temporarily store them
							for (int j =0; j < loop_count;j++){
								int temp_size = temp_result.size()-1;
								temp_storage.add(temp_result.get(temp_size));
								temp_result.remove(temp_size);
							}
							
							// updae the value of temp_result
							temp_result = sum2ArrayList(curr,temp_result);
							
							// add the initially removed elements 
							for (int j=0; j< temp_storage.size();j++)
								temp_result.add(temp_storage.get(j));
							
							// clear temporary storage
							temp_storage.clear();
						}
						// clear the global result
						result.clear();
						
						// copy back the current result to global result variable
						for (int digit: temp_result)
							result.add(digit);
						
						// clear temporary result
						temp_result.clear();
						break;
			}
		}
		
		// recursively call the function till number is not equal to zero
		factorial(number-1);
	}
	
	/*
	 * Function to display the value of factorial
	 * 
	 * @param	result	factorial result to be displayed in the form of a list
	 */
	public static void displayNumber (ArrayList<Integer> result){
		if (result.size()==0){
			System.out.println(1);
			return;
		}
		
		for (int digit: result)
			System.out.print(digit + " ");
	}
	
	/*
	 * Function to display the value of factorial in power form
	 * 
	 * @param	result	factorial result to be displayed in the form of a list
	 */
	public static void display_no_in_Power(ArrayList<Integer> result){
		if (result.size()==0){
			System.out.println(1);
			return;
		}
		
		int count =0;
		int first_digit = result.get(0);
		while (count < result.size())
			count ++;
		System.out.println(" result in power form :");
		System.out.print(first_digit + "power" + (count-1));
	}
	
	/*
	 * Function to convert a number into array
	 * 
	 * @param 	n	number to be converted
	 * 
	 * @return		ArrayList representing number
	 * 
	 */
	public static ArrayList<Integer> convert2Array(int n){
		// declaring an empty ArrayList
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		// convert number to array by appending modulus in each loop
		while (n!=0){
			temp.add(n%10);
			n=n/10;
		}
		
		// reverse the list to get actual number
		Collections.reverse(temp);
		
		return temp;
	}
	
	/*
	 * Function to calculate the sum of two numbers given as ArrayList
	 * 
	 * @param	first	first number as ArrayList
	 * @param 	second	second number as ArrayList
	 * 
	 * @return			sum of the two numbers as ArrayList
	 */
	public static ArrayList<Integer> sum2ArrayList(ArrayList<Integer> first, ArrayList<Integer> second){
		// initialize an empty ArrayList to save the result 
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		// initializing temporary variables for the use
		int temp_digit =0;
		int carry =0;
		
		// initializing the counter values
		int first_no_counter = first.size()-1;
		int second_no_counter = second.size() -1;
		
		
		while (first_no_counter >= 0 || second_no_counter >= 0){
			// initializing temporary variables for usage inside loop
			int first_number =0;
			int second_number=0;
			
			// storing digit for addition from first number 
			if (first_no_counter >= 0)
				first_number = first.get(first_no_counter);
			
			// storing digit from second number for addition
			if (second_no_counter >= 0)
				second_number = second.get(second_no_counter);
			
			// performing sum of two digits and then adding into the array
			temp_digit = (first_number+ second_number+ carry)%10;
			carry = (first_number+ second_number+ carry)/10;
			temp.add(temp_digit);
			
			// decrementing the counters
			first_no_counter--;
			second_no_counter--;
			
		}
		
		// add carry value to the list if it is not zero 
		if (carry !=0)
			temp.add(carry);
		
		// reversing the list to get the actual number
		Collections.reverse(temp);
		
		// return the list 
		return temp;
	}
	
	/*
	 * Function to calculate multiplication of a number by a digit
	 * 
	 * @param	number	number to be multiplied 
	 * @param	digit	digit with which the number is to be multiplied
	 * 
	 * @return			result of the multiplication
	 */
	public static ArrayList<Integer> multiply(ArrayList<Integer> number, int digit){
		
		// declaring an empty ArrayList to store results
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		// initializing temporary variables
		int temp_digit =0;
		int carry =0;
		
		// perform multiplication on the number by the given digit
		for (int i=number.size()-1; i >=0 ;i--){
			// store the unit digit of multiplication value in temp_digit
			temp_digit = (number.get(i)*digit+carry)%10;
			
			// calculate the value to be carried forward
			carry = (number.get(i)*digit+carry)/10;
			
			// add the temp_digit in the ArrayList
			temp.add(temp_digit);
		}
		
		// add carry value in the list if it is not zero
		if (carry!=0)
			temp.add(carry);
		
		// reverse the list to get actual number
		Collections.reverse(temp);
		
		// return the number
		return temp;
	}
}
