package problems;
/*
 * This class provides a solution to the problem of finding first unique character
 * in a given string
 */
public class FirstNonRepeatCharacter {
	
	public static void main (String [] args){
		// Declaring a string word
		String word = "MoMrrnnoinngg";
		int [] charArray = new int[256];
		boolean flag = true;
		for (int i=0; i< word.length();i++){
			charArray[Character.getNumericValue(word.charAt(i))] +=1 ;
		}
		
		for (int i=0; i< word.length(); i++){
			if (charArray[Character.getNumericValue(word.charAt(i))]==1){
				System.out.println("The first non repeating character is "
									+ word.charAt(i));
				flag = false;
				break;
			}
		}
		
		if (flag){
			System.out.println("No non repeating character in the string ");
		}
		
		
	}

}
