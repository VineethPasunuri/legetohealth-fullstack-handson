package Day1_Assignment;

import java.util.Arrays;

public class SumOfLargestandSmallestOfThreeNumbers {

	public static void main(String[] args) {
		System.out.println(sum(6, 11, 2));
	}

	public static int sum(int n1, int n2, int n3) {
		//code using Arrays
		int[] numbers= {n1,n2,n3};
		Arrays.sort(numbers);
		return numbers[0]+numbers[numbers.length-1];
		//code without using Arrays
		/*
		 * int max = n1; if (n2 > max) max = n2; if (n3 > max) max = n3; int min = n1;
		 * if (n2 < min) min = n2; if (n3 < min) min = n3;
		 * 
		 * return max + min;
		 */

	}

}
