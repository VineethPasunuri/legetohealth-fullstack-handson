package Day2Assessment;

public class Test_EP {

	public static void main(String[] args) {
		Employee e = new Employee(11, "Raj", "Male", 23000);
		print(e);
		System.out.println("-------------------------------------");
		Student s = new Student("Kumar", "Male", 108, 'A');
		print(s);
		System.out.println("-----------------------------------------");
		Customer c = new Customer(123, 112233, 20000, "Ronith", "Male");
		print(c);
	}

	public static void print(Person p) {
		p.display();
	}

}