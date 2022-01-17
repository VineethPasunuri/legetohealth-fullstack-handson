package com.org.ui;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.examples.beans.Employee;
import com.examples.dao.DBUtil;
import com.examples.dao.EmployeeDao;
import com.examples.dao.EmployeeDaoImpl;
import com.examples.exceptions.EmployeeNotFoundException;
import com.examples.factory.ObjectFactory;

public class MainViewController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		// creating DAO instance, we must have used interface here
//		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		EmployeeDao dao = ObjectFactory.getInstance();
		do {
			System.out.println("Enter below options to perform CRUD operations");
			System.out.println("1: Store employee, 2: Fetch all employees");
			System.out.println("3: Fetch employee by id, 4: Delete employee by id");
			System.out.println("5: Update employee salary by id, -1: Exit");
			option = scan.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter name");
				String name = scan.next();
				System.out.println("Enter salary");
				double salary = scan.nextDouble();
				Employee employee = new Employee(0, name, salary); // 0 will never be stored because of auto_increment
				int status = dao.store(employee);
				if (status == -1) {
					System.err.println("Employee failed to store");
				} else {
					System.out.println("Employee stored");
				}
				break;
			case 2:
				List<Employee> employeesList = new ArrayList<Employee>();
				employeesList = dao.findAll();
				for (Employee emp : employeesList)
					System.out.println(emp);
				break;
			case 3:
				System.out.println("Enter id");
				int id = scan.nextInt();
				// if findById throws an exception we can print that in the catch block
				try {
					employee = dao.findById(id);
					System.out.println(employee);
				} catch (EmployeeNotFoundException e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter id to delete the record");
				int did = scan.nextInt();
				try {
					dao.delete(did);
				} catch (EmployeeNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				break;
			case 5:
				System.out.println("Enter id");
				int eid = scan.nextInt();
				System.out.println("Enter salary to be Updated");
				double esalary = scan.nextDouble();
				try {
					dao.update(eid, esalary);
				} catch (EmployeeNotFoundException e) {
					System.err.println("Error : " + e.getMessage());
				}
				break;
			case -1:
				System.out.println("Exited");
				break;
			default:
				System.out.println("Entered a wrong input");
			}

		} while (option != -1);

		scan.close();
	}

}
