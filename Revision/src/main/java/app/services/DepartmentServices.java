package app.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import app.models.Department;
import app.utils.HibernateUtil;

public class DepartmentServices {
	
	public static DepartmentServices departmentServices;
	protected static SessionFactory sf= HibernateUtil.getSessionFactory();
	protected static Session session;
	
	private DepartmentServices() {}
	
	public static DepartmentServices getInstance() {
		if(departmentServices==null) {
			return new DepartmentServices();
	}
		return null;
	}
	
	public void addDepartment(Department dp) {
		
		session=sf.openSession();
		session.beginTransaction();
		session.save(dp);
		session.getTransaction().commit();
		}
	
//	public List<Employee> getAllEmployees(){
//		session=sf.openSession();
//		Query q=session.createQuery("from Employee");
//		List<Employee> employees=q.list();
//		return employees;
//		
//	}
	
	public Department getDepartmentById(int id) {
		session=sf.openSession();
		Department dpt=session.load(Department.class, id);
		return dpt;
	}

}
