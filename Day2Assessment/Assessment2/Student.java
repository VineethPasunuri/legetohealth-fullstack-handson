package Day2Assessment;

public class Student extends Person {

	private int rollNo;
	private char grade;

	public Student(String name, String gender, int rollNo, char grade) {
		super(name, gender);
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public void display() {
		super.display();
		System.out.print("RollNo :" + rollNo + ", Grade :" + grade);
	}
}

