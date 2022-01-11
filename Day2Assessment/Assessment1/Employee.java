package Day2Assessment;

public class Employee extends Person {
	private int emp_Id;
	private double salary;

	public Employee(int emp_Id, String name, String gender, double salary) {
		super(name, gender);
		this.emp_Id = emp_Id;
		this.salary = salary;
		// System.out.println("Employee(int, string, string, int) constructor");

	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Employee ID :" + emp_Id + ", Salary :" + salary);
	}

}
