
/* this is a solution for the simple problem of determining the correct 
 sequence of brackets. The solution primarily deals with three types of bracket
 "{", "(". "[" . It outputs YES if the sequence is correct and NO is the sequence
 is wrong.*/

package problems;
import java.util.*;
public class BracketSequence {
public static void main(String [] args)
{
	String char_set = "[{{(}}]";
	
	// Declaring a HashMap containing opening bracket as key and closing bracket as value 
	HashMap <String,String> map = new HashMap <String,String>();
	map.put("[","]");
	map.put("{","}");
	map.put("(",")");
	
	// List to keep track of all opening brackets
	ArrayList <String> list = new ArrayList<String>();
	
	String curr_char ="";
	int index =0;
	
	
	for (int i=0;i<char_set.length();i++)
	{
		// if current character is that of the key of a HashMap then increment it to the list
		if (map.containsKey(Character.toString(char_set.charAt(i))))
		{
			list.add(Character.toString(char_set.charAt(i)));
			index ++;
		}
			
		else 
		{	// storing the last added character in the list
			curr_char = list.get(index-1);
			
			// get the corresponding closing pair from the map
			String pair = map.get(curr_char);
			
			// get the current character from the character set
			String list_char = Character.toString(char_set.charAt(i));
			
			// if the current character is not from the opening sequence and 
			// is also not the corresponding closing bracket then sequence is violated
			if (!pair.equals(list_char))
			{
				System.out.println("No");
				break;
			}
			
			else
			{
				// remove the last added element from the list since it has been closed
				list.remove(index-1);
				index--;
			}
		}
	}
	
	// if the list was empty it was a correct sequence 
	if (list.isEmpty())
		System.out.println("Yes");
}
}
