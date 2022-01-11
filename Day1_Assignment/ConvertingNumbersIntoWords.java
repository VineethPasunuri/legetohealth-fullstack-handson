package Day1_Assignment;

public class ConvertingNumbersIntoWords {

	public static void main(String[] args) {
		convert(7, 5, 9);

	}

	public static void convert(int n1, int n2, int n3) {
		int[] num = { n1, n2, n3 };
		/*
		 * for (int i = 0; i < num.length; i++) { System.out.println(num[i]);
		 * word(num[i]); } public static void word(int num) {
		 * 
		 * }
		 */
		for (int i = 0; i < num.length; i++) {
			switch (num[i]) {
			case 0:
				System.out.print("Zero ");
				break;
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;

			}
		}
	}

}
