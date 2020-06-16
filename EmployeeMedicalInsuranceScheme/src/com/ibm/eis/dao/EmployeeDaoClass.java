package com.ibm.eis.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.*;

public class EmployeeDaoClass implements EmployeeDao {
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	@Override
	public void store(Employee employee){
		 employees.add(employee);
		 System.out.println("Employee details added successfully");
		 System.out.println(employees);
	}
	@Override
	public String findInsuranceScheme(Integer salary, String designation){
		
		if(salary>5000 && salary<20000 && designation.compareTo("System Associate")==0) {
			return "Scheme C";
		}
		else if(salary>=20000 && salary<40000 && designation.compareTo("Programmer")==0) {
			return "Scheme B";
		}
		else if(salary>=40000 && designation.compareTo("Manager")==0) {
			return "Scheme C";
		}
		else if(salary<5000 && designation.compareTo("Clerk")==0) {
			return "No Scheme";
		}
		else {
			return "Invalid";
		}
		
	}
	
	public ArrayList<Employee> display() {
		System.out.println("Into the display method of DAO class");
		return employees;
	}

}
