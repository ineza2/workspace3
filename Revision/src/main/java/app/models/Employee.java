package app.models;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="fname", nullable=false, length=200)
	private String firstName;
	private String lastName;
	@Column(name="email", nullable=false, length=200, unique=true)
	private String email;
	private String work;
	private String mobile;
	@ManyToOne
	private Department department;
	@ManyToOne
	private Projects projects;
	@OneToOne
	private Salary salary;
	@OneToOne
	private Position position;
	
	
	
	
	public Employee(int id, String firstName, String lastName, String email, String work, String mobile,
			Department department, Projects projects, Salary salary, Position position) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.work = work;
		this.mobile = mobile;
		this.department = department;
		this.projects = projects;
		this.salary = salary;
		this.position = position;
	}

	public Employee(String firstName, String lastName, String email, String work, String mobile, Department department, Projects projects ,Salary salary, Position position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.work = work;
		this.mobile = mobile;
		this.department=department;
		this.projects=projects;
		this.salary=salary;
		this.position = position;
	}
//
//	public Employee(int id, String firstName, String lastName, String email, String work, String mobile,
//			Department department, Salary salary, Position position) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.work = work;
//		this.mobile = mobile;
//		this.department = department;
//		this.salary = salary;
//		this.position = position;
//	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Employee() {
		super();
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	
	

	
}
