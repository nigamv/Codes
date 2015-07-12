package problems;

/*
 * This program tries to find out the longest substring value in a given string which has 
 * maximum number of K unique characters.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Substring {

	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String : \n");
		String word = scanner.nextLine();
		
		System.out.println("Enter the number of unique characters: \n");
		int max_unique_character = scanner.nextInt();
		
		// ArrayLists for storing current and result subString
		ArrayList<Character> currSubString = new ArrayList<Character>();
		ArrayList<Character> resultSubString = new ArrayList<Character>();
		
	
		
		for (int i=0; i<word.length(); i++){
			// extracting current character from the string
			char currChar = word.charAt(i);
			// continue if not from the specified set of characters
			if (currChar ==' ')
				continue;
			// Add the character in the current subSting
			currSubString.add(currChar);
			
			// Check if the function is valid
			if (isValid(currSubString,max_unique_character)){
				if (currSubString.size() >= resultSubString.size()){
					resultSubString = copyArrayList(currSubString,resultSubString);
				}
			}
			else {
				currSubString.remove(0);
			}
		}
		
		System.out.println(" Longest substring is :");
		System.out.println(resultSubString.toString());
	}
	/*
	 * Function checks if the provided list contains more than the specified number of unique characters
	 * 
	 * @param 		subString	ArrayList to check for uniqueness
	 * @return					boolean value
	 */
	private static boolean isValid(ArrayList<Character> subString, int k){
		ArrayList<Character> charList = new ArrayList<Character>();
		int uniqueCharCount =0;
		for (char currChar:subString){
			
			if (!charList.contains(currChar)){
				charList.add(currChar);
				uniqueCharCount++;
			}
		}
		return (k>= uniqueCharCount);
		
	}
	/*
	 * This function copies one arraylist to another
	 * @param	listToCopy	The arrayList which is to be copied
	 * 
	 * @return				A new list containing all the values of the provided arraylist
	 */
	private static ArrayList<Character> copyArrayList(ArrayList<Character> listToCopy, ArrayList<Character> copiedList){
		copiedList.clear();
		for (char c: listToCopy){
			copiedList.add(c);
		}
		return copiedList;
	}
	}
	
	
