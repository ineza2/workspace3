package app.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Projects {
	
	@Id
	private int id;
	private String projects;
	
	@OneToOne(mappedBy="projects")
	private Department department;
	
	@OneToMany(mappedBy="projects")
	private List<Employee> employees;
	

	public Projects() {
		super();
	}
	
	

	public Projects(String projects) {
		super();
		this.projects = projects;
	}



	public Projects(String projects, Department department) {
		super();
		this.projects = projects;
		this.department = department;
	}



	public Projects(int id, String projects, Department department) {
		super();
		this.id = id;
		this.projects = projects;
		this.department = department;
	}


	public Projects(int id, String projects, Department department, List<Employee> employees) {
		super();
		this.id = id;
		this.projects = projects;
		this.department = department;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	

}
