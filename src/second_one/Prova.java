package second_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import com.sun.tools.javac.util.ArrayUtils;

public class Prova {
	
	public void solution1() {
		
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
		// t will stores nums1 without the duplicates
		List<Integer> t = new ArrayList<Integer>();
		// t2 will stores nums1 without the duplicates
		List<Integer> t2 = new ArrayList<Integer>();
		// t will stores the unique values of nums1 and nums2
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
		
		// populate nums33 with t3 values (those are the unique values of the to lists
		for (int i = 0; i < t3.size(); i++) {
			nums33[i] = t3.get(i);
		}
		
		// create distinct
		int[] distinct = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		
		for (int i = 0; i < nums33.length; i++) {
			distinct[i] = nums33[i];
		}
		
		System.out.println("distinct after => " + Arrays.toString(distinct));
		
        // convert the list to String using IntSteam
		String s = String.join("", IntStream.of(nums33).mapToObj(String::valueOf).toArray(String[]::new));
		System.out.println("the number is => " + s);
	}
	
	public void solution2() {
		
		var stream1 = Arrays.stream(new int[15]);
		var stream2 = Arrays.stream(new int[15]);
		
		int[] nums1 = stream1
			.map(n -> n = (int)(Math.random() * 10))
			.toArray();

		
		int[] nums2 = stream2
				.map(n -> n = (int)(Math.random() * 10))
				.toArray();
		
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		
		
		var stream3 = Arrays.stream(nums1);
		int[] nums3 = stream3.distinct().toArray();
		
		System.out.println(Arrays.toString(nums3));
		
		var stream4 = Arrays.stream(nums2);
		int[] nums4 = stream4.distinct().toArray();
		
		System.out.println(Arrays.toString(nums4));
		
		int[] distinct = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		
			for (int j = 0; j < nums3.length; j++) {
				boolean check = false;
				for (int k = 0; k < nums4.length; k++) {
					if (nums3[j] == nums4[k]) {
						check = true;
						break;
					}
				}
				for (int i = 0; i < distinct.length; i++) {
					if (!check && distinct[i] == -1) {
						distinct[i] = nums3[j];
						break;
					}
				}
			}
			
			for (int j = 0; j < nums4.length; j++) {
				boolean check = false;
				for (int k = 0; k < nums3.length; k++) {
					if (nums4[j] == nums3[k]) {
						check = true;
						break;
					}
				}
				for (int i = 0; i < distinct.length; i++) {
					if (!check && distinct[i] == -1) {
						distinct[i] = nums4[j];
						break;
					}
				}
			}
		
		System.out.println(Arrays.toString(distinct));
		
		var stream5 = Arrays.stream(distinct);
		int[] nums5 = stream5.filter(n -> n != -1).toArray();
		
		String s = String.join("", IntStream.of(nums5).mapToObj(String::valueOf).toArray(String[]::new));
		System.out.println("the number is => " + s);

		
	}

		// ###########################
		public static void main(String[] args) {
			Prova prova = new Prova();
			prova.solution1();
			prova.solution2();
		}
}


