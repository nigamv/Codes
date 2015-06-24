/*
 * This class provides a solution to rotating the numbers of a square matrix one index at a time. 
 * It is not a solution for rotating the array by 90 degrees.
 * 
 * The solution focuses on starting to rotate the outermost square and then moving inwards in 
 * form of concentric circles. 
 */

package problems;


import java.util.*;

public class AmazonProblem1 {

	public static void main(String [] args){
	
		// Deciding the size of matrix
		int limit =3 ;
		
		// Declaring matrices of the given dimension. 
		int [][] oldArray = new int [limit][limit];
		int [][] newArray = new int [limit][limit];
		
		Random random = new Random ();
		
		// Generating a random matrix
	    for (int i=0; i<limit; i++){
	    	for (int j=0; i<limit; j++){
	    		oldArray[i][j]= random.nextInt(100 - 0 + 1) + 0;
	    	}
	    }
	    
	    // Display the randomly generating matrix 
	    System. out.println("Input array is :");
	    displayArray(oldArray, limit);
	    
	    // rotating matrix elements one index at a time
	    newArray = rotateArray(oldArray, limit);
	    
	    // displaying the rotated array
	    System.out.println(" Rotated asrray is:");
	    displayArray(newArray, limit);
	}
		
		/*
		 * The function below displays the given matrix
		 * 
		 * @param	array	matrix to be displayed
		 * 			limit	dimension of the square matrix
		 * 
		 * 
		 */
		private static void displayArray(int [][] array, int limit){
			for (int i=0; i< limit ; i++){
				for (int j=0; j<limit ; j++){
					System.out.print(array[i][j]+ " ");
				}
				
				System.out.println(" ");
			}
		}
	 
		/*
		 * This function rotates the given matrix one index at a time
		 * 
		 * @param	oldArray	the matrix to be rotated
		 * 			limit		dimension of the square matrix
		 * 
		 * @return	newArray	rotated matrix
		 */
	    private static int [][] rotateArray (int [][] oldArray, int limit){
	        //Declaring variables to keep track of the boundaries which are to be rotated
	        int innermost =0;
	        int outermost = limit-1;
	        
	        // declaring a new array to store the rotated values
	        int [][] newArray = new int [limit][limit];
	        
	        // local variables to keep track of indices
	        int i=0;
	        int j=0;
	        
	        while (innermost < outermost){
	            
	        	// rotating the first row
	            i=innermost;
	            j=innermost;
	            
	            while (j < outermost){
	                newArray [i][j+1]= oldArray[i][j];
	                j++;
	            }
	            
	            // rotating the last column
	            i=innermost;
	            j= outermost;
	            
	            while (i < outermost){
	                newArray [i+1][j]= oldArray[i][j];
	                i++;
	            }
	            
	            // rotating the last row
	            i=outermost;
	            j=outermost;
	            
	            while (j > innermost){
	                newArray [i][j-1]= oldArray[i][j];
	                j--;
	            }
	            
	            // rotating the first column
	            i= outermost;
	            j=innermost;
	            
	            while (i > innermost){
	                newArray [i-1][j]= oldArray[i][j];
	                i--;
	            }
	            
	            // moving to inner square to be rotated
	            innermost ++;
	            outermost --;
	            
	        }
	        
	        // copying the center element in case of odd dimension square matrix such as 3x3 and 5x5
	        if (innermost == outermost){
	            newArray[innermost][outermost] = oldArray[innermost][outermost];
	        }
	        
	        return newArray;
	    }
	}
