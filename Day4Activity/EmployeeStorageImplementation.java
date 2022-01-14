package Day4;

import java.util.ArrayList;

public class EmployeeStorageImplementation implements EmployeeStorage {
	ArrayList<Employee> al;
	static int count = 0;

	public EmployeeStorageImplementation() {
		super();
		al = new ArrayList<Employee>();

	}

	@Override
	public int save(Employee e) {
		al.add(e);
		System.out.println(e);
		return e.geteID();
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFound {
		Employee e1 = null;
		int count = 0;
		for (Employee e : al) {
			if (id == e.geteID()) {
				return e1 = new Employee(e.geteID(), e.getName(), e.getSalary());
			} else
				count++;
		}
		if (count == al.size())
			throw new EmployeeNotFound("Employee is not present with id=" + id);
		return e1;
	}

	@Override
	public Employee[] findEmployees() {
		Employee[] e1 = al.toArray(new Employee[al.size()]);
		return e1;
	}

	@Override
	public void delete(int id) throws EmployeeNotFound {
		if (al.size() == 0) {
			System.out.println("Employee list is empty");
		} else {
			for (Employee e : al) {
				if (id == e.geteID()) {
					System.out.println(e + "is removed from Employee List");
					al.remove(e);
					count--;
					break;
				} else
					count++;
			}

		}
		if (count == al.size())
			throw new EmployeeNotFound();

	}

}
