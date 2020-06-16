package com.ibm.eis.ui;
import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome To Employee Medical Insurance Scheme:");
		EmployeeService service= new ServiceOffered();
		while(true) {
			Employee e = new Employee();
			System.out.println("1. Enter the details:");
			System.out.println("2. Display details:");
			System.out.println("3. Find Scheme:");
			Integer input= scan.nextInt();
			switch(input) {
			case 1:	
					//Scanner scan = new Scanner(System.in);
					System.out.println("Enter the id:");
					e.setId(scan.nextInt());
					scan.nextLine();
					System.out.println("Enter the name:");
					e.setName(scan.nextLine());
					System.out.println("Enter the designation:");
					e.setDesignation(scan.nextLine());
					System.out.println("Enter the salary:");
					e.setSalary(scan.nextInt());
					service.store(e);
					//service.display();
					break;
			case 2:
					System.out.println(service.display());
					break;
			
			case 3:
					System.out.println("Enter salary to find the scheme:");
					Integer sal=scan.nextInt();
					scan.nextLine();
					System.out.println("Enter the designation:");
					String des= scan.nextLine();
					System.out.println(service.findInsuranceScheme(sal,des));
					break;
			default:
					System.out.println("Invalid input");
			}	
		}
	}

}
