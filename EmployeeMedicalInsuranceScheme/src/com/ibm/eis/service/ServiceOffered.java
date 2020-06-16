package com.ibm.eis.service;
import java.util.Map;
import java.util.Scanner;
import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.EmployeeDaoClass;
import java.util.ArrayList;


public class ServiceOffered implements EmployeeService {
	EmployeeDaoClass dao = new EmployeeDaoClass();
	
	//public ArrayList<Employee> employees = new ArrayList<Employee>();
	//@Override
//	public void inputFromUser() {
//		dao.inputFromUser();
//		
//		
//		
//	}
	@Override
	public void store(Employee employee) {
		dao.store(employee);
		
	}
	@Override
	public String findInsuranceScheme(Integer salary, String designation) {
		return dao.findInsuranceScheme(salary,designation);
		
	}
	@Override
	public ArrayList<Employee> display() {
		return dao.display();
		
	}

}
