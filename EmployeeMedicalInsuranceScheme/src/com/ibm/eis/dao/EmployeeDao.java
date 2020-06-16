package com.ibm.eis.dao;


import java.util.ArrayList;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.ServiceOffered;

public interface EmployeeDao {
	
	//public void inputFromUser();
	public void store(Employee employee);
	public String findInsuranceScheme(Integer salary, String designation);
	public ArrayList<Employee> display();

}
