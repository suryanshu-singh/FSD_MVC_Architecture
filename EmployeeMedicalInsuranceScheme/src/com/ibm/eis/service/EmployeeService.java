package com.ibm.eis.service;
import java.util.ArrayList;

import java.util.Map;

import com.ibm.eis.bean.Employee;


public interface EmployeeService {
	
	
	//public void inputFromUser();
	public void store(Employee employee);
	public String findInsuranceScheme(Integer salary, String designation);
	public ArrayList<Employee> display();
	

}
