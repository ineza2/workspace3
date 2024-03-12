package app.services;

import app.models.Department;
import app.models.Employee;
import app.models.Position;
import app.models.Projects;
import app.models.Salary;

public class Program {
	public static void main(String []args ) {
		
		SalaryServices ss=SalaryServices.getInstance();
		Salary s1= new Salary(100000);
		ss.addSalary(s1);
		Salary savedSalary=ss.getSalaryById(1);
		
		PositionServices pp=PositionServices.getInstance();
		Position p1= new Position("Accountant");
		pp.addPosition(p1);
		Position savedPosition=pp.getPositionById(0);
		
		DepartmentServices ds= DepartmentServices.getInstance();
		Department d1= new Department("Software Engineer");
		ds.addDepartment(d1);
		Department savedDepartment = ds.getDepartmentById(0);

		ProjectsServices pro = ProjectsServices.getInstance();
//		Projects proj1 = new Projects(1, "SpeedSense", savedDepartment);
		Projects proj1 = new Projects("SpeedSense");
		pro.addProjects(proj1);
		Projects savedProjects = pro.getProjectsById(0); // Corrected variable name

		
		EmployeeServices services= EmployeeServices.getInstance();
		Employee emp=new Employee("Muhire", "mike","mike@gmail.com","Student", "07885312692", savedDepartment,savedProjects ,savedSalary, savedPosition);
		services.addEmployee(emp);
	}
}

 