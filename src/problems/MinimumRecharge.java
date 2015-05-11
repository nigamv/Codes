package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* This program finds solution to the minimum recharge problem. 
 * The premise of the the problem is that there are N number of relatives
 * whom are being called. Each relative recharges the phone by a certain amount 
 * after the call is completed. 
 * 
 * Relatives can be called in any number and each relative is called only once. 
 * Thus each realtive has a unique call duration.
 */
public class MinimumRecharge {
	public static void main (String [] args){
		int [] call_details = new int [5];          // Decalring an empty array of size 5
		Random rn = new Random();                   // Creating an object of Random
		
		for (int i=0; i<call_details.length;i++)    // Randomly generating recharge minutes for call duration
			call_details[i]= rn.nextInt(call_details.length);         //  Index of the array represents call duration to the relative 
		
		System.out.println("Details of call duration and recharge are");
		
		for (int i=0; i<call_details.length;i++)
			System.out.print(call_details[i]+ " ");
		System.out.println("");
		
		HashMap<Integer,List<Integer> > call_map = new HashMap<Integer,List<Integer> >();

		
/*  The for loop below scans through the whole array and creates a map of (recharge value, call cost)
 *  Recharge value obtained is the key and call cost
 */
		
		for(int i=0; i<call_details.length;i++){
			if (call_map.containsKey(call_details[i])){
				ArrayList<Integer>value = (ArrayList<Integer>) call_map.get(call_details[i]);
				value.add(i+1);
				call_map.put(call_details[i], value);                     
			}
			else {
				ArrayList<Integer> value = new ArrayList<Integer>();
				value.add(i+1);
				call_map.put(call_details[i],value);
			}
			
		}
		Set<Integer> keySet = call_map.keySet();
		
		int minimum_recharge = call_details.length;
		if (call_map.containsKey(0) && sum(call_map.get(0))> minimum_recharge){                                         // Identifying the initial value of minimum recharge required
			minimum_recharge = sum(call_map.get(0));
			keySet.remove(0);
		}
		
		int cost =0;
		
		for (int key:keySet){
			cost= sum(call_map.get(key))- (call_map.get(key).size()*key);    // looping through all key values to determine the value of 
																			//	minimum_recharge
			if (cost > 0)
				minimum_recharge+= cost;
		}
		
		System.out.println("Minimum recharge required: "+ minimum_recharge);
		
	}
	
	private static int sum(List<Integer> list){
		
		int sum=0;
		for (int value: list)
			sum+= value;
		return sum;
	}
}
