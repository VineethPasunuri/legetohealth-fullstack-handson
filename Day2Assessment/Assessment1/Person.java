package Day2Assessment;

public class Person {
	private String name;
	private String gender;

	public Person(String name, String gender) {
		// super();
		this.name = name;
		this.gender = gender;
		// System.out.println("Person(String, String)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

//	public void printInfo() {
//		System.out.println("PrintInfo() inside Person");
//		System.out.println("Person name: " + name + ", gender : " + gender);
//	}

	public void display() {
		System.out.println("Name :" + name + ", gender :" + gender);
	}

}
