package problems;

public class HackerEarthCodeMonk {

	public static void main(String [] args){
		long start = 127833 ;
		long divisor = 1277323;
		String number = "11111111111";
		long modulo = start% divisor;
		long count_modulo = 0;
		if (number.charAt(0) == '1')
			count_modulo = start % divisor;
		
		for ( int i=1; i< number.length(); i++){
			modulo = modulo * modulo ;
			modulo = modulo	% divisor;
			if (number.charAt(i) == '1'){
				count_modulo= (modulo + count_modulo %divisor)% divisor;
			}
			
		}
		
		System.out.println(" result is "+ count_modulo);
	}
}
