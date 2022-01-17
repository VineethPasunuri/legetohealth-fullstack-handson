package com.examples.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.examples.beans.Employee;
import com.examples.exceptions.EmployeeNotFoundException;

// performs CRUD operations for Employee 
public class EmployeeDaoImpl implements EmployeeDao {
	// store method to store employee data like name & salary
	public int store(Employee employee) {
		int status = -1;
		try {
			// 1st & 2nd step is done by DBUtil.getConnection()
			Connection connection = DBUtil.getConnection();
			// 3rd step is to prepare the statement
			String query = "insert into employee(name, salary) values(?, ?)";
			PreparedStatement statement = connection.prepareStatement(query);
			// update the ? by setting values
			statement.setString(1, employee.getEmpName()); // sets name of employee to 1st ?
			statement.setDouble(2, employee.getEmpSalary()); // sets salary of employee to 2nd ?
			// now the query is ready with values, so you can execute using executeUpdate()
			status = statement.executeUpdate(); // returns number of rows affected
			// closing the resources
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	public Employee findById(int empId) throws EmployeeNotFoundException {
		Employee employee = null;
		try {
			Connection connection = DBUtil.getConnection();
			String query = "select * from employee where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, empId);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				employee = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
			}
			result.close();
			statement.close();
			connection.close();
			if (employee == null) {
				// throw checked exception & propagate to caller
				throw new EmployeeNotFoundException("Sorry, " + empId + " not found");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		// Employee employee
		List<Employee> employeesList = new ArrayList<Employee>();
		try {
			Connection connection = DBUtil.getConnection();
			String query = "select id, name, salary from employee";
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery(query);
			while (resultset.next()) {
				Employee employee = new Employee(resultset.getInt(1), resultset.getString(2), resultset.getDouble(3));
				employeesList.add(employee);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeesList;
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		try {
			int status = -1;
			Connection connection = DBUtil.getConnection();
			String query = "delete from employee  where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			status = statement.executeUpdate();
			// System.out.println(status);

			statement.close();
			connection.close();
			if (status == 0) {
				throw new EmployeeNotFoundException("Employee with id=" + id + "Not present");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, double salary) throws EmployeeNotFoundException {
		// Employee employee = null;
		try {
			int status = -1;
			Connection connection = DBUtil.getConnection();
			String query = "update employee set salary = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setDouble(1, salary);
			statement.setInt(2, id);
			status = statement.executeUpdate();
			// System.out.println(status);

			statement.close();
			connection.close();
			if (status == 0) {
				throw new EmployeeNotFoundException("Employee with id=" + id + "Not present");
			}
			// System.out.println(status);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
