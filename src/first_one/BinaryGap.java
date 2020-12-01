package first_one;

public class BinaryGap {
int solution(int N) {
		
		String num = Integer.toBinaryString(N);
		int count = 0;
		int rec = 0;
		
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			int a = Character.getNumericValue(c);
			if( a == 0) {
				count++;
			} else {
				if( rec < count) {
					rec = count;
					count = 0;
				} else {
					count = 0;
				}

			}
		}
		System.out.println(num);
		System.out.println(rec);
		return rec;
	}
	
	public static void main(String[] args) {
		BinaryGap num = new BinaryGap();
		num.solution(9);
		num.solution(529);

		}


}
