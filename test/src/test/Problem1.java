package test;

import java.util.Scanner;

public class Problem1 {
	public int sumSearch(int[] array, int target) {
		int best_sum = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					int sum = array[i] + array[j] + array[k];
					if (Math.abs(sum - target) < Math.abs(best_sum - target)) {
						best_sum = sum;
					}
				}
			}
		}
		return best_sum;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Problem1 p = new Problem1();
		while(sc.hasNext()) {
			String s = sc.nextLine();
			String[] substrs = s.split(" ");
			int[] array = new int[substrs.length - 1];
			int target = Integer.parseInt(substrs[0]);
			for (int i = 1; i < substrs.length; i++) {
				array[i-1] = Integer.parseInt(substrs[i]);
			}
			System.out.println(p.sumSearch(array, target));
		}
		sc.close();
	}
}
