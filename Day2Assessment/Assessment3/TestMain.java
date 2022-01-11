package Day2Assessment;

public class TestMain {

	public static void main(String[] args) {
		Student_Final s1 = new Student_Final(11, "Raj", "Warangal", 59, 78, 84, 5000, false);
		Student_Final s2 = new Student_Final(12, "Ronith", "Warangal", 98, 78, 84, 8000, true);
		Student_Final s3 = new Student_Final(13, "Vineeth", "Warangal", 44, 78, 84, 7000, false);
		System.out.println(highestTotalOfMarks(s1, s2, s3));
		System.out.println("----------------------------------------------------------");
		System.out.println(lowestFeePayer(s1, s2, s3));
		System.out.println("----------------------------------------------------------");
		System.out.println(s1);
		System.out.println("----------------------------------------------------------");
		System.out.println(s2);
		System.out.println("----------------------------------------------------------");
		System.out.println(s3);

	}

	public static String highestTotalOfMarks(Student_Final s1, Student_Final s2, Student_Final s3) {
		// int highestMarks=s1.getTotalMarks();
		if (s1.getTotalMarks() > s2.getTotalMarks() && s1.getTotalMarks() > s3.getTotalMarks())
			return "Highest Marks Student is :" + s1.getName();
		else if (s2.getTotalMarks() > s1.getTotalMarks() && s2.getTotalMarks() > s1.getTotalMarks())
			return "Highest Marks Student is :" + s2.getName();
		else
			return "Highest Marks Student is :" + s3.getName();
	}

	public static String lowestFeePayer(Student_Final s1, Student_Final s2, Student_Final s3) {
		// int highestMarks=s1.getTotalMarks();
		if (s1.getAnnualFee() < s2.getAnnualFee() && s1.getAnnualFee() < s3.getAnnualFee())
			return s1.getName() + " Pays the lowest Fee of Rupees : " + s1.getAnnualFee();
		else if (s2.getAnnualFee() < s1.getAnnualFee() && s2.getAnnualFee() < s1.getAnnualFee())
			return s2.getName() + " Pays the lowest Fee of Rupees : " + s2.getAnnualFee();
		else
			return s3.getName() + " Pays the lowest Fee of Rupees : " + s3.getAnnualFee();
	}

}
