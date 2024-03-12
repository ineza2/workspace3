package app.models;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Department {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy="department")
	private List<Employee> employees;
	
	@OneToOne
	private Position position;
	
	@OneToOne
	private Projects projects;
	
	
	
	public Department(int id, String name, List<Employee> employees, Position position, Projects projects) {
		super();
		this.id = id;
		this.name = name;
		this.employees = employees;
		this.position = position;
		this.projects = projects;
	}
	
	public Department(String name) {
		super();
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
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
	public Department() {
		super();
	}
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Projects getProjects() {
		return projects;
	}
	public void setProjects(Projects projects) {
		this.projects = projects;
	}
	
	
}
