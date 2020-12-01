package first_one;

import java.util.ArrayList;
import java.util.List;

public class LastExe {
	
	public int solution(int N) {
		
		String numberString = Integer.toString(N);
		List<Integer> temp = new ArrayList<Integer>();
		boolean flag = true;

		for (int i = 0; i < numberString.length(); i++){
		    char c = numberString.charAt(i);
		    if( c == '-' ) {
		    	flag = false;
		    } else {
			    int a = Character.getNumericValue(c);
		    	temp.add(a);
		    }
		}
		
		if( flag == true) {
			for (int i = 0; i < numberString.length() + 1; i++) {
				if( temp.get(i) < 5) {
					temp.add(i, 5);
					break;
				}
			}
			
			N = 0;
			for (Integer i : temp) { 
			    N = 10 * N + i;
			}
		} else {
			for (int i = 0; i < numberString.length() + 1; i++) {
				if( temp.get(i) > 5) {
					temp.add(i, 5);
					break;
				}
			}
			
			N = 0;
			for (Integer i : temp) { 
			    N = 10 * N + i;
			}
			N =  N * -1;
			flag = true;
		}
		
		System.out.println(N);
		return N;
	}
	
	
	public static void main(String[] args) {
		LastExe max = new LastExe();
		max.solution(670);
		max.solution(268);
		max.solution(0);
		max.solution(-499);
	}

}
