package Day2Assessment;

public class Student_Final {
	private int id;
	private String name;
	private String city;
	private int m1;
	private int m2;
	private int m3;
	private int feePerMonth;
	private boolean isEligibleForScholarship;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public float getFeePerMonth() {
		return feePerMonth;
	}

	public void setFeePerMonth(int feePerMonth) {
		this.feePerMonth = feePerMonth;
	}

	public boolean isEligibleForScholarship() {
		return isEligibleForScholarship;
	}

	public void setEligibleForScholarship(boolean isEligibleForScholarship) {
		this.isEligibleForScholarship = isEligibleForScholarship;
	}

	public int getAnnualFee() {
		return feePerMonth * 12;
	}

	public int getTotalMarks() {
		return m1 + m2 + m3;
	}

	public float getAverage() {
		float average = (m1 + m2 + m3) / 3;

		return average;
	}

	public String getResult() {
		if (m1 >= 60 && m2 >= 60 && m3 >= 60)
			return "PASS";
		else
			return "FAIL";
	}

	public String isEligible() {
		if (isEligibleForScholarship == true)
			return "Scholarship Available";
		else
			return "Scholarship Not Available";
	}

	public Student_Final(int id, String name, String city, int m1, int m2, int m3, int feePerMonth,
			boolean isEligibleForScholarship) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.feePerMonth = feePerMonth;
		this.isEligibleForScholarship = isEligibleForScholarship;
	}

	@Override
	public String toString() {
		return "Student_name= " + name + ", Average Marks= " + getAverage() + ", Result= " + getResult() + " ,"
				+ isEligible();
	}

}
