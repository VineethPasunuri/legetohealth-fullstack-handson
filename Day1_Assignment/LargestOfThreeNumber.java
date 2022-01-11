package Day1_Assignment;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		int n1 = 45;
		int n2 = 34;
		int n3 = 21;
		System.out.println(largest(n1, n2, n3));

	}

	public static int largest(int n1, int n2, int n3) {
		int max = n1;
		if (n2 > max)
			max = n2;
		if (n3 > max)
			max = n3;
		return max;

	}

}
