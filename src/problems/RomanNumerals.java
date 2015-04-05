package problems;
import java.util.HashMap;


public class RomanNumerals {
	public static void main (String [] args)
	{
		String roman = "XCV";
		HashMap <Character,Integer> map= new HashMap<Character,Integer>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L', 50);
		map.put('C',100);
		int number =0;
		int [] val = new int[roman.length()];
		val[0]= map.get(roman.charAt(roman.length()-1));
		number+= val[0];
		int k=1;
		for (int i= roman.length()-2;i>=0;i--)
		{
			val[k]= map.get(roman.charAt(i));
			if (val[k]< val[k-1])
				number-= val[k];
			else
				number+= val[k];
			k++;
		}
		
		System.out.println(number);	
		
	}

}
