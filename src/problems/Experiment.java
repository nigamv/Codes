package problems;
import java.util.*;
import java.io.*;
import java.math.*;

public class Experiment {
	
	public static void main (String [] args){
		
		int [] [] newArray = new int [4][4];
		
		Random random = new Random();
		for (int i=0; i < 4 ; i++){
			for (int j=0; j< 4; j++){
				newArray[i][j]= random.nextInt(100 - 0 + 1) + 0;
			}
		}
		
		HashSet <Integer> set = new HashSet<Integer>();
		HashMap <Integer,Integer> xmap = new HashMap <Integer,Integer> ();
		HashMap <Integer,Integer> ymap = new HashMap<Integer,Integer> ();
		for (int i=0; i< 4; i++){
			for (int j=0; j < 4; j++){
				System.out.print(newArray[i][j]+ " ");
			}
			
			System.out.println(" ");
		}
		
		int index =2 ;
		boolean flag =false;
		
		for (int i=0; i< 3; i++){
			for (int j=0; j < 3 ; j++){
				int sum =0;
				if (!set.contains(newArray[i][j])){
					set.add(newArray[i][j]);
					xmap.put(newArray[i][j], i);
					ymap.put(newArray[i][j], j);
				}
				
				else {
					int xvalue = xmap.get(newArray[i][j]);
					int yvalue = ymap.get(newArray[i][j]);
					sum = Math.abs((xvalue -i))+ Math.abs((yvalue-j));
					if (sum <= index){
						System.out.println(sum);
						System.out.println(index);
						flag= true;
						
					}
				}
		     }
			
		}
		
		if (flag){
			System.out.println("YES");
			
		}
		
		else {
			System.out.println("NO");
		}
	}

}
