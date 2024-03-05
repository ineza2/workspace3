package app.services;

import app.models.Employee;

public class Program {
	public static void main(String []args ) {
		EmployeeServices services= EmployeeServices.getInstance();
		Employee emp=new Employee("Muhire", "mike", "mike@gmail.com", "Student", "07885312692");
		services.addEmployee(emp);
		
	}
}

 