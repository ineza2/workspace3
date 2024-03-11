package app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Position {
	
	@Id
	private int id;
	private String position;
	@OneToOne(mappedBy="position")
	private Department department;
	
	
	public Position() {
		super();
	}


	public int getId() {
		return id;
	}

	
	public Position(String position) {
		super();
		this.position = position;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	

}
