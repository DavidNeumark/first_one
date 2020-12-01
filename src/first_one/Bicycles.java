package first_one;

import java.util.Arrays;

public class Bicycles {
	
	public int solution(int[] racks) {
		
		int solution = 0;
		
		if( racks.length < 2 || racks.length > 100_000) {
			throw new IllegalArgumentException("The number of bicycles on one rack is not legal!");

		} else {
			
			Arrays.sort(racks);
	        System.out.printf("Sorted racks[] : %s", Arrays.toString(racks)); 
	        
	        int dist = 0;
	        int max = 0;
	        int j = 1;
	        
	        for (int i = 0; i < racks.length - 1; i++) {
	        	if( racks[i] >= -1_000_000 && racks[i] <= 1_000_000 ) {
	        		if(j < racks.length) {
	    				dist = racks[j++] - racks[i];
	    				if(max < dist) {
	    					max = dist;
	    				}
	        		}
	        		solution = max / 2;
	        	} else {
	        		throw new IllegalAccessError("out of range!");
	        	}

			}

		}
		
        System.out.println(solution);
		return solution;
		
	};
	
	public static void main(String[] args) {
		
		int[] racks1 = {10, 0, 8, 2, -1, 12, 11, 3};
		int[] racks2 = {5, 5};
		int[] arr1 = {5, 6};
		int[] arr2 = {2_000_000_000, 3, 0, 8, 2, -1, 12, 11, 3};
//		int[] arr3 = new int[100_001];
		int[] arr4 = {5};
		
		Bicycles check = new Bicycles();
		check.solution(racks1);
		check.solution(racks2);
		check.solution(arr1);
		check.solution(arr2);
// 		check.solution(arr3);
 		check.solution(arr4);
		
	}

}
