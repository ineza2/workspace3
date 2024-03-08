package app.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Salary {
	
	@Id
	private int id;
	private String name;
	private int salary;
	
	@OneToOne(mappedBy="salary")
	private Employee employee;
	
	public Salary(int salary) {
		super();
		this.salary = salary;
	}

//	public getEmployees() {
//		return employees;
//	}
//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Salary() {
		super();
	}
	
	
	

}
