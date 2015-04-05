
// this is a solution for the simple problem of determining the correct 
// sequence of brackets. The solution primaril deals with three types of bracket
// "{", "(". "[" . It outputs YES if the sequence is correct and NO is the sequence
// is wrong.

package problems;
import java.util.*;
public class BracketSequence {
public static void main(String [] args)
{
	String char_set = "[{{(}}]";
	HashMap <String,String> map = new HashMap <String,String>();
	map.put("[","]");
	map.put("{","}");
	map.put("(",")");
	ArrayList <String> list = new ArrayList<String>();
	String curr_char ="";
	int index =0;
	for (int i=0;i<char_set.length();i++)
	{
		
		if (map.containsKey(Character.toString(char_set.charAt(i))))
		{
			list.add(Character.toString(char_set.charAt(i)));
			index ++;
		}
			
		else 
		{
			curr_char = list.get(index-1);
			String pair = map.get(curr_char);
			String list_char = Character.toString(char_set.charAt(i));
			if (!pair.equals(list_char))
			{
				System.out.println("No");
				break;
			}
			else
			{
				list.remove(index-1);
				index--;
			}
		}
	}
	if (list.isEmpty())
		System.out.println("Yes");
}
}
