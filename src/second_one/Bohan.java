package second_one;

public class Bohan {
	public static int biggerNum(int[] nums1) {
		int bigger = 0;
		int tmp = bigger;
		for (int i = 0; i < nums1.length - 2; i++) {
			tmp = (nums1[i] * 100) + (nums1[i + 1] * 10) + nums1[i + 2];
			if (tmp > bigger)
				bigger = tmp;
		}
		return bigger;
	}

	public static void main(String[] args) {
		// in off numbers 1 and 2
		int[] nums1 = new int[15];
		int[] nums2 = new int[15];
		// putting value into numb1 and print
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) (Math.random() * 10);
			System.out.print(nums1[i] + " ,");
		}
		System.out.println();
		// putting value into num2 and print
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = (int) (Math.random() * 10);
			System.out.print(nums2[i] + " ,");
		}
		System.out.println();
		// Function Look for the highest number (the function at the top of the class)
		System.out.println(biggerNum(nums1));
		// new array 
		int[] distinct = new int[10];
		for (int i = 0; i < distinct.length; i++) {
			distinct[i] = -1;
		}
		// array to which checks if there are double numbers (numbers = 0)
		int[] existNums = new int[10];
		int index = 0;

		for (int i = 0; i < existNums.length; i++) {
			existNums[i] = 0;
		}
		// test if  num of numbs 1 exist num of numbs2
		for (int i = 0; i < nums1.length; i++) {
			boolean exist = false;
			int a = nums1[i];

			for (int j = 0; j < nums2.length; j++) {
				int b = nums2[j];
				if (a == b) {
					exist = true;
					break;
				}
			}
		//only if don"t exist in another array		
			if (!exist) {
				if (existNums[a] == 0) {
					distinct[index] = a;
					index++;
					existNums[a] = 1;
				}
			}

		}
		//putting the second array
		for (int i = 0; i < nums2.length; i++) {
			boolean exist = false;
			int a = nums2[i];

			for (int j = 0; j < nums1.length; j++) {
				int b = nums1[j];
				if (a == b) {
					exist = true;
					break;
				}
			}

			if (!exist) {
				if (existNums[a] == 0) {
					distinct[index] = a;
					index++;
					existNums[a] = 1;
				}
			}

		}
			//Wow!!! now print (and coffee :)) 
		for (int i = 0; i < distinct.length; i++) {
			System.out.print(distinct[i] + ",");

		}
		// the sum 
		int number = 0;
		for (int i = 0; i < distinct.length; i++) {
			if (distinct[i] == -1) {
				break;
			}
			number = number * 10;
			number += distinct[i];

		}
		System.out.println();
		System.out.println(number);

	}

}
