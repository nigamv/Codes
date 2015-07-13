package problems;
/*
 * This program reverses the words in a sting in linear time.
 */
public class ReverseWordsinSentence {

	public static void main(String [] args){
		// Input sentence
		String sentence = "Java is  best programming language";
		if (sentence.isEmpty()|| sentence == null)
			System.out.println(" No sentence provided");
		else if (sentence.length() ==1)
			System.out.println("sentence");
		
		// Store the different words in a sentence in a string array
		else {
			String [] array = sentence.split(" ");
			String temp ="";
			
			int i=0;
			int j= array.length-1;
			
			// running a loop to swap the position of the words
			while (i <= array.length/2){
				temp= array[i];
				array[i]= array[j];
				array[j] = temp;
				
				i++;
				j--;
			}
			
			// Print the final output 
			i=0;
			while (i<array.length){
			
				System.out.print(array[i]+" ");
				i++;
			}
		}
		
		
		
	}
}
