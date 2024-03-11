package app.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Salary {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int amount;
	    
	@OneToOne(mappedBy="salary")
	private Employee employee;
	 
	public Salary(int amount) {
		super();
		this.amount = amount;
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

	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Salary() {
		super();
	}
	
	
	

}
