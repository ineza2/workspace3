package app.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import app.models.Projects;
import app.utils.HibernateUtil;

public class ProjectsServices {

	
	public static ProjectsServices projectsServices;
	protected static SessionFactory sf= HibernateUtil.getSessionFactory();
	protected static Session session;
	
	private ProjectsServices() {}
	
	public static ProjectsServices getInstance() {
		if(projectsServices==null) {
			return new ProjectsServices();
	}
		return null;
	}
	
	public void addProjects(Projects proj) {
		
		session=sf.openSession();
		session.beginTransaction();
		session.save(proj);
		session.getTransaction().commit();
		}
	
//	public List<Employee> getAllEmployees(){
//		session=sf.openSession();
//		Query q=session.createQuery("from Employee");
//		List<Employee> employees=q.list();
//		return employees;
//		
//	}
	
	public Projects getProjectsById(int id) {
		session=sf.openSession();
		Projects dpt=session.load(Projects.class, id);
		return dpt;
	}

	
}
