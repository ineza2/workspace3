package app.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import app.models.Salary;
import app.utils.HibernateUtil;

public class SalaryServices {

	public static SalaryServices salaryServices;
	protected static SessionFactory sf= HibernateUtil.getSessionFactory();
	protected static Session session;
	
	private SalaryServices() {}
	
	public static SalaryServices getInstance() {
		if(salaryServices==null) {
			return new SalaryServices();
	}
		return null;
	}
	
	public void addSalary(Salary sal) {
		
		session=sf.openSession();
		session.beginTransaction();
		session.save(sal);
		session.getTransaction().commit();
		}
	
//	public List<Employee> getAllEmployees(){
//		session=sf.openSession();
//		Query q=session.createQuery("from Employee");
//		List<Employee> employees=q.list();
//		return employees;
//		
//	}
	
	public Salary getSalaryById(int id) {
		session=sf.openSession();
		Salary sala=session.load(Salary.class, id);
		return sala;
	}

}
