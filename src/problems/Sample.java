package problems;

import java.io.*;
import java.util.*;

public class Sample {

	public static void main (String [] args ){
	Scanner in = new Scanner (System.in);
    String line = in.nextLine();
    
    int limit = Integer.parseInt(line);
    
    int [] array = new int[limit];
    
    while (in.hasNextLine()){
        line = in.nextLine();
        String [] tokens = line.split(" ");
        
        for (int i=0; i<tokens.length; i++){
            array[i] = Integer.parseInt(tokens[i]);
            System.out.println(array[i]);
        }
    }
  } 
	
}
