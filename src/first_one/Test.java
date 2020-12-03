package first_one;

import java.util.Arrays;

public class Test {
	
	public int solution(int[] list) {
		
		int solution = 0;
		for (int i = 0; i < list.length; i++) {
			switch (list[i]) {
			case 0: break;
			case 1: 
				solution = solution + 1;
				break;
			case 2: 
				solution = solution + 2;
				break;
			case 3: 
				solution = solution + 4;
				break;
			case 4: 
				solution = solution + 8;
				break;
			case 5: 
				solution = solution + 16;
				break;
			}
		}
		System.out.println("O programa descobriu o numero secreto: " + solution);
		return solution;

	}
	
	public int[] helper(int num) {
		
		int[] seq1 = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 };
		int[] seq2 = { 2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31 };
		int[] seq3 = { 4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31 };
		int[] seq4 = { 8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31 };
		int[] seq5 = { 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 };
		
		int[][] arrays = {seq1, seq2, seq3, seq4, seq5};
		
		int[] list = new int[5];

		for (int i = 0; i < 5; i++) {
			for (int[] arr : arrays) {
				for (int j = 0; j < arr.length; j++) {
					if( arr[j] == num ) {
						list[i] = i+1;
						break;
					}
				}
				i++;
			}
		}

		System.out.println("Lista de onde esta o numero: " + Arrays.toString(list));
		return list;
	}
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 32);
		int[] list = {3,4};
		
		Test test = new Test();
		System.out.println("Numero secreto: " + num);
		int[] c = test.helper(num);
		
		test.solution(list);
	}
}


