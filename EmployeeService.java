package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bin.Employee;

public class EmployeeService implements Service {
	
	Employee es = new Employee();
	Scanner sc =new Scanner(System.in);

	@Override
	public void getUserInfo() {
		
		System.out.println("enter emp id");
		es.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("enter the name");
		es.setName(sc.nextLine());
		System.out.println("enter salary");
		es.setSalary(Double.parseDouble(sc.nextLine()));
		System.out.println("enter designation");
		es.setDesg(sc.nextLine());
		
	}

	@Override
	public void getInsuranceScheme() {
	if (es.getDesg().equals("manager")||es.getDesg().equals("hr"))
		{
		es.setInsuranceSch("the scheme is monthly");
		}
	else if (es.getDesg().equals("project manager")||es.getDesg().equals("guide"));
	{
		es.setInsuranceSch("the scheme is yearly");
	}
		
	}

	@Override
	public void displayUserInfo() {
		System.out.println("employee name  "+es.getName());
		System.out.println("emplyee id  "+es.getId());
		System.out.println("employee salary  "+es.getSalary());
		System.out.println("employee designation  "+es.getDesg());
		System.out.println("employee insurance  "+es.getInsuranceSch());
		
	}
	

}
