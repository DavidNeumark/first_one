package first_one;

import java.util.Arrays;


public class Bicycles {
	
	public int solution(int[] racks) {
		
		Arrays.sort(racks);

        System.out.printf("Sorted racks[] : %s", 
                          Arrays.toString(racks)); 
        System.out.println();
        
        int dist = 0;
        int max = 0;
        int j = 1;
        for (int i = 0; i < racks.length; i++) {
        		if(j < racks.length) {
    				dist = racks[j++] - racks[i];
    				if(max < dist) {
    					max = dist;
    				}
        		}
		}
        int solution = 0;
        
        if(max == 0) {
        	solution = 0;
        } else if(max == 1) {
        	solution = 1;
        } else  {
            if(max % 2 == 0) {
            	solution = max  / 2;
            } else {
            	solution = ( max - ( max % 2)) / 2;
            }
        }
        System.out.println(solution);
		return solution;
		
	};
	
	
	public static void main(String[] args) {
		
		int[] racks = {10, 0, 8, 2, -1, 12, 11, 3};
		int[] arr1 = {5, 5};
		int[] arr2 = {5, 6};
		int[] arr3 = {25, 3, 0, 8, 2, -1, 12, 11, 3};
		
		Bicycles check = new Bicycles();
		check.solution(racks);
		check.solution(arr1);
		check.solution(arr2);
		check.solution(arr3);
		

	}

}
