package second_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//import com.sun.tools.javac.util.ArrayUtils;

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
		
		
		// temporary lists:
		List<Integer> t = new ArrayList<Integer>();
		List<Integer> t2 = new ArrayList<Integer>();
		List<Integer> t3 = new ArrayList<Integer>();
		
		// remove duplicate and store then on t
		for (int i = 0; i < nums1.length; i++) {
			if (!t.contains(nums1[i])) {
				t.add(nums1[i]);
			}
		}
		
		// remove duplicate and store then on t2
		for (int i = 0; i < nums2.length; i++) {
			if (!t2.contains(nums2[i])) {
				t2.add(nums2[i]);
			}
		}
		
		// get the unique value of t
		for (Integer integer : t) {
			boolean check = false;
			for (Integer integer2 : t2) {
				if(integer == integer2)
					check = true;
			}
			if(!check)
				t3.add(integer);
		}
		
		// get the unique value of t2
		for (Integer integer : t2) {
			boolean check = false;
			for (Integer integer2 : t) {
				if(integer == integer2)
					check = true;
			}
			if(!check)
				t3.add(integer);
		}
		// temporary array nums33
		int[] nums33 = new int[t3.size()];
		
		// popu;ate nums33 with t3 values (those are the unique values of the to lists
		for (int i = 0; i < t3.size(); i++) {
			nums33[i] = t3.get(i);
		}
		
		int[] distinct = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		
		for (int i = 0; i < nums33.length; i++) {
			distinct[i] = nums33[i];
		}
		
		System.out.println("distinct after => " + Arrays.toString(distinct));
		
        // convert the list to String using IntSteam
		String s = String.join("", IntStream.of(nums33).mapToObj(String::valueOf).toArray(String[]::new));
		System.out.println("the number is => " + s);
	}

		// ###########################
		public static void main(String[] args) {
			Prova prova = new Prova();
			prova.solution();
		}
}


