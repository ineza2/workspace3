package app.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import app.models.Position;
import app.utils.HibernateUtil;

public class PositionServices {
	
	public static PositionServices positionServices;
	protected static SessionFactory sf= HibernateUtil.getSessionFactory();
	protected static Session session;
	
	private PositionServices() {}
	
	public static PositionServices getInstance() {
		if(positionServices==null) {
			return new PositionServices();
	}
		return null;
	}
	
	public void addPosition(Position pos) {
		
		session=sf.openSession();
		session.beginTransaction();
		session.save(pos);
		session.getTransaction().commit();
		}
	
//	public List<Employee> getAllEmployees(){
//		session=sf.openSession();
//		Query q=session.createQuery("from Employee");
//		List<Employee> employees=q.list();
//		return employees;
//		
//	}
	
	public Position getPositionById(int id) {
		session=sf.openSession();
		Position posi=session.load(Position.class, id);
		return posi;
	}

}
