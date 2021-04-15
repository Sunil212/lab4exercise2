package com.cg.eis.pl;


import com.cg.eis.service.EmployeeService;

public class EmployeeApp {
	public static void main(String[] args) {
		EmployeeService s = new EmployeeService();
		s.getUserInfo();
		s.getInsuranceScheme();
		s.displayUserInfo();
		
	}

}
