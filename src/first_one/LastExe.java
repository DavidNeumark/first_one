package first_one;

import java.util.ArrayList;
import java.util.List;

public class LastExe {
	
	public int solution(int N) {
		
		String numberString = Integer.toString(N);
		List<Integer> temp = new ArrayList<Integer>();

		for (int i = 0; i < numberString.length(); i++){
		    char c = numberString.charAt(i);
		    int a = Character.getNumericValue(c);
		    	temp.add(a);
		    
		}
		for (int i = 0; i < numberString.length() + 1; i++) {
			if( temp.get(i) < 5) {
				temp.add(i, 5);
				
				break;
			}
		}
//		System.out.println(temp.toString());
		
		N = 0;
		
		for (Integer i : temp) { 
		    N = 10 * N + i;
		}
		System.out.println(N);
		return N;
	}
	
	
	public static void main(String[] args) {
		LastExe max = new LastExe();
		max.solution(670);
		max.solution(268);
		max.solution(0);
	}

}
