package com.ibm.eis.bean;

public class Employee {
	
	private Integer id,salary;
	private String name,designation,insurancescheme;
	
	
	

	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public Integer getSalary() {
		return salary;
	}




	public void setSalary(Integer salary) {
		this.salary = salary;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDesignation() {
		return designation;
	}




	public void setDesignation(String designation) {
		this.designation = designation;
	}




	public String getInsurancescheme() {
		return insurancescheme;
	}




	public void setInsurancescheme(String insurancescheme) {
		this.insurancescheme = insurancescheme;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id +", designation="+ designation+", salary="+salary+"]";
	}

	

}
