package app.services;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import app.models.Employee;
import app.utils.HibernateUtil;


public class EmployeeServices {

	public static EmployeeServices employeeServices;
	protected static SessionFactory sf= HibernateUtil.getSessionFactory();
	protected static Session session;
	
	private EmployeeServices() {}
	
	public static EmployeeServices getInstance() {
		if(employeeServices==null) {
			return new EmployeeServices();
	}
		return null;
	}
	
	public void addEmployee(Employee emp) {
		
		session=sf.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		}
	
	public List<Employee> getAllEmployees(){
		session=sf.openSession();
		Query q=session.createQuery("from Employee");
		List<Employee> employees=q.list();
		return employees;
		
	}
}
