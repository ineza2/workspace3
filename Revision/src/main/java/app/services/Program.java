package app.services;

import app.models.Department;
import app.models.Employee;

public class Program {
	public static void main(String []args ) {
		DepartmentServices ds= DepartmentServices.getInstance();
		Department d1= new Department("Software Engineer");
		ds.addDepartment(d1);
		Department saved=ds.getDepartmentById(0);
		EmployeeServices services= EmployeeServices.getInstance();
		Employee emp=new Employee("Muhire", "mike", "mike@gmail.com", "Student", "07885312692", saved);
		services.addEmployee(emp);
	}
}

 