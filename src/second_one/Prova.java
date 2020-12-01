package second_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Prova {
	
	public void solution() {
		
		// lets create the arrays
		int[] nums1 = new int[15];
		int[] nums2 = new int[15];
		
		// and populate them with random numbers
		for (int i = 0; i < nums1.length; i++) {
			int num = (int)(Math.random() * 10);
			nums1[i] = num;
		}
		for (int i = 0; i < nums2.length; i++) {
			int num = (int)(Math.random() * 10);
			nums2[i] = num;
		}
		
		System.out.println("nums1 => " + Arrays.toString(nums1));
		System.out.println("nums2 => " + Arrays.toString(nums2));
		
		// get the max value
		String string;
		int temp = 0;
		int max = 0;
		
		for (int i = 0; i < 13; i++) {
			string = Integer.toString(nums1[i])+Integer.toString(nums1[i+1])+Integer.toString(nums1[i+2]);
			temp = Integer.parseInt(string);
			if(temp > max) {
				max = temp;
			}
		}
		System.out.println("max number in nums1: " + max);
		
		// --------------------
		
		int[] distinct = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		System.out.println("distinct before => " + Arrays.toString(distinct));
		
		// temporary lists:
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> t = new ArrayList<Integer>();
		
		// populate t with all nums1 and nums2 elements
		for (int i = 0; i < 15; i++) {
			t.add(nums1[i]);
		}
		for (int i = 0; i < 15; i++) {
			t.add(nums2[i]);
		}
		
		// remove duplicates and add them on list
        for (int element : t) { 
            if (!list.contains(element)) { 
                list.add(element); 
            } 
        } 
        
		// add the unic elements of nums1 and nums2 on distinct
		for (int i = 0; i < distinct.length; i++) {
			if(i <= list.size() && i < list.size()) {
				distinct[i] = list.get(i);
			}
		}
		
		System.out.println("distinct after => " + Arrays.toString(distinct));
		
		// print the number of distinct without the -1s
		// list contains all the ints of distinct but without the -1s
        Integer[] arr = new Integer[list.size()]; 
        arr = list.toArray(arr); 
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
			array[i] = (int) arr[i];
		}
        
        // convert the list to String using IntSteam
		String s = String.join("", IntStream.of(array).mapToObj(String::valueOf).toArray(String[]::new));
		System.out.println("the number is => " + s);
	}

		// ###########################
		public static void main(String[] args) {
			Prova prova = new Prova();
			prova.solution();
		}
}


