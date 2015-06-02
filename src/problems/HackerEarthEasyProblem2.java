package problems;

/* This problem aims to find the maximum no of characters in a string of two 
 * characters R and K. The aim of the problem is to find the maximum no of R 
 * possible in any given random sequence of K . 
 * 
 * One is allowed to go only one pass through the sequence and identify a start
 * and an end point in between which the characters can be flipped ( R becomes K 
 * and K becomes R. For eg: in a sequence of "RKKRK" maximum no of possible R is 4.
 */
public class HackerEarthEasyProblem2 {

	public static void main (String [] args){
		String line = "KKRRRKKKRRRRKKKK";
	
		int r_count =0;
    	int r_seq_length =0;
   // 	int k_req_seq_length=0;
    	int k_seq_length =0;
    	int maxR =0;
    	int k_new_seq_length=0;
    	boolean k_found=false;

    	for (int k=0; k < line.length(); k++){
    		char ch = line.charAt(k);
    		
    		if (ch =='R'&& k_found == false)
    			r_count+=1;
    		
    		else if (ch == 'R'){
    			
    	   		r_count+=1;
    	   		r_seq_length+=1;
    			}	
    		
    		else if (ch == 'K'){
    			k_found = true;
    			if (r_seq_length >= k_seq_length){
    				k_new_seq_length+=1;
    				
    			}
    			else if ((r_seq_length!=0) && (k != line.length()-1)){
    				k_seq_length= k_seq_length - r_seq_length +1;
    				r_count -=r_seq_length;
    				r_seq_length =0;
    			}
    			else if (r_seq_length !=0){
    				k_seq_length= k_seq_length - r_seq_length +1;
    				r_seq_length =0;
    			}
    			else {
    				k_seq_length+=1;
    			}
    		}
    		if (k_new_seq_length > k_seq_length){
    				r_seq_length =0;
    				k_seq_length = k_new_seq_length;
    				k_new_seq_length =0;
    			}
    		
    	   
    }
    if (k_found == false){
    	
    	maxR = r_count-1;
    }
    else {
    	maxR = r_count+k_seq_length;
    }
    
    System.out.println("Maximum no of R is : " + maxR);
}
	
}
